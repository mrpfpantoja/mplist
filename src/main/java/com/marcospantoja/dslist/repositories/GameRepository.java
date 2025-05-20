package com.marcospantoja.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcospantoja.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
    // Custom query methods can be defined here if needed
    // For example, you can add methods to find games by title, genre, etc.

}
