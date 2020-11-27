package com.example.practica.repositories;

import com.example.practica.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List <Persona> search(@Param("filtro")String filtro);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page <Persona> search(@Param("filtro")String filtro,Pageable pageable);
}
