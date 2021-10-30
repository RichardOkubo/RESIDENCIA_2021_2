package exemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeituraEscrita {
	
	final static String PATH_BASICO = "./temp/";
	final static String EXTENSAO = ".txt";
	
	public static void leitor(String path) throws IOException{

		try {
			BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path));
			String linha = "";

			while (true) {
				linha = buffRead.readLine();
				if (linha != null) {
					System.out.println(linha);
				} else
					break;
			}
			
			buffRead.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado no local especificado " + PATH_BASICO + path);
		}
	}
	
	public static void escritor(String path) throws IOException {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Escreva o nome do arquivo: ");
		String nome = scn.next();
		
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO));
		String linha = "";
		
		System.out.print("Escreva algo: ");
		linha = scn.next();
		
		buffWrite.append(linha + "\n");
		buffWrite.close();
		
		scn.close();
	}
	
}
