package OrientadoObjeto;

public class Carro {

	String marca;
	String modelo;
	int ano;
	String cor;
	String placa;
	int portas;
	float velocidadeMaxima;
	boolean acelerar;

	void status() {

		System.out.println("marca:" + this.marca);
		System.out.println("modelo: " + this.modelo);
		System.out.println("ano: " + this.ano);
		System.out.println("cor: " + this.cor);
		System.out.println("placa: " + this.placa);
		System.out.println("portas: " + this.portas);
		System.out.println("velocidadeMaxima: " + this.velocidadeMaxima);
		System.out.println("porta fechada: " + this.acelerar);
	}

	void fecharPorta() {
		if(this.acelerar == true) {
			System.out.println("Posso acelerar!!!");
		}else {
			System.out.println("ERRO!!Nâo posso acelerar!!!");
		}
		
	}

	void portaAberta() {
		this.acelerar = false;
	}
	
	void AbrirPorta() {
		this.acelerar = true;
	}

}
