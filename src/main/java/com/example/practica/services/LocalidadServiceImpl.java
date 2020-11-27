package com.example.practica.services;

import com.example.practica.entities.Localidad;
import com.example.practica.repositories.BaseRepository;
import com.example.practica.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;


    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
