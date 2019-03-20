import java.util.Comparator;

public class ComparatorConsumoColor implements Comparator<Electrodomestico> {

	@Override
	public int compare(Electrodomestico e1, Electrodomestico e2) {
		if(e1.getConsumo() < e2.getConsumo())
			return -1;
		else if(e1.getConsumo() > e2.getConsumo())
			return 1;
		else {
			return e1.getColor().compareTo(e2.getColor());				
		}
	}



}
