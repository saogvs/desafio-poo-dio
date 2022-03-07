package br.com.desafio.dominio;

import lombok.*;

@Getter
@Setter
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10;

    private String titulo;
    private String descricao;

    public abstract Double calcularXP();


}
