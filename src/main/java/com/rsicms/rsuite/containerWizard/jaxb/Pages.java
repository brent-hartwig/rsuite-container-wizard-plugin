//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.06.26 at 08:39:15 AM EDT
//


package com.rsicms.rsuite.containerWizard.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.rsicms.com/rsuite/ns/conf/container-wizard}page"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.rsuitecms.com/rsuite/ns/metadata}rsuiteId"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"page"})
@XmlRootElement(name = "pages")
public class Pages {

  @XmlElement(required = true)
  protected List<Page> page;
  @XmlAttribute(name = "rsuiteId", namespace = "http://www.rsuitecms.com/rsuite/ns/metadata")
  protected String rsuiteId;

  /**
   * Gets the value of the page property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the page property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getPage().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Page }
   * 
   * 
   */
  public List<Page> getPage() {
    if (page == null) {
      page = new ArrayList<Page>();
    }
    return this.page;
  }

  /**
   * Gets the value of the rsuiteId property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getRsuiteId() {
    return rsuiteId;
  }

  /**
   * Sets the value of the rsuiteId property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setRsuiteId(String value) {
    this.rsuiteId = value;
  }

}
