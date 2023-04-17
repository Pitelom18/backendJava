package com.backendsample.backendspringboot.Servicios;

import com.backendsample.backendspringboot.DAO.IPersonaDao;
import com.backendsample.backendspringboot.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    private IPersonaDao personaDao;
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        //find.all retorna un tipo object por eso se hace un cast a List<Persona> para que regrese una lista de personas
        return (List<Persona>) personaDao.findAll();

    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
}
