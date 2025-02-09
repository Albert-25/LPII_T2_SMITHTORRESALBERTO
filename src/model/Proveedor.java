package com.empresa.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="TBL_PROVEEDORCL2")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="NOMPROVEECL2", nullable=false)
    private String nombre;
    
    @Column(name="RUCPROVEECL2", nullable=false)
    private String ruc;
    
    @Column(name="RSOCIALPROVEECL2", nullable=false)
    private String razonSocial;
    
    @Column(name="EMAILPROVEECL2")
    private String email;
    
    @Temporal(TemporalType.DATE)
    @Column(name="FEINGPROVEECL2")
    private Date fechaIngreso;
}
