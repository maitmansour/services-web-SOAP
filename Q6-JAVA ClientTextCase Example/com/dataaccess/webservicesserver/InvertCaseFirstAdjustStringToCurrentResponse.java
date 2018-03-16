
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
 *         &lt;element name="InvertCaseFirstAdjustStringToCurrentResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "invertCaseFirstAdjustStringToCurrentResult"
})
@XmlRootElement(name = "InvertCaseFirstAdjustStringToCurrentResponse")
public class InvertCaseFirstAdjustStringToCurrentResponse {

    @XmlElement(name = "InvertCaseFirstAdjustStringToCurrentResult", required = true)
    protected String invertCaseFirstAdjustStringToCurrentResult;

    /**
     * Obtient la valeur de la propriété invertCaseFirstAdjustStringToCurrentResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvertCaseFirstAdjustStringToCurrentResult() {
        return invertCaseFirstAdjustStringToCurrentResult;
    }

    /**
     * Définit la valeur de la propriété invertCaseFirstAdjustStringToCurrentResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvertCaseFirstAdjustStringToCurrentResult(String value) {
        this.invertCaseFirstAdjustStringToCurrentResult = value;
    }

}
