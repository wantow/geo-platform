//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.18 at 03:12:11 PM CEST 
//


package org.geosdi.geoplatform.xml.iso19139v20070417.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139v20070417.gco.AbstractObjectType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for PT_FreeText_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PT_FreeText_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="textGroup" type="{http://www.isotc211.org/2005/gmd}LocalisedCharacterString_PropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PT_FreeText_Type", propOrder = {
    "textGroup"
})
public class PTFreeTextType
    extends AbstractObjectType
    implements ToString
{

    @XmlElement(required = true)
    protected List<LocalisedCharacterStringPropertyType> textGroup;

    /**
     * Gets the value of the textGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalisedCharacterStringPropertyType }
     * 
     * 
     */
    public List<LocalisedCharacterStringPropertyType> getTextGroup() {
        if (textGroup == null) {
            textGroup = new ArrayList<LocalisedCharacterStringPropertyType>();
        }
        return this.textGroup;
    }

    public boolean isSetTextGroup() {
        return ((this.textGroup!= null)&&(!this.textGroup.isEmpty()));
    }

    public void unsetTextGroup() {
        this.textGroup = null;
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
            List<LocalisedCharacterStringPropertyType> theTextGroup;
            theTextGroup = (this.isSetTextGroup()?this.getTextGroup():null);
            strategy.appendField(locator, this, "textGroup", buffer, theTextGroup);
        }
        return buffer;
    }

    public void setTextGroup(List<LocalisedCharacterStringPropertyType> value) {
        this.textGroup = null;
        List<LocalisedCharacterStringPropertyType> draftl = this.getTextGroup();
        draftl.addAll(value);
    }

}