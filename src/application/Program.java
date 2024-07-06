package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

/** LENDO ARQUIVO DE TEXTO COM CLASSES FILE E SCANNER
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
**/
		
/** FILE READER E BUFFERED READER - FORMA NÃO INDICADA
		String path = "c:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
//			Esquema de buffer deixa a leitura mais rápida
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				
				if (fr != null) {
					fr.close();
				}	
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
**/
		
		String path = "c:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		
	}

}
