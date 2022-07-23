import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
  Curso curso1 = new Curso();
  curso1.setTitulo("Curso java");
  curso1.setDescricao("descricao curso java");
  curso1.setCargaHoraria(8);

  Curso curso2 = new Curso();
  curso2.setTitulo("Curso HTML");
  curso2.setDescricao("descricao curso HTML");
  curso2.setCargaHoraria(10);



  Mentoria mentoria = new Mentoria();
  mentoria.setTitulo("Mentoria de Java");
  mentoria.setDescricao("Descricao mentoria Java");
      mentoria.setData(LocalDate.now());


//  System.out.println(curso1);
//  System.out.println(curso2);
//  System.out.println(mentoria);*/

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java Developer");
      bootcamp.setDescricao("Desmistificando Java");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(mentoria);

      System.out.println("-----------------------------------------");
      Dev devNayara = new Dev();
      devNayara.setNome("Nayara");
      devNayara.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos Inscritos Nayara" + devNayara.getConteudosInscritos());
      devNayara.progredir();
      System.out.println("-----------------------------------------");
      System.out.println("Conteudos Concluidos Nayara" + devNayara.getConteudosInscritos());
      System.out.println("Conteudos Concluidos Nayara" + devNayara.getConteudosConcluidos());
      System.out.println("XP: "+ devNayara.calcularTotalXp());


        System.out.println("-----------------------------------------");
        Dev devRenato = new Dev();
      devRenato.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos Inscritos Renato " + devRenato.getConteudosInscritos());
      devRenato.progredir();
       devRenato.progredir();
       devRenato.progredir();
       System.out.println("-----------------------------------------");
       System.out.println("Conteudos Concluidos Renato " + devRenato.getConteudosInscritos());
       System.out.println("Conteudos Concluidos Renato " + devRenato.getConteudosConcluidos());
       System.out.println("XP: "+ devRenato.calcularTotalXp());





    }
}
