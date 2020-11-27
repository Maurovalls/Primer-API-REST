package com.example.practica.repositories;

import com.example.practica.entities.Autor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends BaseRepository<Autor,Long>  {
    @Query(value = "SELECT a FROM Persona a WHERE a.nombre LIKE %:filtro% OR a.apellido LIKE %:filtro%")
    List<Autor> search(@Param("filtro")String filtro);

    @Query(value = "SELECT a FROM Persona a WHERE a.nombre LIKE %:filtro% OR a.apellido LIKE %:filtro%")
    Page<Autor> search(@Param("filtro")String filtro, Pageable pageable);
}
