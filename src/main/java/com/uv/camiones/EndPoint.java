package com.uv.camiones;

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
import https.t4is_uv_mx.camiones.ReadCamionRequest;
import https.t4is_uv_mx.camiones.ReadCamionResponse;
import https.t4is_uv_mx.camiones.ReadCamionResponse.Camion.Carga;
import https.t4is_uv_mx.camiones.ReadCamionResponse.Camion.Ubicacion;
import https.t4is_uv_mx.camiones.ModificarCamionResponse.Camion.Carga;
import https.t4is_uv_mx.camiones.ModificarCamionResponse.Camion.Ubicacion;

@Endpoint
public class EndPoint{
    @Autowired
    private ICamion iCamion;

    @PayloadRoot(localPart = "ReadCamionRequest", namespace = "https://t4is.uv.mx/camiones")
    @ResponsePayload
    public ReadCamionResponse read(@RequestPayload ReadCamionRequest request){
        ReadCamionResponse response = new ReadCamionResponse();

        if(request.getId() > -1){
            Camion camion = iCamion.findById(request.getId()).get();

            if(camion != null){
                ReadCamionResponse.Camion.Carga carga = new ReadCamionResponse.Camion.Carga();
                carga.setObjeto(camion.getObjeto());
                carga.setCantidad(camion.getCantidad());

                ReadCamionResponse.Camion.Ubicacion ubicacion = new ReadCamionResponse.Camion.Ubicacion();
                ubicacion.setLatitud(camion.getLatitud());
                ubicacion.setLongitud(camion.getLongitud());

                ReadCamionResponse.Camion readCamion = new ReadCamionResponse.Camion();
                readCamion.setId(camion.getId());
                readCamion.setChofer(camion.getChofer());
                readCamion.setTemperaturaCelsius(camion.getTemperaturaCelsius());
                readCamion.setCarga(carga);
                readCamion.setUbicacion(ubicacion);

                response.setStatus("Success");
                response.getCamion().add(readCamion);
            }else response.setStatus("Failed");
        }else if(request.getId() == -1){
            Iterable<Camion> camiones = iCamion.findAll();

            if(camiones != null){
                for(Camion camion : camiones){
                    ReadCamionResponse.Camion.Carga carga = new Carga();
                    carga.setObjeto(camion.getObjeto());
                    carga.setCantidad(camion.getCantidad());

                    ReadCamionResponse.Camion.Ubicacion ubicacion = new Ubicacion();
                    ubicacion.setLatitud(camion.getLatitud());
                    ubicacion.setLongitud(camion.getLongitud());

                    ReadCamionResponse.Camion readCamion = new ReadCamionResponse.Camion();
                    readCamion.setId(camion.getId());
                    readCamion.setChofer(camion.getChofer());
                    readCamion.setTemperaturaCelsius(camion.getTemperaturaCelsius());
                    readCamion.setCarga(carga);
                    readCamion.setUbicacion(ubicacion);

                    response.getCamion().add(readCamion);
                }

                response.setStatus("Success");
            }else response.setStatus("Failed");
        }else response.setStatus("Failed");

        return response;
    }

    @PayloadRoot(localPart = "AgregarCamionRequest", namespace = "https://t4is.uv.mx/camiones")
    @ResponsePayload
    public AgregarCamionResponse add(@RequestPayload AgregarCamionRequest request){
        AgregarCamionResponse response = new AgregarCamionResponse();

        if(request != null){
            Camion camion = new Camion();
            camion.setChofer(request.getChofer());
            camion.setTemperaturaCelsius(request.getTemperaturaCelsius());
            camion.setObjeto(request.getObjeto());
            camion.setCantidad(request.getCantidad());
            camion.setLatitud(request.getLatitud());
            camion.setLongitud(request.getLongitud());

            iCamion.save(camion);

            response.setStatus("Success");
        }else response.setStatus("Failed");

        return response;
    }

    @PayloadRoot(localPart = "ModificarCamionRequest", namespace = "https://t4is.uv.mx/camiones")
    @ResponsePayload
    public ModificarCamionResponse update(@RequestPayload ModificarCamionRequest request){
        ModificarCamionResponse response = new ModificarCamionResponse();
        Camion camion = iCamion.findById(request.getId()).get();

        if(camion != null){
            camion.setChofer(request.getChofer());
            camion.setTemperaturaCelsius(request.getTemperaturaCelsius());
            camion.setObjeto(request.getObjeto());
            camion.setCantidad(request.getCantidad());
            camion.setLatitud(request.getLatitud());
            camion.setLongitud(request.getLongitud());
            iCamion.save(camion);

            ModificarCamionResponse.Camion.Carga carga = new ModificarCamionResponse.Camion.Carga();
            carga.setObjeto(camion.getObjeto());
            carga.setCantidad(camion.getCantidad());

            ModificarCamionResponse.Camion.Ubicacion ubicacion = new ModificarCamionResponse.Camion.Ubicacion();
            ubicacion.setLatitud(camion.getLatitud());
            ubicacion.setLongitud(camion.getLongitud());

            ModificarCamionResponse.Camion modificarCamion = new ModificarCamionResponse.Camion();
            modificarCamion.setChofer(camion.getChofer());
            modificarCamion.setTemperaturaCelsius(camion.getTemperaturaCelsius());
            modificarCamion.setCarga(carga);
            modificarCamion.setUbicacion(ubicacion);

            response.setStatus("Success");
            response.setCamion(modificarCamion);
        }else response.setStatus("Failed");

        return response;
    }

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