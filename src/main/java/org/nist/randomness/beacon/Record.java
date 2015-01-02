package org.nist.randomness.beacon;

/**
 * An interface for NIST Randomness Beacon records: https://beacon.nist.gov/home
 * 
 * @author David Soroko
 *
 */
public interface Record {
    public String getVersion();

    public int getFrequency();

    public long getTimeStamp();

    public String getSeed();

    public String getPreviousOutput();

    public String getSignature();

    public String getOutput();

    public String getStatusCode();

}
