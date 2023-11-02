package com.senai.apisecurepass.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public class UsuarioMaquinaModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //gera automaticamente o id do usuario
    @Column(name = "id", nullable = false)
    private UUID id;
    private Boolean pemissao;

    @ManyToMany
    @JoinColumn(name="id_Usuario", referencedColumnName = "id")
    private UsuarioModel usuario;

    @ManyToMany
    @JoinColumn(name="id_Maquina", referencedColumnName = "id")
    private MaquinaModel Maquina;
}
