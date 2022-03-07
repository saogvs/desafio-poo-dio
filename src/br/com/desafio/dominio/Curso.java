package br.com.desafio.dominio;
import lombok.*;

public class Curso extends Conteudo {
    @Setter
    @Getter
    private int cargaHoraria;


    public Curso() {
    }


    @Override
    public Double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }



    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
