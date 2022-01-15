package pi.likvidatura.service.dto;

import pi.likvidatura.domain.IzlaznaFaktura;
import pi.likvidatura.domain.StavkaIzvoda;

import java.io.Serializable;

public class PlacanjeFaktureDTO implements Serializable {

    private Long id;

    private IzlaznaFaktura faktura;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IzlaznaFaktura getFaktura() {
        return faktura;
    }

    public void setFaktura(IzlaznaFaktura faktura) {
        this.faktura = faktura;
    }

    public StavkaIzvoda getStavkaIzvoda() {
        return izvod;
    }

    public void setStavkaIzvoda(StavkaIzvoda stavkaIzvoda) {
        this.izvod = stavkaIzvoda;
    }

    public boolean isZatvorena() {
        return zatvorena;
    }

    public void setZatvorena(boolean zatvorena) {
        this.zatvorena = zatvorena;
    }

    private StavkaIzvoda izvod;

    private boolean zatvorena;



}
