package com.projetoapi.dslist.services;

import com.projetoapi.dslist.dto.GameMinDTO;
import com.projetoapi.dslist.dto.GameDTO;
import com.projetoapi.dslist.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
       return gameRepository.findAll()
                .stream()
                .map(game -> new GameMinDTO(game))
                .toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        if(gameRepository.findById(id).isPresent()){
            var game = gameRepository.findById(id).get();
            return new GameDTO(game);
        }
        return null;
    }
}
