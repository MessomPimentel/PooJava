package OrientadoObjeto;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		
		Carro c1 = new Carro();
		c1.marca = "GM";
		c1.modelo = "camaro";
		c1.ano = 1969;
		c1.cor = "amarelo";
		c1.placa = "EEE 1384";
		c1.portas = 2;
		c1.velocidadeMaxima = 220;
		c1.portaAberta();
		
		c1.status();
		c1.fecharPorta();
		
		System.out.println("-----------------");
		
		Carro c2 = new Carro();
		c2.marca = "Ford";
		c2.modelo = "Mustang";
		c2.ano = 1969;
		c2.cor = "Azul";
		c2.placa = "BBJ 1584";
		c2.portas = 2;
		c2.velocidadeMaxima = 220;
		c2.AbrirPorta();
		
		c2.status();
		c2.fecharPorta();
		
	}
		
}
