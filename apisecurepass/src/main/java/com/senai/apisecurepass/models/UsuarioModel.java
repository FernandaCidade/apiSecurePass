package com.senai.apisecurepass.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_usuario")
public class UsuarioModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String matricula;
    private String nome;
    private String area;
    private String email;
    private String dataNasc;
    private String funcao;
    private String sessao;
    private String face;

   //Referenciar sempre as tabelas do banco como  @ManytoONe
    @OneToOne
    @JoinColumn(name="id_TipoUsuario", referencedColumnName = "id")
    private TipoUsuarioModel usuario;


    @OneToOne
    @JoinColumn(name="id_TipoUsuario", referencedColumnName = "id")
    private TipoUsuarioModel adm;


}