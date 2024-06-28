import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(6);

        //Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java"); 
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcam Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeny = new Dev();
        devLeny.setNome("Leny");
        devLeny.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Lenny " + devLeny.getConteudosInscritos());
        devLeny.progredir();
        devLeny.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Lenny " + devLeny.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Lenny " + devLeny.getConteudosConcluidos());
        System.out.println("XP: " +  devLeny.calcularXp());

        System.out.println("-----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos João " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXp());

    }
}