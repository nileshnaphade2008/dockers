//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.22 at 09:17:12 PM EDT 
//


package com.debit.copybook.trans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebitClientTrans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebitClientTrans"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DebitClient" type="{http://debit.com/copybook/trans}DebitClient"/&gt;
 *         &lt;element name="order" type="{http://debit.com/copybook/trans}order"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitClientTrans", propOrder = {
    "debitClient",
    "order"
})
public class DebitClientTrans {

    @XmlElement(name = "DebitClient", required = true)
    protected DebitClient debitClient;
    @XmlElement(required = true)
    protected Order order;

    /**
     * Gets the value of the debitClient property.
     * 
     * @return
     *     possible object is
     *     {@link DebitClient }
     *     
     */
    public DebitClient getDebitClient() {
        return debitClient;
    }

    /**
     * Sets the value of the debitClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitClient }
     *     
     */
    public void setDebitClient(DebitClient value) {
        this.debitClient = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrder(Order value) {
        this.order = value;
    }

}
