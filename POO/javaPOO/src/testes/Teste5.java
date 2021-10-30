package testes;

class Animal {
	public void emitirSom() {
		System.out.println("...");
	}
}

class Cachorro extends Animal {
	@Override
	public void emitirSom() {
		System.out.println("Latindo");
	}
}

public class Teste5 {
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.emitirSom();
	}
}
