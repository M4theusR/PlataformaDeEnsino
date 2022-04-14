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
			System.out.print("Conte�do ou tarefa (c/t)? ");
			char ch = entrada.next().charAt(0);
			entrada.nextLine();
			System.out.print("T�tulo: ");
			String titulo = entrada.nextLine();
			
			if (ch == 'c') {
				System.out.print("URL do v�deo: ");
				String url = entrada.nextLine();
				System.out.print("Dura��o em segundos: ");
				int segundos = entrada.nextInt();
				list.add(new Video (titulo,url,segundos));
			}
			else{
				System.out.print("Descri��o: ");
				String desc = entrada.nextLine();
				System.out.print("Quantidade de quest�es: ");
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
		
		System.out.println("DURA��O TOTAL DO CURSO = "+seg+" segundos");

	}

}
