package ar.com.uber.app.gestion.service;

import ar.com.uber.app.gestion.domain.ChoferEntity;
import ar.com.uber.app.gestion.repository.ChoferRepository;
import ar.com.uber.app.gestion.request.ClientAddressDTO;
import ar.com.uber.app.gestion.request.ClientBarrioDTO;
import ar.com.uber.app.gestion.response.BarrioDTO;
import ar.com.uber.app.gestion.response.CalleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculoChoferService {

    private final Logger log = LoggerFactory.getLogger(CalculoChoferService.class);

    @Autowired
    private UberService uberService;

    @Autowired
    private ChoferRepository choferRepository;

    public CalculoChoferService() {
    }

    public List<BarrioDTO>  returnChofer(ClientBarrioDTO clientBarrio) {
        log.info("ingresando a la clase [CalculoChoferService]");

        List<BarrioDTO> resultado = new ArrayList<>();

        List<ChoferEntity> choferEntities = choferRepository.buscarChoferByBarrio(clientBarrio.getBarrio());
        if(choferEntities != null){
            log.info("procesando los choferes disponibles en el barrio");
            for (ChoferEntity choferEntity : choferEntities){

                BarrioDTO barrioDTO = new BarrioDTO();
                barrioDTO.setName(choferEntity.getNombre());
                barrioDTO.setDni(choferEntity.getDni());

                resultado.add(barrioDTO);
            }

        } else {
            log.info("actualmente no existen choferes en el barrio selecionado");
        }

        return resultado;
    }

}