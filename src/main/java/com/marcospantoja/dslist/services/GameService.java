package com.marcospantoja.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcospantoja.dslist.dto.GameDTO;
import com.marcospantoja.dslist.dto.GameMinDTO;
import com.marcospantoja.dslist.entities.Game;
import com.marcospantoja.dslist.repositories.GameRepository;
import com.marcospantoja.projections.GameMinProjection;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(long id) {
        com.marcospantoja.dslist.entities.Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
       return result.stream().map(x -> new GameMinDTO(x)).toList();
       
    }
     @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listid) {
        List<GameMinProjection> result = gameRepository.searchByList(listid);
       return result.stream().map(x -> new GameMinDTO(x)).toList();
       
    }
}
