package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		List<Lesson> list = new ArrayList<>();

		System.out.print("Quantas aulas tem o curso? ");
		int n = entrada.nextInt();
		

		for (int i = 1 ; i <= n ; i++) {
			
			System.out.println();
			System.out.println("Dados da "+i+"a aula: ");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char ch = entrada.next().charAt(0);
			entrada.nextLine();
			System.out.print("Título: ");
			String titulo = entrada.nextLine();
			
			if (ch == 'c') {
				System.out.print("URL do vídeo: ");
				String url = entrada.nextLine();
				System.out.print("Duração em segundos: ");
				int segundos = entrada.nextInt();
				list.add(new Video (titulo,url,segundos));
			}
			else{
				System.out.print("Descrição: ");
				String desc = entrada.nextLine();
				System.out.print("Quantidade de questões: ");
				int quest = entrada.nextInt();
				list.add(new Task(titulo, desc,quest));
			}
			
		}
		entrada.close();
		
		int seg = 0;
		for(Lesson les:list) {
			int time = les.duration();
			seg += time;
		}
		
		System.out.println("DURAÇÃO TOTAL DO CURSO = "+seg+" segundos");

	}

}
