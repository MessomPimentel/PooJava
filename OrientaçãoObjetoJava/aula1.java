package OrientadoObjeto;

public class aula1 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		c1.modelo = "bic";
		c1.cor = "Azul";
		c1.preco = 80;
		c1.ponta = 0.5f;
		c1.tampar();
		c1.carga = "cheia";

		c1.status();
		c1.rabiscar();

		System.out.println("--------------");

		Caneta c2 = new Caneta();
		c2.modelo = "Li";
		c2.cor = "preta";
		c2.ponta = 0.7f;
		c2.destampar();
		c2.carga = "cheia";
		c2.status();
		c2.rabiscar();

	}
}
