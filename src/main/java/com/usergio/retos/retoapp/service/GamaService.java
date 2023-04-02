package com.usergio.retos.retoapp.service;

import com.usergio.retos.retoapp.modelo.entidad.Gama;
import com.usergio.retos.retoapp.modelo.repositorio.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {
    @Autowired
    private GamaRepository repository;

    /**
     * Metodo getAll lista los registros de la tabla gama
     * @return List Objeto Gama
     */
    public List<Gama> getAll(){
        return repository.findAll();
    }
    /**
     * metodo save guarda registro en la tabla gama
     * return objeto tipo Gama
     * */
    public Gama save(Gama gama){
        return repository.save(gama);
    }


}
