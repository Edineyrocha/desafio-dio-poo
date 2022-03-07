import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescriçao("Curso Java descricao");
		curso1.setCargaHoraria(8);
		System.out.println(curso1);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescriçao("Curso JS descricao");
		curso2.setCargaHoraria(4);
		System.out.println(curso2);
		
		Mentoria mentoria1= new Mentoria();
		mentoria1.setDescriçao("Descricao Mentoria de Java");
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setData(LocalDate.now());
		System.out.println(mentoria1);
	}

}