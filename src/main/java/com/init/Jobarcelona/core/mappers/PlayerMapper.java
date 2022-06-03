package com.init.Jobarcelona.core.mappers;

import java.util.List;

import com.init.Jobarcelona.core.mappers.dtos.*;
import com.init.Jobarcelona.domain.Champ;
import com.init.Jobarcelona.domain.Continent;
import com.init.Jobarcelona.domain.Cup;
import com.init.Jobarcelona.domain.Player;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

    // Mapping from Player to DTO
    PlayerDto toPlayerDto(Player player);

    // Mapping from DTO to Player
    Player toPlayer(PlayerDto playerDTO );

    // Mapping from Player's List to DTO's List
    List<PlayerDto> toPlayerDto(List<Player> players);

    // Mapping from SimplePlayer to DTO
    SimplePlayerDto toSimplePlayerDto(Player player);

    // Mapping from DTO to SimplePlayer
    Player toPlayer(SimplePlayerDto SimpleplayerDTO );

    // Mapping from SimplePlayer's List to DTO's List
    List<SimplePlayerDto> toSimplePlayerDto(List<Player> players);

    // Mapping from Champ to DTO
    ChampDto toSimpleChampDto(Champ champ);

    // Mapping from DTO to Champ
    Champ toChamp(ChampDto champDTO );

    // Mapping from Continent to DTO
    ContinentDto toContinentDto(Continent continent);

    // Mapping from DTO to Continent
    Continent toContinent(Continent continent);


    // Mapping from Cup to DTO
    CupDto toCupDto(Cup cup);

    // Mapping from DTO to Cup
    Cup toCup(Cup cup);


}
