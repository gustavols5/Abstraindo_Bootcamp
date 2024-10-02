package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{


   private LocalDate data;

    @Override
    public double calcularXp() {
        return xpPadrao + 20d;
    }




    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }




    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                ", titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }
}
