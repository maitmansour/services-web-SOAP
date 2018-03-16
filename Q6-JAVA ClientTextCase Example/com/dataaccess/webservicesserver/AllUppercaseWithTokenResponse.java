
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
 *         &lt;element name="AllUppercaseWithTokenResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "allUppercaseWithTokenResult"
})
@XmlRootElement(name = "AllUppercaseWithTokenResponse")
public class AllUppercaseWithTokenResponse {

    @XmlElement(name = "AllUppercaseWithTokenResult", required = true)
    protected String allUppercaseWithTokenResult;

    /**
     * Obtient la valeur de la propriété allUppercaseWithTokenResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllUppercaseWithTokenResult() {
        return allUppercaseWithTokenResult;
    }

    /**
     * Définit la valeur de la propriété allUppercaseWithTokenResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllUppercaseWithTokenResult(String value) {
        this.allUppercaseWithTokenResult = value;
    }

}
