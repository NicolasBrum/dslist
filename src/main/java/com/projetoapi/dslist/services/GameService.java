package com.projetoapi.dslist.services;

import com.projetoapi.dslist.dto.GameMinDTO;
import com.projetoapi.dslist.entities.Game;
import com.projetoapi.dslist.repositories.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<GameMinDTO> findAll(){
       return gameRepository.findAll()
                .stream()
                .map(game -> new GameMinDTO(game))
                .toList();
    }
}
