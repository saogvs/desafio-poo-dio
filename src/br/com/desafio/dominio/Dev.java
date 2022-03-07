package br.com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
public class Dev {
        private String nome;
        private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
        private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

        public void inscreverBootcamp(Bootcamp bootcamp){
            this.conteudosInscritos.addAll(bootcamp.getConteudos());
            bootcamp.getDevInscritos().add(this);
        }

        public void progredir(){
            Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
            if(conteudo.isPresent()){
                this.conteudosConcluidos.add(conteudo.get());
                this.conteudosInscritos.remove(conteudo.get());
            }else{
                System.err.println("Você não esta matriculado em nenhum conteudo!");
            }
        }
        public double calcularTotalXp(){
            return this.conteudosConcluidos
                    .stream()
                    .mapToDouble(Conteudo::calcularXP)
                    .sum();
        }

}
