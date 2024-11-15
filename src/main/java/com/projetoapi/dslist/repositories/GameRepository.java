package com.projetoapi.dslist.repositories;

import com.projetoapi.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
