package com.projetoapi.dslist.dto;

import com.projetoapi.dslist.entities.GameList;
import lombok.Getter;

@Getter
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO() {}

    public GameListDTO(GameList gameList) {
        this.id = gameList.getId();
        this.name = gameList.getName();
    }
}
