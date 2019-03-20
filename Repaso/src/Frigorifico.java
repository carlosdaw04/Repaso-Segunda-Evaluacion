
public class Frigorifico extends Electrodomestico {
	
	private boolean noFrost = false;
	
	public Frigorifico() {}

	public Frigorifico(float precio, float peso, boolean noFrost) throws Exception {
		super(precio, peso);
		this.noFrost = noFrost;
	}

	public Frigorifico(float precio, Color color, char consumo, float peso, boolean noFrost) throws Exception {
		super(precio, color, consumo, peso);
		this.noFrost = noFrost;
	}

	
	@Override
	public String toString() {
//		return "Frigorifico [NoFrost=" + noFrost + "]" + super.toString();
		return "Frigorifico [NoFrost=" + (noFrost ? "NoFrost" : "Normal") + "]" + super.toString();
	}
}