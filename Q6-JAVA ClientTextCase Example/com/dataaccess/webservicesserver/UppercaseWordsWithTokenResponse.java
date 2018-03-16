
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
 *         &lt;element name="UppercaseWordsWithTokenResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "uppercaseWordsWithTokenResult"
})
@XmlRootElement(name = "UppercaseWordsWithTokenResponse")
public class UppercaseWordsWithTokenResponse {

    @XmlElement(name = "UppercaseWordsWithTokenResult", required = true)
    protected String uppercaseWordsWithTokenResult;

    /**
     * Obtient la valeur de la propriété uppercaseWordsWithTokenResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUppercaseWordsWithTokenResult() {
        return uppercaseWordsWithTokenResult;
    }

    /**
     * Définit la valeur de la propriété uppercaseWordsWithTokenResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUppercaseWordsWithTokenResult(String value) {
        this.uppercaseWordsWithTokenResult = value;
    }

}
