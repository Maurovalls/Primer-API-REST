package com.example.practica.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "autor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Autor extends Base {

    @Column(name = "apellido")
    private String apellido;
    @Column(name = "biografia")
    private String biografia;
    @Column(name = "nombre")
    private String nombre;
}
