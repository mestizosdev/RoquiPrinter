//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.25 at 09:24:44 PM ECT 
//


package ec.gob.sri.note.credit.v110;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contiene la información de los impuestos
 * 
 * <p>Java class for impuesto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="impuesto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{}codigo"/&gt;
 *         &lt;element name="codigoPorcentaje" type="{}codigoPorcentaje"/&gt;
 *         &lt;element name="tarifa" type="{}tarifa" minOccurs="0"/&gt;
 *         &lt;element name="baseImponible" type="{}baseImponible"/&gt;
 *         &lt;element name="valor" type="{}valor"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impuesto", propOrder = {
    "codigo",
    "codigoPorcentaje",
    "tarifa",
    "baseImponible",
    "valor"
})
public class Impuesto {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String codigoPorcentaje;
    protected BigDecimal tarifa;
    @XmlElement(required = true)
    protected BigDecimal baseImponible;
    @XmlElement(required = true)
    protected BigDecimal valor;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the codigoPorcentaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPorcentaje() {
        return codigoPorcentaje;
    }

    /**
     * Sets the value of the codigoPorcentaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPorcentaje(String value) {
        this.codigoPorcentaje = value;
    }

    /**
     * Gets the value of the tarifa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTarifa() {
        return tarifa;
    }

    /**
     * Sets the value of the tarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTarifa(BigDecimal value) {
        this.tarifa = value;
    }

    /**
     * Gets the value of the baseImponible property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseImponible() {
        return baseImponible;
    }

    /**
     * Sets the value of the baseImponible property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseImponible(BigDecimal value) {
        this.baseImponible = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

}
