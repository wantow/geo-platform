//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.17 at 10:27:36 PM CEST 
//


package org.geosdi.geoplatform.xml.gml.v311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * A MultiSolid is defined by one or more Solids, referenced through solidMember elements.
 * 
 * <p>Java class for MultiSolidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSolidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeometricAggregateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}solidMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}solidMembers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "MultiSolid")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSolidType", propOrder = {
    "solidMember",
    "solidMembers"
})
public class MultiSolidType
    extends AbstractGeometricAggregateType
    implements ToString
{

    protected List<SolidPropertyType> solidMember;
    protected SolidArrayPropertyType solidMembers;

    /**
     * Gets the value of the solidMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solidMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolidMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolidPropertyType }
     * 
     * 
     */
    public List<SolidPropertyType> getSolidMember() {
        if (solidMember == null) {
            solidMember = new ArrayList<SolidPropertyType>();
        }
        return this.solidMember;
    }

    public boolean isSetSolidMember() {
        return ((this.solidMember!= null)&&(!this.solidMember.isEmpty()));
    }

    public void unsetSolidMember() {
        this.solidMember = null;
    }

    /**
     * Gets the value of the solidMembers property.
     * 
     * @return
     *     possible object is
     *     {@link SolidArrayPropertyType }
     *     
     */
    public SolidArrayPropertyType getSolidMembers() {
        return solidMembers;
    }

    /**
     * Sets the value of the solidMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidArrayPropertyType }
     *     
     */
    public void setSolidMembers(SolidArrayPropertyType value) {
        this.solidMembers = value;
    }

    public boolean isSetSolidMembers() {
        return (this.solidMembers!= null);
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
            List<SolidPropertyType> theSolidMember;
            theSolidMember = (this.isSetSolidMember()?this.getSolidMember():null);
            strategy.appendField(locator, this, "solidMember", buffer, theSolidMember);
        }
        {
            SolidArrayPropertyType theSolidMembers;
            theSolidMembers = this.getSolidMembers();
            strategy.appendField(locator, this, "solidMembers", buffer, theSolidMembers);
        }
        return buffer;
    }

    public void setSolidMember(List<SolidPropertyType> value) {
        this.solidMember = null;
        List<SolidPropertyType> draftl = this.getSolidMember();
        draftl.addAll(value);
    }

}
