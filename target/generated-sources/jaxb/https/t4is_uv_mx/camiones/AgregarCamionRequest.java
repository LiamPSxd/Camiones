//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.05.27 a las 10:44:25 AM CDT 
//


package https.t4is_uv_mx.camiones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chofer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="celsius" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="objeto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "chofer",
    "celsius",
    "objeto",
    "cantidad",
    "latitud",
    "longitud"
})
@XmlRootElement(name = "AgregarCamionRequest")
public class AgregarCamionRequest {

    @XmlElement(required = true)
    protected String chofer;
    protected double celsius;
    @XmlElement(required = true)
    protected String objeto;
    protected int cantidad;
    protected double latitud;
    protected double longitud;

    /**
     * Obtiene el valor de la propiedad chofer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChofer() {
        return chofer;
    }

    /**
     * Define el valor de la propiedad chofer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChofer(String value) {
        this.chofer = value;
    }

    /**
     * Obtiene el valor de la propiedad celsius.
     * 
     */
    public double getCelsius() {
        return celsius;
    }

    /**
     * Define el valor de la propiedad celsius.
     * 
     */
    public void setCelsius(double value) {
        this.celsius = value;
    }

    /**
     * Obtiene el valor de la propiedad objeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjeto() {
        return objeto;
    }

    /**
     * Define el valor de la propiedad objeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjeto(String value) {
        this.objeto = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad latitud.
     * 
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Define el valor de la propiedad latitud.
     * 
     */
    public void setLatitud(double value) {
        this.latitud = value;
    }

    /**
     * Obtiene el valor de la propiedad longitud.
     * 
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Define el valor de la propiedad longitud.
     * 
     */
    public void setLongitud(double value) {
        this.longitud = value;
    }

}
