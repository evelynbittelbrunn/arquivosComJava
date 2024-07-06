package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// File será um objeto que encapsula todo o projeto para acesso do arquivo
		// Também possibilita várias operações no arquivo
		File file = new File("c:\\temp\\in.txt");
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
//			Este if serve para casos que dê erro ao instanciar o scanner
//			Se não tiver esse tratamento, pode dar um NullPointerException
			if (sc != null) {
				// Fechamento colocado aqui pois se houvesse exceção
				// a execução do try seria cortada
				sc.close();
			}
		}
		
	}

}
