
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
 *         &lt;element name="AllLowercaseWithTokenResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "allLowercaseWithTokenResult"
})
@XmlRootElement(name = "AllLowercaseWithTokenResponse")
public class AllLowercaseWithTokenResponse {

    @XmlElement(name = "AllLowercaseWithTokenResult", required = true)
    protected String allLowercaseWithTokenResult;

    /**
     * Obtient la valeur de la propriété allLowercaseWithTokenResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllLowercaseWithTokenResult() {
        return allLowercaseWithTokenResult;
    }

    /**
     * Définit la valeur de la propriété allLowercaseWithTokenResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllLowercaseWithTokenResult(String value) {
        this.allLowercaseWithTokenResult = value;
    }

}
