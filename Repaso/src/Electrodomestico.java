import java.util.HashMap;
import java.util.Map;

abstract class Electrodomestico implements Comparable<Electrodomestico> {
	
//	private static Map<Character, Float>precioPorConsumo = new HashMap<>();
//	
//	static {
//		precioPorConsumo.put('A', 100f);
//		precioPorConsumo.put('B', 80f);
//		precioPorConsumo.put('C', 60f);
//		precioPorConsumo.put('D', 50f);
//		precioPorConsumo.put('E', 30f);
//		precioPorConsumo.put('F', 10f);
//	}
	
	private float precio = 100;
	private Color color = Color.blanco;
	private char consumo = 'F';
	private float peso = 5;
	
	public Electrodomestico(){}
	
	public Electrodomestico(float precio, float peso) throws Exception {
		if(precio < 0) 
			throw new Exception ("Error: precio especificado: " + precio + ". El precio no puede ser negativo");
		if(peso < 0) 
			throw new Exception ("Error: peso especificado: " + precio + ". El peso no puede ser negativo");
		
		this.precio = precio;
		this.peso = peso;
	}
	
	public Electrodomestico(float precio, Color color, char consumo, float peso) throws Exception {
		this(precio, peso);
		
		if (consumo < 'A' || consumo > 'F') 
			throw new Exception ("Error: peso especificado: " + precio + ".Consumo entre 'A' y 'F'");
		
		this.color = color;
		this.consumo = consumo;
	}

	public float getPrecio() {
		return precio;
	}

	public Color getColor() {
		return color;
	}

	public char getConsumo() {
		return consumo;
	}

	public float getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return " Electrodomestico [precio=" + precio + ", color=" + color + 
				", consumo=" + consumo + ", peso=" + peso + "]";
	}
	
	public float precioFinal() {
		float precioFinal = precio;
//		float precioFinal = precio + precioPorConsumo.get(consumo);

		switch (consumo) {
		case 'A' : 
			precioFinal += 100;
			break;
		case 'B' : 
			precioFinal += 80;
			break;
		case 'C' : 
			precioFinal += 60;
			break;
		case 'D' : 
			precioFinal += 50;
			break;
		case 'E' : 
			precioFinal += 30;
			break;
		case 'F' : 
			precioFinal += 10;
			break;
		}
		
		if (peso <= 19) {
			precioFinal += 10;		 
		} else if (peso >= 20 && peso <= 49) {
			precioFinal += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioFinal += 80;
		} else if (peso >= 80) {
			precioFinal += 100;
		}
		
		return precioFinal;
	}
	
	@Override
	public int compareTo(Electrodomestico o) {
		if (precio < o.precio) 
			return -1;
		else if (precio > o.precio) 
			return 1;
		else
			return 0;
	}
}
