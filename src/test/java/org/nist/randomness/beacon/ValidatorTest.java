package org.nist.randomness.beacon;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.URL;
import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author David Soroko
 *
 */
public class ValidatorTest {

    private final static URL RECORD_URL = ValidatorTest.class.getResource("/1420021860.xml");
    private final static URL RECORD_NEXT_URL = ValidatorTest.class.getResource("/1420021920.xml");
    private final static URL BAD_SIG_RECORD_URL = ValidatorTest.class.getResource("/1420021860-bad-sig.xml");
    private final static URL CERT_URL = ValidatorTest.class.getResource("/beacon.cer");

    private static URL NIST_CERT_URL;
    private static URL NIST_RECORD_URL;

    private static UnpackedRecord RECORD;
    private static UnpackedRecord RECORD_NEXT;

    private Validator vlad;

    @BeforeClass
    public static void beforeClass() throws Exception {

        Security.addProvider(new BouncyCastleProvider());

        NIST_CERT_URL = new URL("https://beacon.nist.gov/certificate/beacon.cer");
        NIST_RECORD_URL = new URL("https://beacon.nist.gov/rest/record/last");

        RECORD = new UnpackedRecord(Loader.loadRecord(RECORD_URL));
        RECORD_NEXT = new UnpackedRecord(Loader.loadRecord(RECORD_NEXT_URL));

    }

    @Before
    public void setUpValidator() throws Exception {
        vlad = new Validator();
        vlad.setCertificate(Loader.loadCert(CERT_URL));
    }

    @Test
    public void validSignature() throws Exception {
        assertTrue(vlad.isSignatureValid(RECORD));
    }

    @Test
    public void validOutputValue() throws Exception {
        assertTrue(vlad.isOutputValueValid(RECORD));
    }

    @Test
    public void validSignatureWithHTTPCalls() throws Exception {
        vlad.setCertificate(Loader.loadCert(NIST_CERT_URL));

        assertTrue(vlad.isSignatureValid(new UnpackedRecord(Loader.loadRecord(NIST_RECORD_URL))));
    }

    @Test
    public void validChaining() throws Exception {
        assertTrue(vlad.isChainingValid(RECORD, RECORD_NEXT));
    }

    @Test
    public void invalidChaining() throws Exception {
        assertFalse(vlad.isChainingValid(RECORD_NEXT, RECORD));
    }

    @Test
    public void invalidSignature() throws Exception {
        assertFalse(vlad.isSignatureValid(new UnpackedRecord(Loader.loadRecord(BAD_SIG_RECORD_URL))));
    }

    @Test
    public void invalidOutputValue() throws Exception {
        assertFalse(vlad.isOutputValueValid(new UnpackedRecord(Loader.loadRecord(BAD_SIG_RECORD_URL))));
    }

}
