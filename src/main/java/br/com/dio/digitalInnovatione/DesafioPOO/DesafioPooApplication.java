package br.com.dio.digitalInnovatione.DesafioPOO;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.dio.digitalInnovatione.DesafioPOO.model.BootCamp;
import br.com.dio.digitalInnovatione.DesafioPOO.model.Cursos;
import br.com.dio.digitalInnovatione.DesafioPOO.model.Dev;
import br.com.dio.digitalInnovatione.DesafioPOO.model.Mentorias;

@SpringBootApplication
public class DesafioPooApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioPooApplication.class, args);
	
		Cursos curso1 = new Cursos();
		Cursos curso2 = new Cursos();
		Cursos curso3 = new Cursos();
		Mentorias mentoria = new Mentorias();
		BootCamp bootcamp = new BootCamp();
		Dev devMaria = new Dev();
		Dev devJoao = new Dev();
		
		curso1.setCargaHoraria(80);
		curso1.setDescricao("Curso de Java");
		curso1.setTitulo("Java 8");
		
		curso2.setCargaHoraria(90);
		curso2.setDescricao("Curso de Cobol");
		curso2.setTitulo("Cobol 8");
		
		curso3.setCargaHoraria(60);
		curso3.setDescricao("Curso de JS");
		curso3.setTitulo("JavaScripts 8");
		
		mentoria.setTitulo("mentoria de Java");
		mentoria.setDescricao("descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		bootcamp.setNome("Bootcamp java Developer");
		bootcamp.setDescricao("Descrição do bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		bootcamp.getConteudos().add(mentoria);
		
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Maria" + devMaria.getConteudosInscritos());
		devMaria.progredir();
		System.out.println("Conteudos inscritos Maria" + devMaria.getConteudosInscritos());
		System.out.println("Conteudos concluidos Maria" + devMaria.getConteudosConcluidos());
		
		System.out.println("----------------");
		
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Joao" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("Conteudos inscritos Joao" + devJoao.getConteudosInscritos());
		System.out.println("Conteudos concluidos João" + devJoao.getConteudosConcluidos());

		
	}

}
