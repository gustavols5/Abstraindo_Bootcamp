import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descriçao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descriçao Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devCamila.getConteudosInscrito());
        devCamila.progredir();
        System.out.println("-------------------");

        System.out.println("Conteudos Concluidos " + devCamila.getConteudosConcluido());
        System.out.println("Conteudos Inscritos " + devCamila.getConteudosInscrito());
        System.out.println("XP" + devCamila.calcularTotalXp());

        System.out.println("==================");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devJoao.getConteudosInscrito());
        devJoao.progredir();
        System.out.println("----------------------");

        System.out.println("Conteudos Concluidos " + devJoao.getConteudosConcluido());
        System.out.println("Conteudos Inscritos " + devJoao.getConteudosInscrito());
        System.out.println("XP" + devJoao.calcularTotalXp());

    }
}