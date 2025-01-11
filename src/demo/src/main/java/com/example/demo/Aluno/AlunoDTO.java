package com.example.demo.Aluno;

import java.io.Serializable;
import java.util.List;

public class AlunoDTO implements Serializable {

    private Long id;
    private String name;
    private List<Double> notas;
    private Double media;

    public AlunoDTO() {
    }

    public AlunoDTO(Aluno aluno) {
        this.id = aluno.getId();
        this.name = aluno.getName();
        this.notas = aluno.getNotas();
        this.media = aluno.getMedia();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

}
