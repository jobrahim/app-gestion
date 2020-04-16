package ar.com.uber.app.gestion.controller;

import ar.com.uber.app.gestion.request.ClientAddressDTO;
import ar.com.uber.app.gestion.request.ClientBarrioDTO;
import ar.com.uber.app.gestion.request.DocumentoTransintoDTO;
import ar.com.uber.app.gestion.response.BarrioDTO;
import ar.com.uber.app.gestion.response.CalleDTO;
import ar.com.uber.app.gestion.response.DatosTransitoDTO;
import ar.com.uber.app.gestion.service.CalculoCalleService;
//import ar.com.uber.app.gestion.service.CalculoChofer;
import ar.com.uber.app.gestion.service.CalculoChoferService;
import ar.com.uber.app.gestion.service.TransitoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller
 */

@RestController
@RequestMapping("/V1/uber")
public class UberControlller {

    private final Logger log = LoggerFactory.getLogger(UberControlller.class);

    @Autowired
    private CalculoCalleService calculoCalleService;
    @Autowired
    private CalculoChoferService calculoChoferService;
    @Autowired
    private TransitoService transitoService;

    @RequestMapping(value = "/SolicitarRuta", produces = {"application/json"}, consumes = {"application/json"}, method = RequestMethod.POST)
    public CalleDTO calcularCalles(@RequestBody ClientAddressDTO clientAddress) {
        log.info("ingresando a la clase [UberControlller]");
        CalleDTO response = calculoCalleService.returnStreet(clientAddress);
        log.info("se devuelve el Objeto --> " + response.toString());
        return response;
    }


    @RequestMapping(value = "/ListaChoferes", produces = {"application/json"}, consumes = {"application/json"}, method = RequestMethod.POST)
    public List<BarrioDTO> optenerListaChoferes(@RequestBody ClientBarrioDTO clientBarrio) {
        log.info("ingresando a la clase [UberControlller]");

        List<BarrioDTO> respuesta = calculoChoferService.returnChofer(clientBarrio);

        log.info("se devuelve el Objeto --> " + respuesta.toString());
        return respuesta;

    }

    @RequestMapping(value = "/getTransito", produces = {"application/json"}, consumes = {"application/json"}, method = RequestMethod.POST)
    public DatosTransitoDTO DatosTransitoDTO(@RequestBody DocumentoTransintoDTO documentoTransintoDTO) {
        log.info("ingresando a la clase [UberControlller]");

        DatosTransitoDTO response = transitoService.returnPatente(documentoTransintoDTO);

        log.info("se devuelve el Objeto --> " + response.toString());
        return response;

    }
}
