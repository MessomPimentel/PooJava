package OrientadoObjeto;

public class aula2 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		c1.modelo = "BIC";
		c1.cor = "Azul";
		c1.preco = 10;
		// privado c1.ponta = 0.5f;
		c1.carga = "50";
		// c1.tampada = false;
		c1.tampar();
		c1.status();
		c1.rabiscar();
	}

}
