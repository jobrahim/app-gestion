package ar.com.uber.app.gestion.request;

import java.io.Serializable;

public class DocumentoTransintoDTO implements Serializable {

    private String documento;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "DocumentoTransintoDTO{" +
                "documento='" + documento + '\'' +
                '}';
    }
}
