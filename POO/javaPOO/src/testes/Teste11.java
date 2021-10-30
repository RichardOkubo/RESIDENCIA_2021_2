package testes;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Teste11 {

	public static void main(String[] args) throws IOException {
		
		String cpf = "111.111.111-11";

		Path path = Paths.get("text.txt");
		
		int posicaoDaLinha = 0;
		
	    List<String> linhas = Files.readAllLines(path, StandardCharsets.UTF_8);
	    
	    for (String linha : linhas) {
	    	
	    	if (linha.startsWith(cpf)) {
	    		String[] registro = linha.split(";");
	    		
	    		registro[9] = "abacate";
	    		
	    		String registro_alterado = String.join(";", registro);
	    		
	    		linhas.set(posicaoDaLinha, registro_alterado);
	    	}
	    	
	    	posicaoDaLinha++;
	    }
	    
	    Files.write(path, linhas, StandardCharsets.UTF_8);

	}
}
