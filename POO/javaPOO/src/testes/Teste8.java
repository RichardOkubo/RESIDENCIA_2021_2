package testes;

import java.io.File;

public class Teste8 {

	public static void main(String[] args) {
		
		File file = new File("src/testes/" + "file.txt");
		System.out.println(file.getAbsolutePath());
	}

}
