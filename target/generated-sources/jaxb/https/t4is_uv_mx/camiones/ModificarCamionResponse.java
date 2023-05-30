//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.05.30 a las 01:28:32 PM CDT 
//


package https.t4is_uv_mx.camiones;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Camion"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="chofer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="temperatura" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="celsius" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="carga"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="objeto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ubicacion"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                             &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "status",
    "camion"
})
@XmlRootElement(name = "ModificarCamionResponse")
public class ModificarCamionResponse {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(name = "Camion", required = true)
    protected ModificarCamionResponse.Camion camion;

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad camion.
     * 
     * @return
     *     possible object is
     *     {@link ModificarCamionResponse.Camion }
     *     
     */
    public ModificarCamionResponse.Camion getCamion() {
        return camion;
    }

    /**
     * Define el valor de la propiedad camion.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificarCamionResponse.Camion }
     *     
     */
    public void setCamion(ModificarCamionResponse.Camion value) {
        this.camion = value;
    }


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
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="chofer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="temperatura" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="celsius" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="carga"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="objeto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ubicacion"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *                   &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "id",
        "chofer",
        "temperatura",
        "carga",
        "ubicacion"
    })
    public static class Camion {

        protected int id;
        @XmlElement(required = true)
        protected String chofer;
        @XmlElement(required = true)
        protected List<ModificarCamionResponse.Camion.Temperatura> temperatura;
        @XmlElement(required = true)
        protected ModificarCamionResponse.Camion.Carga carga;
        @XmlElement(required = true)
        protected ModificarCamionResponse.Camion.Ubicacion ubicacion;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

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
         * Gets the value of the temperatura property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the temperatura property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTemperatura().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModificarCamionResponse.Camion.Temperatura }
         * 
         * 
         */
        public List<ModificarCamionResponse.Camion.Temperatura> getTemperatura() {
            if (temperatura == null) {
                temperatura = new ArrayList<ModificarCamionResponse.Camion.Temperatura>();
            }
            return this.temperatura;
        }

        /**
         * Obtiene el valor de la propiedad carga.
         * 
         * @return
         *     possible object is
         *     {@link ModificarCamionResponse.Camion.Carga }
         *     
         */
        public ModificarCamionResponse.Camion.Carga getCarga() {
            return carga;
        }

        /**
         * Define el valor de la propiedad carga.
         * 
         * @param value
         *     allowed object is
         *     {@link ModificarCamionResponse.Camion.Carga }
         *     
         */
        public void setCarga(ModificarCamionResponse.Camion.Carga value) {
            this.carga = value;
        }

        /**
         * Obtiene el valor de la propiedad ubicacion.
         * 
         * @return
         *     possible object is
         *     {@link ModificarCamionResponse.Camion.Ubicacion }
         *     
         */
        public ModificarCamionResponse.Camion.Ubicacion getUbicacion() {
            return ubicacion;
        }

        /**
         * Define el valor de la propiedad ubicacion.
         * 
         * @param value
         *     allowed object is
         *     {@link ModificarCamionResponse.Camion.Ubicacion }
         *     
         */
        public void setUbicacion(ModificarCamionResponse.Camion.Ubicacion value) {
            this.ubicacion = value;
        }


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
         *         &lt;element name="objeto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
            "objeto",
            "cantidad"
        })
        public static class Carga {

            @XmlElement(required = true)
            protected String objeto;
            protected int cantidad;

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

        }


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
         *         &lt;element name="celsius" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
            "celsius"
        })
        public static class Temperatura {

            protected double celsius;

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

        }


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
            "latitud",
            "longitud"
        })
        public static class Ubicacion {

            protected double latitud;
            protected double longitud;

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

    }

}
