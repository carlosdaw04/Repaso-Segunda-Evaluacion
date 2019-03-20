import java.util.Comparator;

public class ComparatorPeso implements Comparator<Electrodomestico> {

	@Override
	public int compare(Electrodomestico e1, Electrodomestico e2) {
		if (e1.getPeso() < e2.getPeso())
			return -1;
		else if(e1.getPeso() > e2.getPeso())
			return 1;
		else
			return 0;
	}

}
