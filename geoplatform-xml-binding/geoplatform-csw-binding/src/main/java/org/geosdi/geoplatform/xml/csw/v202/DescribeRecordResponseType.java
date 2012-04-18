//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.12 at 10:02:34 AM CEST 
//


package org.geosdi.geoplatform.xml.csw.v202;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * The response contains a list of matching schema components
 *          in the requested schema language.
 * 
 * <p>Java class for DescribeRecordResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeRecordResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchemaComponent" type="{http://www.opengis.net/cat/csw/2.0.2}SchemaComponentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeRecordResponseType", propOrder = {
    "schemaComponent"
})
public class DescribeRecordResponseType
    implements Serializable, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SchemaComponent")
    protected List<SchemaComponentType> schemaComponent;

    /**
     * Gets the value of the schemaComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schemaComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchemaComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchemaComponentType }
     * 
     * 
     */
    public List<SchemaComponentType> getSchemaComponent() {
        if (schemaComponent == null) {
            schemaComponent = new ArrayList<SchemaComponentType>();
        }
        return this.schemaComponent;
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
        {
            List<SchemaComponentType> theSchemaComponent;
            theSchemaComponent = (((this.schemaComponent!= null)&&(!this.schemaComponent.isEmpty()))?this.getSchemaComponent():null);
            strategy.appendField(locator, this, "schemaComponent", buffer, theSchemaComponent);
        }
        return buffer;
    }

    public void setSchemaComponent(List<SchemaComponentType> value) {
        this.schemaComponent = null;
        List<SchemaComponentType> draftl = this.getSchemaComponent();
        draftl.addAll(value);
    }

}