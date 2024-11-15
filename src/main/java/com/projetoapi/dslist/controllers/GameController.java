package com.projetoapi.dslist.controllers;

import com.projetoapi.dslist.dto.GameMinDTO;
import com.projetoapi.dslist.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameMinDTO> getGames() {
        return gameService.findAll();
    }
}
