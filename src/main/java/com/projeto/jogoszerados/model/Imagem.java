package com.projeto.jogoszerados.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="imagem")
public class Imagem {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer imagemId;

    private String urlImagem;

    private Boolean imagemZeramento;

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public Boolean getImagemZeramento() {
        return imagemZeramento;
    }

    public void setImagemZeramento(Boolean imagemZeramento) {
        this.imagemZeramento = imagemZeramento;
    }

    public Zerado getZerado() {
        return zerado;
    }

    public void setZerado(Zerado zerado) {
        this.zerado = zerado;
    }

    @ManyToOne
    @JoinColumn(name = "zerado_id")
    @JsonIgnore
    public Zerado zerado = new Zerado();

}
