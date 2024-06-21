import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprenada a programar em Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Aprenada a programar em JavaScript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria JavaScript");
        mentoria1.setDescricao("Aprenada a programar em JavaScript");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria JavaScript");
        mentoria2.setDescricao("Aprenada a programar em JavaScript");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Santander Java Developer");
        bootcamp.setDescricao("Torne-se um programador Java na Santander");
        bootcamp.getCondeudos().add(curso1);
        bootcamp.getCondeudos().add(curso2);
        bootcamp.getCondeudos().add(mentoria1);
        bootcamp.getCondeudos().add(mentoria2);

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Caio: " + devCaio.getConteudosInscritos());
        devCaio.progredir();
        devCaio.progredir();
        devCaio.progredir();
        devCaio.progredir();
        System.out.println("-----");
        System.out.println("Conteúdos Inscritos Caio: " + devCaio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Caio: " + devCaio.getConteudosConcluidos());
        System.out.println("XP: " + devCaio.calcularXP());

        System.out.println("------------------------");

        Dev devVini = new Dev();
        devVini.setNome("Vinicius Guimaraes Cesar");
        devVini.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Vini: " + devVini.getConteudosInscritos());
        devVini.progredir();
        devVini.progredir();
        devVini.progredir();
        devVini.progredir();
        System.out.println("-----");
        System.out.println("Conteúdos Inscritos Vini: " + devVini.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Vini: " + devVini.getConteudosConcluidos());
        System.out.println("XP: " + devVini.calcularXP());

    }
}
