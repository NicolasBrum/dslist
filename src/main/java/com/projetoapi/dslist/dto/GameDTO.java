package com.projetoapi.dslist.dto;

import com.projetoapi.dslist.entities.Game;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Setter
@Getter
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(Game game) {
        BeanUtils.copyProperties(game, this); //Copia os atributos da classe do parametro pra esse obj
    }
}
