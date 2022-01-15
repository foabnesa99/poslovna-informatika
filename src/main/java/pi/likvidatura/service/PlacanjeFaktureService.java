package pi.likvidatura.service;

import pi.likvidatura.service.dto.DnevnoStanjeDTO;
import pi.likvidatura.service.dto.PlacanjeFaktureDTO;

import java.util.List;
import java.util.Optional;

public interface PlacanjeFaktureService {

    PlacanjeFaktureDTO save(PlacanjeFaktureDTO placanjeFaktureDTO);

    List<PlacanjeFaktureDTO> findAll();


    Optional<PlacanjeFaktureDTO> findOne(Long id);

    void delete(Long id);
}
