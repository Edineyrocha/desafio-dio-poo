import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Curso Java descricao");
		curso1.setCargaHoraria(8);
		//System.out.println(curso1);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Curso JS descricao");
		curso2.setCargaHoraria(4);
		//System.out.println(curso2);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setDescricao("Descricao Mentoria de Java");
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setData(LocalDate.now());
		//System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devEdiney = new Dev();
		devEdiney.inscreverBootcamp(bootcamp);
		devEdiney.setNome("Ediney");
		
		
		System.out.println("Conteudos Inscritos" + devEdiney.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devEdiney.getConteudosConcluidos());
		Dev devCamila = new Dev();
		devCamila.inscreverBootcamp(bootcamp);
		devCamila.setNome("Camila");
		
		System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		
		System.out.println("Conteudos Concluidos" + devCamila.getConteudosConcluidos());
		devEdiney.progredir();
		
		System.out.println("xp"+ devCamila.calcularTotalXp());
		System.out.println("xp" + devEdiney.calcularTotalXp());
		
		
	}
	

}
