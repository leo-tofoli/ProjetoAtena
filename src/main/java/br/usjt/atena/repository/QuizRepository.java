package br.usjt.atena.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.atena.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
