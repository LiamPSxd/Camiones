package com.uv.camiones;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

//Clase de configuración

@EnableWs
@Configuration
public class Configuracion extends WsConfigurerAdapter{

    //Recupera el esquema XSD para generar las clases
    @Bean
    public XsdSchema camionesSchema(){
        return new SimpleXsdSchema(new ClassPathResource("camiones.xsd"));
    }
    
    //Define el mapeo del servlet
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServelet(ApplicationContext applicationContext){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext); 
        servlet.setTransformWsdlLocations(true);

        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    //Establece el contexto donde funcionará el servicio (Puerto, uri, namespace y esquema)
    @Bean(name = "camiones")
    public DefaultWsdl11Definition defaultWsdl11DefinitionPista(XsdSchema camionesSchema){
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("camionesPort");
        wsdl.setLocationUri("/ws");
        wsdl.setTargetNamespace("https://t4is.uv.mx/camiones");
        wsdl.setSchema(camionesSchema);

        return wsdl;
    }
}