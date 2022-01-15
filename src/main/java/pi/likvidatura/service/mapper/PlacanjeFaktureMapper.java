package pi.likvidatura.service.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import pi.likvidatura.domain.BankarskiRacun;
import pi.likvidatura.domain.PlacanjeFakture;
import pi.likvidatura.service.dto.BankarskiRacunDTO;
import pi.likvidatura.service.dto.PlacanjeFaktureDTO;

@Mapper(componentModel = "spring", uses = {IzlaznaFakturaMapper.class, StavkaIzvodaMapper.class})
public interface PlacanjeFaktureMapper extends EntityMapper<PlacanjeFaktureDTO, PlacanjeFakture> {

    @Mapping(target = "faktura", source = "faktura", qualifiedByName = "id")
    @Mapping(target = "izvod", source = "izvod", qualifiedByName = "id")
    PlacanjeFaktureDTO toDto(PlacanjeFakture p);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PlacanjeFaktureDTO toDtoId(PlacanjeFakture placanjeFakture);
}
