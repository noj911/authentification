package com.movie.security.repository;

import com.movie.security.entity.Validation;
import org.springframework.data.repository.CrudRepository;
import tech.chillo.avis.entite.Validation;

import java.util.Optional;

public interface ValidationRepository extends CrudRepository<Validation, Integer> {

    Optional<Validation> findByCode(String code);
}
