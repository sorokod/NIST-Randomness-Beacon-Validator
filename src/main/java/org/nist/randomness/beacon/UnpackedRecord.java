package org.nist.randomness.beacon;

import java.nio.ByteBuffer;

import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;

/**
 * A Record implementation that adds various xxxAsBytes() methods to the Record interface
 * 
 * @author David Soroko
 *
 */
public class UnpackedRecord implements Record {

    private Record record;

    public UnpackedRecord(final Record record) {
        this.record = record;
    }

    @Override
    public String getVersion() {
        return record.getVersion();
    }

    @Override
    public int getFrequency() {
        return record.getFrequency();
    }

    public byte[] getFrequencyAsBytes() {
        return ByteBuffer.allocate(4).putInt(getFrequency()).array();
    }

    @Override
    public long getTimeStamp() {
        return record.getTimeStamp();
    }

    public byte[] getTimeStampAsBytes() {
        return ByteBuffer.allocate(8).putLong(getTimeStamp()).array();
    }

    @Override
    public String getSeed() {
        return record.getSeed();
    }

    public byte[] getSeedAsBytes() {
        return ByteUtils.fromHexString(getSeed());
    }

    @Override
    public String getPreviousOutput() {
        return record.getPreviousOutput();
    }

    public byte[] getPreviousOutputAsBytes() {
        return ByteUtils.fromHexString(getPreviousOutput());
    }

    @Override
    public String getSignature() {
        return record.getSignature();
    }

    public byte[] getSignatureAsBytes() {
        return ByteUtils.fromHexString(getSignature());
    }

    @Override
    public String getOutput() {
        return record.getOutput();
    }

    public byte[] getOutputAsBytes() {
        return ByteUtils.fromHexString(getOutput());
    }

    @Override
    public String getStatusCode() {
        return record.getStatusCode();
    }

    public byte[] getStatusCodeAsBytes() {
        return ByteBuffer.allocate(4).putInt(Integer.parseInt(getStatusCode())).array();
    }
}
