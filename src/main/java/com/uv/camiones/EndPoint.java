package com.uv.camiones;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.camiones.AgregarCamionRequest;
import https.t4is_uv_mx.camiones.AgregarCamionResponse;
import https.t4is_uv_mx.camiones.EliminarCamionRequest;
import https.t4is_uv_mx.camiones.EliminarCamionResponse;
import https.t4is_uv_mx.camiones.ModificarCamionRequest;
import https.t4is_uv_mx.camiones.ModificarCamionResponse;
import https.t4is_uv_mx.camiones.ReadAllCamionResponse;
import https.t4is_uv_mx.camiones.ReadOneCamionRequest;
import https.t4is_uv_mx.camiones.ReadOneCamionResponse;

//Clase que funciona como el EndPoint del servicio SOAP
@Endpoint
public class EndPoint{

    //Instancia de interfaz para conectar y generar la base de datos
    @Autowired
    private ICamion iCamion;
    
    /*
    Método que recupera un camión en específico (dada su id) que se encuentra registrado en la base de datos: 
    La request lleva un dato de tipo int (la id del camión) con la cual se hace la solicitud de búsqueda a la 
    base de datos. Si el resultado es distinto de nulo va a definir los datos que se regresaran en la respuesta
    */
    @PayloadRoot(localPart = "ReadOneCamionRequest", namespace = "https://t4is.uv.mx/camiones")
    @ResponsePayload
    public ReadOneCamionResponse read(@RequestPayload ReadOneCamionRequest request){
        ReadOneCamionResponse response = new ReadOneCamionResponse();
        Camion camion = iCamion.findById(request.getId()).get();

        if(camion != null){
            ReadOneCamionResponse.Camion.Carga carga = new ReadOneCamionResponse.Camion.Carga();
            carga.setObjeto(camion.getObjeto());
            carga.setCantidad(camion.getCantidad());

            ReadOneCamionResponse.Camion.Ubicacion ubicacion = new ReadOneCamionResponse.Camion.Ubicacion();
            ubicacion.setLatitud(camion.getLatitud());
            ubicacion.setLongitud(camion.getLongitud());

            ReadOneCamionResponse.Camion readCamion = new ReadOneCamionResponse.Camion();
            readCamion.setId(camion.getId());
            readCamion.setChofer(camion.getChofer());
            readCamion.setCarga(carga);
            readCamion.setUbicacion(ubicacion);

            ReadOneCamionResponse.Camion.Temperatura temperatura = new ReadOneCamionResponse.Camion.Temperatura();
            if(camion.getTemperatura().size() > 0)
                for(Double valor : camion.getTemperatura()) temperatura.getCelsius().add(valor);

            readCamion.setTemperatura(temperatura);

            response.setStatus("Success");
            response.setCamion(readCamion);
        }else response.setStatus("Failed");

        return response;
    }
    
    /*
    Método que recupera todos los camiones que se encuentran registrados en la base de datos: 
    La request nula solicita todo lo registrado en la base de datos. Si el resultado es distinto 
    de nulo va a definir los datos que se regresaran en la respuesta por medio de un ciclo for
    */
    @PayloadRoot(localPart = "ReadAllCamionRequest", namespace = "https://t4is.uv.mx/camiones")
    @ResponsePayload
    public ReadAllCamionResponse read(){
        ReadAllCamionResponse response = new ReadAllCamionResponse();
        Iterable<Camion> camiones = iCamion.findAll();

        if(camiones != null){
            for(Camion camion : camiones){
                ReadAllCamionResponse.Camion.Carga carga = new ReadAllCamionResponse.Camion.Carga();
                carga.setObjeto(camion.getObjeto());
                carga.setCantidad(camion.getCantidad());

                ReadAllCamionResponse.Camion.Ubicacion ubicacion = new ReadAllCamionResponse.Camion.Ubicacion();
                ubicacion.setLatitud(camion.getLatitud());
                ubicacion.setLongitud(camion.getLongitud());

                ReadAllCamionResponse.Camion readCamion = new ReadAllCamionResponse.Camion();
                readCamion.setId(camion.getId());
                readCamion.setChofer(camion.getChofer());
                readCamion.setCarga(carga);
                readCamion.setUbicacion(ubicacion);

                ReadAllCamionResponse.Camion.Temperatura temperatura = new ReadAllCamionResponse.Camion.Temperatura();
                if(camion.getTemperatura().size() > 0)
                    for(Double valor : camion.getTemperatura()) temperatura.getCelsius().add(valor);

                readCamion.setTemperatura(temperatura);

                response.getCamion().add(readCamion);
            }

            response.setStatus("Success");
        }else response.setStatus("Failed");

        return response;
    }

    /*
    Método que registra en la base de datos un camión con los datos enviados: 
    La request lleva los 6 atributos del objeto camión y hace la solicitud a la base de datos de registrarlo.
    Como respuesta regresa si se guardó con éxito o si falló 
    */
    @PayloadRoot(localPart = "AgregarCamionRequest", namespace = "https://t4is.uv.mx/camiones")
    @ResponsePayload
    public AgregarCamionResponse add(@RequestPayload AgregarCamionRequest request){
        AgregarCamionResponse response = new AgregarCamionResponse();

        if(request != null){
            Camion camion = new Camion();
            camion.setChofer(request.getChofer());
            camion.setObjeto(request.getObjeto());
            camion.setCantidad(request.getCantidad());
            camion.setLatitud(request.getLatitud());
            camion.setLongitud(request.getLongitud());

            ArrayList<Double> temperaturas = new ArrayList<Double>();
            temperaturas.add(request.getCelsius());

            camion.setTemperatura(temperaturas);

            iCamion.save(camion);

            response.setStatus("Success");
        }else response.setStatus("Failed");

        return response;
    }

    /*
    Método que modifica en la base de datos un camión con los datos enviados: 
    La request lleva los 6 atributos del objeto camión además de la id del objeto a modificar y hace
     la solicitud a la base de datos de actualizarlo. Como respuesta regresa si se guardó con éxito o si falló 
    */
    @PayloadRoot(localPart = "ModificarCamionRequest", namespace = "https://t4is.uv.mx/camiones")
    @ResponsePayload
    public ModificarCamionResponse update(@RequestPayload ModificarCamionRequest request){
        ModificarCamionResponse response = new ModificarCamionResponse();
        Camion camion = iCamion.findById(request.getId()).get();

        if(camion != null){
            camion.setChofer(request.getChofer());
            camion.setObjeto(request.getObjeto());
            camion.setCantidad(request.getCantidad());
            camion.setLatitud(request.getLatitud());
            camion.setLongitud(request.getLongitud());

            ArrayList<Double> temperaturas = new ArrayList<Double>();
            for(String valor : request.getCelsius().split(",")){
                temperaturas.add(Double.parseDouble(valor));
            }

            camion.setTemperatura(temperaturas);
            iCamion.save(camion);

            ModificarCamionResponse.Camion.Carga carga = new ModificarCamionResponse.Camion.Carga();
            carga.setObjeto(camion.getObjeto());
            carga.setCantidad(camion.getCantidad());

            ModificarCamionResponse.Camion.Ubicacion ubicacion = new ModificarCamionResponse.Camion.Ubicacion();
            ubicacion.setLatitud(camion.getLatitud());
            ubicacion.setLongitud(camion.getLongitud());

            ModificarCamionResponse.Camion modificarCamion = new ModificarCamionResponse.Camion();
            modificarCamion.setChofer(camion.getChofer());
            modificarCamion.setCarga(carga);
            modificarCamion.setUbicacion(ubicacion);

            if(camion.getTemperatura().size() > 0){
                for(Double valor : camion.getTemperatura()){
                    ModificarCamionResponse.Camion.Temperatura temperatura = new ModificarCamionResponse.Camion.Temperatura();
                    temperatura.setCelsius(valor);

                    modificarCamion.getTemperatura().add(temperatura);
                }
            }

            response.setStatus("Success");
            response.setCamion(modificarCamion);
        }else response.setStatus("Failed");

        return response;
    }

    /*
    Método que elimina de la base de datos un camión con la id enviada: 
    La request lleva la id del objeto a eliminar y hace la solicitud a la base de datos de eliminarlo. 
    Como respuesta regresa si se guardó con éxito o si falló 
    */
    @PayloadRoot(localPart = "EliminarCamionRequest", namespace = "https://t4is.uv.mx/camiones")
    @ResponsePayload
    public EliminarCamionResponse delete(@RequestPayload EliminarCamionRequest request){
        EliminarCamionResponse response = new EliminarCamionResponse();
        Camion camion = iCamion.findById(request.getId()).get();

        if(camion != null){
            iCamion.delete(camion);

            response.setStatus("Success");
        }else response.setStatus("Failed");

        return response;
    }
}