package com.example.practica.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Persona extends Base {

    @Column(name = "apellido")
    private String apellido;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "dni" , unique = true)
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "persona_libro" ,
               joinColumns = @JoinColumn(name = "persona_id"),
               inverseJoinColumns = @JoinColumn(name = "libro_id"))
    private List<Libro> libros=new ArrayList<Libro>();
}
