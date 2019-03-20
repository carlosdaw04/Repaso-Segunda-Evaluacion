
public class Lavadora extends Electrodomestico {
	
	private int carga = 5;
	
	public Lavadora() {}

	public Lavadora(float precio, float peso, int carga) throws Exception {
		super(precio, peso);
		setCarga(carga);
//		if(carga != 4 && carga != 5 && carga != 6 && carga != 7 && carga != 8 
//				&& carga != 9 && carga != 10 && carga != 11 && carga != 13) {
//			throw new Exception ("Error: valor de carga: " + carga + ". Entre 4-13 sin 12.");
//		}
//		this.carga = carga;
		
	}

	public Lavadora(float precio, Color color, char consumo, float peso, int carga) throws Exception {
		super(precio, color, consumo, peso);
		setCarga(carga);
//		if(carga != 4 && carga != 5 && carga != 6 && carga != 7 && carga != 8 
//				&& carga != 9 && carga != 10 && carga != 11 && carga != 13) {
//			throw new Exception ("Error: valor de carga: " + carga + ". Entre 4-13 sin 12.");
//		}
//		this.carga = carga;
	}
	
	private void setCarga(int carga) throws Exception {
		if(carga != 4 && carga != 5 && carga != 6 && carga != 7 && carga != 8 
				&& carga != 9 && carga != 10 && carga != 11 && carga != 13) {
			throw new Exception ("Error: valor de carga: " + carga + ". Entre 4-13 sin 12.");
		}
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "]" + super.toString();
	}
	
	@Override
	public float precioFinal() {
		float precioFinal = super.precioFinal();
		if (carga > 8) {
			precioFinal += 50;
		}
		return precioFinal;
//		return super.precioFinal() + (carga > 8 ? 50 : 0);
	}
}
