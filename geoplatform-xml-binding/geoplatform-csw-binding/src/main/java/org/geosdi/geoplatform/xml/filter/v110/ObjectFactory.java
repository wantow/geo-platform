//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.18 at 12:36:36 PM CEST 
//


package org.geosdi.geoplatform.xml.filter.v110;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.geosdi.geoplatform.xml.filter.v110 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SortBy_QNAME = new QName("http://www.opengis.net/ogc", "SortBy");
    private final static QName _Filter_QNAME = new QName("http://www.opengis.net/ogc", "Filter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.geosdi.geoplatform.xml.filter.v110
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "SortBy")
    public JAXBElement<SortByType> createSortBy(SortByType value) {
        return new JAXBElement<SortByType>(_SortBy_QNAME, SortByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ogc", name = "Filter")
    public JAXBElement<FilterType> createFilter(FilterType value) {
        return new JAXBElement<FilterType>(_Filter_QNAME, FilterType.class, null, value);
    }

}
