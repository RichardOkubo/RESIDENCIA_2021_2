package testes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Teste1 {

	public static void main(String[] args) {
		// System.out.println(objeto.getClass().getName() instanceof String);
		
		List<String> registros = new ArrayList<>();
		
		try (FileReader fr = new FileReader(new File("file.txt"));
			 BufferedReader br = new BufferedReader(fr)) {
			String registro;
			while ((registro = br.readLine()) != null) {
				registros.add(registro);
			}
		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
		System.out.println(registros);
	}
}
