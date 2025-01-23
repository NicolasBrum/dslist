package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dtos.GameMinDTO;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        var resposta = gameRepository.findAll();
        if(resposta.isEmpty()){
            return null;
        }
        return resposta.stream().map(g -> new GameMinDTO(g)).toList();
    }
}
