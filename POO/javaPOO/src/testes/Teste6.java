package testes;

class SistemaOperacional { // OS
	public void ligar() { System.out.println("Ligando..."); }
	public void desligar() { System.out.println("Desligando..."); }
}

class Windows extends SistemaOperacional {
//	@Override public void ligar() { System.out.println("Bem-vindo!"); }
}

public class Teste6 {
	public static void main(String[] args) {
		
		Windows windows = new Windows();
		
		windows.ligar();
		windows.desligar();
	}
}
