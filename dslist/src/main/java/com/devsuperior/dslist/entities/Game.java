package com.devsuperior.dslist.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String plataform;
    private String ShortDescription;
    private String LongDescription;

}
