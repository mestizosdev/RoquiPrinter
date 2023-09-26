//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.25 at 09:33:06 PM ECT 
//


package ec.gob.sri.note.debit.v100;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contiene la informacion tributaria generica
 * 
 * <p>Java class for infoTributaria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoTributaria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ambiente" type="{}ambiente"/&gt;
 *         &lt;element name="tipoEmision" type="{}tipoEmision"/&gt;
 *         &lt;element name="razonSocial" type="{}razonSocial"/&gt;
 *         &lt;element name="nombreComercial" type="{}nombreComercial" minOccurs="0"/&gt;
 *         &lt;element name="ruc" type="{}numeroRuc"/&gt;
 *         &lt;element name="claveAcceso" type="{}claveAcceso"/&gt;
 *         &lt;element name="codDoc" type="{}codDoc"/&gt;
 *         &lt;element name="estab" type="{}establecimiento"/&gt;
 *         &lt;element name="ptoEmi" type="{}puntoEmision"/&gt;
 *         &lt;element name="secuencial" type="{}secuencial"/&gt;
 *         &lt;element name="dirMatriz" type="{}dirMatriz"/&gt;
 *         &lt;element name="agenteRetencion" type="{}agenteRetencion" minOccurs="0"/&gt;
 *         &lt;element name="contribuyenteRimpe" type="{}contribuyenteRimpe" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoTributaria", propOrder = {
    "ambiente",
    "tipoEmision",
    "razonSocial",
    "nombreComercial",
    "ruc",
    "claveAcceso",
    "codDoc",
    "estab",
    "ptoEmi",
    "secuencial",
    "dirMatriz",
    "agenteRetencion",
    "contribuyenteRimpe"
})
public class InfoTributaria {

    @XmlElement(required = true)
    protected String ambiente;
    @XmlElement(required = true)
    protected String tipoEmision;
    @XmlElement(required = true)
    protected String razonSocial;
    protected String nombreComercial;
    @XmlElement(required = true)
    protected String ruc;
    @XmlElement(required = true)
    protected String claveAcceso;
    @XmlElement(required = true)
    protected String codDoc;
    @XmlElement(required = true)
    protected String estab;
    @XmlElement(required = true)
    protected String ptoEmi;
    @XmlElement(required = true)
    protected String secuencial;
    @XmlElement(required = true)
    protected String dirMatriz;
    protected String agenteRetencion;
    protected String contribuyenteRimpe;

    /**
     * Gets the value of the ambiente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbiente() {
        return ambiente;
    }

    /**
     * Sets the value of the ambiente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbiente(String value) {
        this.ambiente = value;
    }

    /**
     * Gets the value of the tipoEmision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEmision() {
        return tipoEmision;
    }

    /**
     * Sets the value of the tipoEmision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEmision(String value) {
        this.tipoEmision = value;
    }

    /**
     * Gets the value of the razonSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Sets the value of the razonSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Gets the value of the nombreComercial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComercial() {
        return nombreComercial;
    }

    /**
     * Sets the value of the nombreComercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComercial(String value) {
        this.nombreComercial = value;
    }

    /**
     * Gets the value of the ruc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Sets the value of the ruc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuc(String value) {
        this.ruc = value;
    }

    /**
     * Gets the value of the claveAcceso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveAcceso() {
        return claveAcceso;
    }

    /**
     * Sets the value of the claveAcceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveAcceso(String value) {
        this.claveAcceso = value;
    }

    /**
     * Gets the value of the codDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDoc() {
        return codDoc;
    }

    /**
     * Sets the value of the codDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDoc(String value) {
        this.codDoc = value;
    }

    /**
     * Gets the value of the estab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstab() {
        return estab;
    }

    /**
     * Sets the value of the estab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstab(String value) {
        this.estab = value;
    }

    /**
     * Gets the value of the ptoEmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtoEmi() {
        return ptoEmi;
    }

    /**
     * Sets the value of the ptoEmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtoEmi(String value) {
        this.ptoEmi = value;
    }

    /**
     * Gets the value of the secuencial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuencial() {
        return secuencial;
    }

    /**
     * Sets the value of the secuencial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuencial(String value) {
        this.secuencial = value;
    }

    /**
     * Gets the value of the dirMatriz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirMatriz() {
        return dirMatriz;
    }

    /**
     * Sets the value of the dirMatriz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirMatriz(String value) {
        this.dirMatriz = value;
    }

    /**
     * Gets the value of the agenteRetencion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenteRetencion() {
        return agenteRetencion;
    }

    /**
     * Sets the value of the agenteRetencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenteRetencion(String value) {
        this.agenteRetencion = value;
    }

    /**
     * Gets the value of the contribuyenteRimpe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContribuyenteRimpe() {
        return contribuyenteRimpe;
    }

    /**
     * Sets the value of the contribuyenteRimpe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContribuyenteRimpe(String value) {
        this.contribuyenteRimpe = value;
    }

}
