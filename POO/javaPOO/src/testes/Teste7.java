package testes;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;

class OS {
	public void ligar() { System.out.println("Ligando..."); }
	public void desligar() { System.out.println("Desligando..."); }
}

class WindowsXP extends OS {
	@Override public void ligar() {
		System.out.println("Bem-vindo!");
		Teste7.init();
	}
	
	@Override public void desligar() {
		System.out.println("Até breve!");
		Teste7.exit();
	}
}

public class Teste7 {
	
	public static void main(String[] args) {
		
		WindowsXP windowsXP = new WindowsXP();
				   
		windowsXP.ligar();
		
		windowsXP.desligar();
	}

	public static void init() {
		AudioInputStream audioStreamTurnOn = null;
		try {
			audioStreamTurnOn = AudioSystem.getAudioInputStream(new File("turnOn.wav"));
		} catch (UnsupportedAudioFileException | IOException e) {
			e.printStackTrace();
		}
		Clip clipTurnOn = null;
		try {
			clipTurnOn = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
		try {
			clipTurnOn.open(audioStreamTurnOn);
		} catch (LineUnavailableException | IOException e) {
			e.printStackTrace();
		}
		clipTurnOn.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clipTurnOn.close();
	}
	
	public static void exit() {
		AudioInputStream audioStreamTurnOff = null;
		try {
			audioStreamTurnOff = AudioSystem.getAudioInputStream(new File("turnOff.wav"));
		} catch (UnsupportedAudioFileException | IOException e) {
			e.printStackTrace();
		}
		Clip clipTurnOff = null;
		try {
			clipTurnOff = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
		try {
			clipTurnOff.open(audioStreamTurnOff);
		} catch (LineUnavailableException | IOException e) {
			e.printStackTrace();
		}
		clipTurnOff.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clipTurnOff.close();
	}
}
