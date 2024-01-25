package com.projeto.jogoszerados.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
public class Zerado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer zeradoId;
    private String nome;
    private String console;
    private String dificuldade;
    private Date data;
    private Integer horasJogadas;
    private Integer minutosJogados;
    private String avaliacao;
    private String genero;

    @ManyToOne
    @JoinColumn(name = "id_user")
    @JsonIgnore
    public User user = new User();


    public Integer getZeradoId() {
        return zeradoId;
    }

    public void setZeradoId(Integer zeradoId) {
        this.zeradoId = zeradoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getHorasJogadas() {
        return horasJogadas;
    }

    public void setHorasJogadas(Integer horasJogadas) {
        this.horasJogadas = horasJogadas;
    }

    public Integer getMinutosJogados() {
        return minutosJogados;
    }

    public void setMinutosJogados(Integer minutosJogados) {
        this.minutosJogados = minutosJogados;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
