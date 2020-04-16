package ar.com.uber.app.gestion.service;


import ar.com.uber.app.gestion.domain.ChoferEntity;
import ar.com.uber.app.gestion.repository.ChoferRepository;
import ar.com.uber.app.gestion.request.ClientAddressDTO;
import ar.com.uber.app.gestion.request.DocumentoTransintoDTO;
import ar.com.uber.app.gestion.response.CalleDTO;
import ar.com.uber.app.gestion.response.DatosTransitoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransitoService {

    private final Logger log = LoggerFactory.getLogger(TransitoService.class);

    @Autowired
    private ChoferRepository choferRepository;

    public DatosTransitoDTO returnPatente(DocumentoTransintoDTO documentoTransintoDTO) {
        log.info("ingresando a la clase [TransitoService]");

        DatosTransitoDTO response = new DatosTransitoDTO();


        ChoferEntity responseEntity = choferRepository.buscarPatenteByDni(documentoTransintoDTO.getDocumento());

        if (responseEntity != null){

            response.setPatente(responseEntity.getPatente());


        } else {


            log.info("No se obtuvo resultado en la Base de Datos");

        }
        return response;
}
}