import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAndre = new Dev();
        devAndre.setNome("André");
        devAndre.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos André:" + devAndre.getConteudosInscritos());
        devAndre.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos André:" + devAndre.getConteudosInscritos());
        System.out.println("Conteudos Concluidos André:" + devAndre.getConteudosConcluidos());
        System.out.println("XP:" + devAndre.calcularTotalXp());

        System.out.println("--------------");

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Ana:" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Ana:" + devAna.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Ana:" + devAna.getConteudosConcluidos());
        System.out.println("XP:" + devAna.calcularTotalXp());
    }
}
