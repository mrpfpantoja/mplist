package com.marcospantoja.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcospantoja.dslist.dto.GameMinDTO;
import com.marcospantoja.dslist.entities.Game;
import com.marcospantoja.dslist.services.GameService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;
    
    // Corrigido: Endpoint GET para listar todos os jogos
    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
