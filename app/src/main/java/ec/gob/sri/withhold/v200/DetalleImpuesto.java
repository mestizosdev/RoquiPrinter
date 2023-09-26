//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.25 at 09:37:27 PM ECT 
//


package ec.gob.sri.withhold.v200;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detalleImpuesto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detalleImpuesto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{}codigoReembolso"/&gt;
 *         &lt;element name="codigoPorcentaje" type="{}codigoPorcentajeReembolso"/&gt;
 *         &lt;element name="tarifa" type="{}tarifaReembolso"/&gt;
 *         &lt;element name="baseImponibleReembolso" type="{}baseImponibleReembolso"/&gt;
 *         &lt;element name="impuestoReembolso" type="{}impuestoReembolso"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleImpuesto", propOrder = {
    "codigo",
    "codigoPorcentaje",
    "tarifa",
    "baseImponibleReembolso",
    "impuestoReembolso"
})
public class DetalleImpuesto {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String codigoPorcentaje;
    @XmlElement(required = true)
    protected String tarifa;
    @XmlElement(required = true)
    protected BigDecimal baseImponibleReembolso;
    @XmlElement(required = true)
    protected BigDecimal impuestoReembolso;

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
     *     {@link String }
     *     
     */
    public String getTarifa() {
        return tarifa;
    }

    /**
     * Sets the value of the tarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifa(String value) {
        this.tarifa = value;
    }

    /**
     * Gets the value of the baseImponibleReembolso property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseImponibleReembolso() {
        return baseImponibleReembolso;
    }

    /**
     * Sets the value of the baseImponibleReembolso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseImponibleReembolso(BigDecimal value) {
        this.baseImponibleReembolso = value;
    }

    /**
     * Gets the value of the impuestoReembolso property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImpuestoReembolso() {
        return impuestoReembolso;
    }

    /**
     * Sets the value of the impuestoReembolso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImpuestoReembolso(BigDecimal value) {
        this.impuestoReembolso = value;
    }

}
