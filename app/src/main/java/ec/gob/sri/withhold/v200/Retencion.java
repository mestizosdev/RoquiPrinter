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
 * Impuesto de un comprobante de retencion. Contiene los elementos de cada fila del comprobante.
 * 
 * <p>Java class for retencion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retencion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{}codigo"/&gt;
 *         &lt;element name="codigoRetencion" type="{}codigoRetencion"/&gt;
 *         &lt;element name="baseImponible" type="{}baseImponible"/&gt;
 *         &lt;element name="porcentajeRetener" type="{}porcentajeRetener"/&gt;
 *         &lt;element name="valorRetenido" type="{}valorRetenido"/&gt;
 *         &lt;element name="dividendos" type="{}dividendos" minOccurs="0"/&gt;
 *         &lt;element name="compraCajBanano" type="{}compraCajBanano" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retencion", propOrder = {
    "codigo",
    "codigoRetencion",
    "baseImponible",
    "porcentajeRetener",
    "valorRetenido",
    "dividendos",
    "compraCajBanano"
})
public class Retencion {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String codigoRetencion;
    @XmlElement(required = true)
    protected BigDecimal baseImponible;
    @XmlElement(required = true)
    protected BigDecimal porcentajeRetener;
    @XmlElement(required = true)
    protected BigDecimal valorRetenido;
    protected Dividendos dividendos;
    protected CompraCajBanano compraCajBanano;

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
     * Gets the value of the codigoRetencion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRetencion() {
        return codigoRetencion;
    }

    /**
     * Sets the value of the codigoRetencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRetencion(String value) {
        this.codigoRetencion = value;
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
     * Gets the value of the porcentajeRetener property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeRetener() {
        return porcentajeRetener;
    }

    /**
     * Sets the value of the porcentajeRetener property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeRetener(BigDecimal value) {
        this.porcentajeRetener = value;
    }

    /**
     * Gets the value of the valorRetenido property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorRetenido() {
        return valorRetenido;
    }

    /**
     * Sets the value of the valorRetenido property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorRetenido(BigDecimal value) {
        this.valorRetenido = value;
    }

    /**
     * Gets the value of the dividendos property.
     * 
     * @return
     *     possible object is
     *     {@link Dividendos }
     *     
     */
    public Dividendos getDividendos() {
        return dividendos;
    }

    /**
     * Sets the value of the dividendos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dividendos }
     *     
     */
    public void setDividendos(Dividendos value) {
        this.dividendos = value;
    }

    /**
     * Gets the value of the compraCajBanano property.
     * 
     * @return
     *     possible object is
     *     {@link CompraCajBanano }
     *     
     */
    public CompraCajBanano getCompraCajBanano() {
        return compraCajBanano;
    }

    /**
     * Sets the value of the compraCajBanano property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompraCajBanano }
     *     
     */
    public void setCompraCajBanano(CompraCajBanano value) {
        this.compraCajBanano = value;
    }

}
