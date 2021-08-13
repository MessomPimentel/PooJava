package OrientadoObjeto;

public class Caneta3 {
	public String transparente;
	public String pequena;
	private String cor;
	private boolean tampada;

	public Caneta3(String t, String c, String p) { // Este é o método construtor
		this.transparente = t;
		this.cor = c;
		this.pequena = p;
		this.tampar();

	}

	public String getTransparente() {
		return this.transparente;
	}

	public void setTransparente(String t) {
		this.transparente = t;
	}

	public String getPequena() {
		return this.pequena;
	}

	public void setPequena(String p) {
		this.pequena = p;

	}
	public void tampar() {
		this.tampada = true;
	}
	public void dest() {
		this.tamp = false;
	}

	public void status() {
		System.out.println("Sobre a caneta:");
		System.out.println("Transparente: " + this.getTransparente());
		System.out.println("Pequena: " + this.getPequena());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}

}
