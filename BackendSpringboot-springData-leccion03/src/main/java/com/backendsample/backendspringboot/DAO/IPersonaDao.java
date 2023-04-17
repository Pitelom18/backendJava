package com.backendsample.backendspringboot.DAO;

import com.backendsample.backendspringboot.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Long> {
}
