package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Teste10 {

	public static void main(String[] args) throws IOException {
		
		String cpf = "111.111.111-11";
		
		String linha;
		
		try (BufferedReader buffReader = new BufferedReader(new FileReader("./text.txt"))) {
			
			try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter("./text.txt"))) {
				
				while ( (linha = buffReader.readLine()) != null ) {
					
					if (linha.startsWith(cpf)) {
						
						String[] registro = linha.split(";");  	// { 111.111.111-11, 1111, Vinicius Calmon, t, 20000, t, 50000, 214323845, 001, DIRETOR }
						
						registro[9] = "DESEMPREGADO"; 			// { 111.111.111-11, 1111, Vinicius Calmon, t, 20000, t, 50000, 214323845, 001, DESEMPREGADO }
						
						String registro_alterado = String.join(";", registro);
						
						buffWrite.write(registro_alterado);
					} else {
						buffWrite.write(linha);
					}
				}	
			}
			
		}
	}

}
