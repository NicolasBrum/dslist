package com.projetoapi.dslist.services;

import com.projetoapi.dslist.dto.GameListDTO;
import com.projetoapi.dslist.entities.GameList;
import com.projetoapi.dslist.repositories.GameListRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    private GameListRepository gameListRepository;

    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    @Transactional(readOnly = true)
    public List<GameListDTO> findAllList(){
       return gameListRepository.findAll().stream().map(list -> new GameListDTO(list)).toList();
    }
}
