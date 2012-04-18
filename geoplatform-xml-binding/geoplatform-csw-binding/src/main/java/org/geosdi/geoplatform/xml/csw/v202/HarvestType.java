//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.18 at 12:36:36 PM CEST 
//


package org.geosdi.geoplatform.xml.csw.v202;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * 
 *          Requests that the catalogue attempt to harvest a resource from some 
 *          network location identified by the source URL.
 * 
 *          Source          - a URL from which the resource is retrieved
 *          ResourceType    - normally a URI that specifies the type of the resource
 *                            (DCMES v1.1) being harvested if it is known.
 *          ResourceFormat  - a media type indicating the format of the 
 *                            resource being harvested.  The default is 
 *                            "application/xml".
 *          ResponseHandler - a reference to some endpoint to which the 
 *                            response shall be forwarded when the
 *                            harvest operation has been completed
 *          HarvestInterval - an interval expressed using the ISO 8601 syntax; 
 *                            it specifies the interval between harvest 
 *                            attempts (e.g., P6M indicates an interval of 
 *                            six months).
 *          
 * 
 * <p>Java class for HarvestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HarvestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/cat/csw/2.0.2}RequestBaseType">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="ResourceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResourceFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HarvestInterval" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="ResponseHandler" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HarvestType", propOrder = {
    "source",
    "resourceType",
    "resourceFormat",
    "harvestInterval",
    "responseHandler"
})
public class HarvestType
    extends RequestBaseType
    implements ToString
{

    @XmlElement(name = "Source", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String source;
    @XmlElement(name = "ResourceType", required = true)
    protected String resourceType;
    @XmlElement(name = "ResourceFormat", defaultValue = "application/xml")
    protected String resourceFormat;
    @XmlElement(name = "HarvestInterval")
    protected Duration harvestInterval;
    @XmlElement(name = "ResponseHandler")
    @XmlSchemaType(name = "anyURI")
    protected List<String> responseHandler;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    public boolean isSetSource() {
        return (this.source!= null);
    }

    /**
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceType(String value) {
        this.resourceType = value;
    }

    public boolean isSetResourceType() {
        return (this.resourceType!= null);
    }

    /**
     * Gets the value of the resourceFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceFormat() {
        return resourceFormat;
    }

    /**
     * Sets the value of the resourceFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceFormat(String value) {
        this.resourceFormat = value;
    }

    public boolean isSetResourceFormat() {
        return (this.resourceFormat!= null);
    }

    /**
     * Gets the value of the harvestInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getHarvestInterval() {
        return harvestInterval;
    }

    /**
     * Sets the value of the harvestInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setHarvestInterval(Duration value) {
        this.harvestInterval = value;
    }

    public boolean isSetHarvestInterval() {
        return (this.harvestInterval!= null);
    }

    /**
     * Gets the value of the responseHandler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseHandler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseHandler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResponseHandler() {
        if (responseHandler == null) {
            responseHandler = new ArrayList<String>();
        }
        return this.responseHandler;
    }

    public boolean isSetResponseHandler() {
        return ((this.responseHandler!= null)&&(!this.responseHandler.isEmpty()));
    }

    public void unsetResponseHandler() {
        this.responseHandler = null;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            String theSource;
            theSource = this.getSource();
            strategy.appendField(locator, this, "source", buffer, theSource);
        }
        {
            String theResourceType;
            theResourceType = this.getResourceType();
            strategy.appendField(locator, this, "resourceType", buffer, theResourceType);
        }
        {
            String theResourceFormat;
            theResourceFormat = this.getResourceFormat();
            strategy.appendField(locator, this, "resourceFormat", buffer, theResourceFormat);
        }
        {
            Duration theHarvestInterval;
            theHarvestInterval = this.getHarvestInterval();
            strategy.appendField(locator, this, "harvestInterval", buffer, theHarvestInterval);
        }
        {
            List<String> theResponseHandler;
            theResponseHandler = (this.isSetResponseHandler()?this.getResponseHandler():null);
            strategy.appendField(locator, this, "responseHandler", buffer, theResponseHandler);
        }
        return buffer;
    }

    public void setResponseHandler(List<String> value) {
        this.responseHandler = null;
        List<String> draftl = this.getResponseHandler();
        draftl.addAll(value);
    }

}
