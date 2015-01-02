
package org.nist.randomness.beacon.marshalling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.nist.randomness.beacon.Record;

/**
 * A type for a single record. This was generated off https://beacon.nist.gov/record/0.1/beacon-0.1.0.xsd
 * 
 * <p>
 * Java class for recordType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="seedValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="previousOutputValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signatureValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outputValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordType", propOrder = { "version", "frequency", "timeStamp", "seedValue", "previousOutputValue",
        "signatureValue", "outputValue", "statusCode" })
public class RecordType implements Record {

    @XmlElement(required = true)
    protected String version;
    protected int frequency;
    protected long timeStamp;
    @XmlElement(required = true)
    protected String seedValue;
    @XmlElement(required = true)
    protected String previousOutputValue;
    @XmlElement(required = true)
    protected String signatureValue;
    @XmlElement(required = true)
    protected String outputValue;
    @XmlElement(required = true)
    protected String statusCode;

    /**
     * Gets the value of the version property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     */
    public void setFrequency(int value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     */
    public void setTimeStamp(long value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the seedValue property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSeed() {
        return seedValue;
    }

    /**
     * Sets the value of the seedValue property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSeedValue(String value) {
        this.seedValue = value;
    }

    /**
     * Gets the value of the previousOutputValue property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPreviousOutput() {
        return previousOutputValue;
    }

    /**
     * Sets the value of the previousOutputValue property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setPreviousOutputValue(String value) {
        this.previousOutputValue = value;
    }

    /**
     * Gets the value of the signatureValue property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSignature() {
        return signatureValue;
    }

    /**
     * Sets the value of the signatureValue property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSignatureValue(String value) {
        this.signatureValue = value;
    }

    /**
     * Gets the value of the outputValue property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOutput() {
        return outputValue;
    }

    /**
     * Sets the value of the outputValue property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setOutputValue(String value) {
        this.outputValue = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

}
