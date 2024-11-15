import br.com.desadio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(); // 'new' instancia a classe.
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(); // 'new' instancia a classe.
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devItalo = new Dev();
        devItalo.setNome("Italo");
        devItalo.inscreverBootcamp(bootcamp);
        System.out.printf("Conteudos Inscritos" + devItalo.getConteudosInscritos());

        Dev devLuke = new Dev();
        devLuke.setNome("Luke");
        devLuke.inscreverBootcamp(bootcamp);
        System.out.printf("Conteudos Inscritos" + devLuke.getConteudosInscritos());



    }
}