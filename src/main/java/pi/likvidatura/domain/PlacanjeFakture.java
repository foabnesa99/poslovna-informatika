package pi.likvidatura.domain;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table
@org.hibernate.annotations.Cache (usage = CacheConcurrencyStrategy.READ_WRITE)
public class PlacanjeFakture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
            (cascade = { CascadeType.ALL })
    @JoinColumn(name = "id_izvoda", referencedColumnName = "id")

    private StavkaIzvoda izvod;

    @ManyToOne (cascade = { CascadeType.ALL })
    @JoinColumn(name = "id_fakture", referencedColumnName = "id")

    private IzlaznaFaktura faktura;

    @Column(name = "zatvoren")
    private boolean zatvoren;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StavkaIzvoda getIzvod() {
        return izvod;
    }

    public void setIzvod(StavkaIzvoda izvod) {
        this.izvod = izvod;
    }

    public IzlaznaFaktura getFaktura() {
        return faktura;
    }

    public void setFaktura(IzlaznaFaktura faktura) {
        this.faktura = faktura;
    }

    public boolean isZatvoren() {
        return zatvoren;
    }

    public void setZatvoren(boolean zatvoren) {
        this.zatvoren = zatvoren;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlacanjeFakture)) return false;
        PlacanjeFakture that = (PlacanjeFakture) o;
        return isZatvoren() == that.isZatvoren() && getId().equals(that.getId()) && getIzvod().equals(that.getIzvod()) && getFaktura().equals(that.getFaktura());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
