package pi.likvidatura.repository;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pi.likvidatura.domain.PlacanjeFakture;

@Repository
public interface PlacanjeFaktureRepository extends JpaRepository<PlacanjeFakture, Long> {
}
