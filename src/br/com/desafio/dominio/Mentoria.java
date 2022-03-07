package br.com.desafio.dominio;

import lombok.*;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    public Mentoria() {
    }

    @Getter
    @Setter
    private LocalDate data;

    @Override
    public Double calcularXP() {
        return XP_PADRAO + 20d;
    }



    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
