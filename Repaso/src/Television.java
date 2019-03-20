
public class Television extends Electrodomestico {
	
	int pulgadas = 20;
	private boolean sintonizador = false;
	
	public Television() {
		
	}

	public Television(float precio, float peso, int pulgadas, boolean sintonizador) throws Exception {
		super(precio, peso);
		setPulgadas(pulgadas);
		this.sintonizador = sintonizador;
	}

	public Television(float precio, Color color, char consumo, float peso, int pulgadas, boolean sintonizador) throws Exception {
		super(precio, color, consumo, peso);
		setPulgadas(pulgadas);
		this.sintonizador = sintonizador;
	}

	private void setPulgadas(int pulgadas) throws Exception {
		if(pulgadas < 0 || pulgadas > 80) {
			throw new Exception ("Error: valor de pulgadas: " + pulgadas + ". No puede ser mayor que 90 o negativo.");
		}
		this.pulgadas = pulgadas;
	}
	
	@Override
	public String toString() {
		
		return "Television [Pulgadas=" + pulgadas + ", sintonizador=" + (sintonizador ? "HD" : "Normal") + "]" + super.toString();
	}

}
