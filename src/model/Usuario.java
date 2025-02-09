package com.empresa.model;
import javax.persistence.*;

@Entity
@Table(name="TBL_USUARIOCL2")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="USUARIOCL2", unique=true, nullable=false)
    private String usuario;
    
    @Column(name="PASSWORDCL2", nullable=false)
    private String password;
}
