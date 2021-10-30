package exercicios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Map<String, String> estados = new HashMap<>();
		
		estados.put("RJ", "Rio de Janeiro");
		estados.put("SP", "São Paulo");
		estados.put("MG", "Minas Gerais");
		estados.put("BA", "Bahia");
		estados.put("RS", "Rio Grande do Sul");
		estados.put("SC", "Santa Catarina");
		estados.put("MT", "Mato Grosso");
		estados.put("AM", "Amazonas");
		estados.put("AC", "Acre");
		estados.put("ES", "Espírito Santo");
		
		List<String> siglas = Arrays.asList("RJ", "SP", "MG", "BA", "RS", "SC", "MT", "AM", "AC", "ES");
		
		for (int i = 0; i < siglas.size(); i++)
			System.out.println(siglas.get(i) + " - " + estados.get(siglas.get(i)) );
		
		System.out.println();
		
		for (String sigla : estados.keySet())
			System.out.println(sigla + " - " + estados.get(sigla));
	}
}
