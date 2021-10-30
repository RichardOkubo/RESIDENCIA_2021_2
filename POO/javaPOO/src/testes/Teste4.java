package testes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Teste4 {

	public static void main(String[] args)
			throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		String arquivo = "elevator-music.wav";
		
		String[] opcoes = {
				"[ P ] play",
				"[ S ] stop",
				"[ R ] reset",
				"[ Q ] quit",
		};

		try (Scanner scanner = new Scanner(System.in)) {
			
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(arquivo));
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			
			String escolha = "";
			
			do {
				for (String opcao : opcoes) System.out.println(opcao);
				System.out.print("Escolha uma opção: ");
				
				escolha = scanner.next();
				escolha = escolha.toUpperCase();
				   
				switch(escolha) {
					case ("P"): clip.start();
						break;
					case ("S"): clip.stop();
						break;
					case ("R"): clip.setMicrosecondPosition(0);
						break;
					case ("Q"): clip.close();
						break;
					default: System.out.println("Opção indisponível!");
				}
			} while (!escolha.equals("Q"));
		}
	}

}
