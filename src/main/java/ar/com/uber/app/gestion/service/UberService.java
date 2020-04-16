package ar.com.uber.app.gestion.service;

import ar.com.uber.app.gestion.response.BarrioDTO;
import ar.com.uber.app.gestion.response.CalleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UberService {

    private final Logger log = LoggerFactory.getLogger(UberService.class);

    public UberService() {
    }

    public CalleDTO solicitarRuta1() {
        log.info("ingresando a la clase [UberService]");
        CalleDTO ruta1 = new CalleDTO();


        ruta1.setNombre(cargarCalle().get(0));

        ArrayList<String> alturaInicalList = cargarAlturaInicial();
        String alturaInicial = alturaInicalList.get(0);
        ruta1.setAlturaInicial(alturaInicial);

        ArrayList<String> alturaFinalList = cargarAlturaFinal();
        String alturaFinal = alturaFinalList.get(0);
        ruta1.setAlturaFinal(alturaFinal);

        return ruta1;

    }

    public CalleDTO solicitarRuta2() {
        // desarrollar logica
        log.info("ingresando a la clase [UberService]");
        CalleDTO ruta2 = new CalleDTO();


        ruta2.setNombre(cargarCalle().get(1));

        ArrayList<String> alturaInicalList = cargarAlturaInicial();
        String alturaInicial = alturaInicalList.get(1);
        ruta2.setAlturaInicial(alturaInicial);

        ArrayList<String> alturaFinalList = cargarAlturaFinal();
        String alturaFinal = alturaFinalList.get(1);
        ruta2.setAlturaFinal(alturaFinal);
        return ruta2;
    }

    public CalleDTO solicitarRuta3() {
        // desarrollar logica
        log.info("ingresando a la clase [UberService]");
        CalleDTO ruta3 = new CalleDTO();


        ruta3.setNombre(cargarCalle().get(2));

        ArrayList<String> alturaInicalList = cargarAlturaInicial();
        String alturaInicial = alturaInicalList.get(2);
        ruta3.setAlturaInicial(alturaInicial);

        ArrayList<String> alturaFinalList = cargarAlturaFinal();
        String alturaFinal = alturaFinalList.get(2);
        ruta3.setAlturaFinal(alturaFinal);
        return ruta3;
    }


    public BarrioDTO solicitarChofer() {
        log.info("ingresando a la clase [UberService]");
        BarrioDTO chofer = new BarrioDTO();

        chofer.setName(cargarChoferes().get(0));
        chofer.setDni(cargarDNI().get(0));
        return chofer;
    }

    public BarrioDTO solicitarChofer1() {
        log.info("ingresando a la clase [UberService]");
        BarrioDTO chofer1 = new BarrioDTO();

        chofer1.setName(cargarChoferes().get(1));
        chofer1.setDni(cargarDNI().get(1));
        return chofer1;
    }

    public BarrioDTO solicitarChofer2() {
        log.info("ingresando a la clase [UberService]");
        BarrioDTO chofer2 = new BarrioDTO();

        chofer2.setName(cargarChoferes().get(2));
        chofer2.setDni(cargarDNI().get(2));
        return chofer2;
    }

    private ArrayList<String> cargarCalle() {

        ArrayList<String> ListaDeCalles = new ArrayList();
        ListaDeCalles.add("Juan B Justo");
        ListaDeCalles.add("San Martin");
        ListaDeCalles.add("Nogoya");
        // log.info("Se imprime el nombre de la ultima calle = " + ListaDeCalles.get(2) );
        return ListaDeCalles;
    }

    private ArrayList<String> cargarAlturaInicial() {

        ArrayList<String> ListaDeCalles = new ArrayList();
        ListaDeCalles.add("1234");
        ListaDeCalles.add("4567");
        ListaDeCalles.add("3345");
        return ListaDeCalles;

    }

    private ArrayList<String> cargarAlturaFinal() {

        ArrayList<String> ListaDeCalles = new ArrayList();
        ListaDeCalles.add("2345");
        ListaDeCalles.add("6456");
        ListaDeCalles.add("8976");
        return ListaDeCalles;

    }


    public ArrayList<String> cargarChoferes() {

        ArrayList<String> ListaDeChoferes = new ArrayList();

        ListaDeChoferes.add("Ramon");
        ListaDeChoferes.add("Carlos");
        ListaDeChoferes.add("Jose");
        return ListaDeChoferes;
    }

    private ArrayList<String> cargarDNI() {

        ArrayList<String> ListaDeDNI = new ArrayList();
        ListaDeDNI.add("32.987.532");
        ListaDeDNI.add("97.323.451");
        ListaDeDNI.add("38.456.987");
        return ListaDeDNI;
    }

}