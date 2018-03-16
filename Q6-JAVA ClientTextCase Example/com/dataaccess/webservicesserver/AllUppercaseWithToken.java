
package com.dataaccess.webservicesserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sAString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "saString",
    "sToken"
})
@XmlRootElement(name = "AllUppercaseWithToken")
public class AllUppercaseWithToken {

    @XmlElement(name = "sAString", required = true)
    protected String saString;
    @XmlElement(required = true)
    protected String sToken;

    /**
     * Obtient la valeur de la propriété saString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAString() {
        return saString;
    }

    /**
     * Définit la valeur de la propriété saString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAString(String value) {
        this.saString = value;
    }

    /**
     * Obtient la valeur de la propriété sToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSToken() {
        return sToken;
    }

    /**
     * Définit la valeur de la propriété sToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSToken(String value) {
        this.sToken = value;
    }

}
