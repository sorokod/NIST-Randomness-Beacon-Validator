package org.nist.randomness.beacon;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.BeforeClass;
import org.junit.Test;
import org.nist.randomness.beacon.marshalling.RecordType;

/**
 * 
 * @author David Soroko
 *
 */
public class LoaderTest {

    private final static URL RECORD_URL = LoaderTest.class.getResource("/1420021860.xml");
    private final static URL CERT_URL = LoaderTest.class.getResource("/beacon.cer");

    @BeforeClass
    public static void setUpProvider() {
        Security.addProvider(new BouncyCastleProvider());
    }

    @Test
    public void loadRecord() throws Exception {

        RecordType record = Loader.loadRecord(RECORD_URL);

        assertEquals("Version 1.0", record.getVersion());
        assertEquals("0", record.getStatusCode());
    }

    @Test
    public void loadCert() throws Exception {
        assertEquals("OU=Entrust Managed Services SSP CA,OU=Certification Authorities,O=Entrust,C=US",
                Loader.loadCert(CERT_URL).getIssuerX500Principal().getName());
    }

}
