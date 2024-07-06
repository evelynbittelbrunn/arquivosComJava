package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
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
		
/** FILE READER E BUFFERED READER - FORMA INDICADA
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
		
**/
		
		String[] lines = new String[] {"OI", "Teste"};
		
		String path = "c:\\temp\\out.txt";
		
//		Cria um arquivo novo com as linhas
//		Caso já exista um arquivo de mesmo nome, ele destrói e cria novamente
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
//		Edita um arquivo já criado, adicionando as linhas nele	
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
