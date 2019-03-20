import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Prueba {

	public static void main(String[] args) throws Exception {
		List<Electrodomestico> lista = new ArrayList<>();
		
		lista.add(new Lavadora(300f, Color.gris, 'C', 63f, 5));
		lista.add(new Frigorifico(659.99f, Color.blanco, 'A', 47, true));
		lista.add(new Television(573.99f, Color.negro, 'A', 2.5f, 20, true));
		
		mostrarLista(lista);
		System.out.println();
		
		Collections.sort(lista);
		mostrarLista(lista);
		System.out.println();
		
		Collections.sort(lista, Collections.reverseOrder());
		mostrarLista(lista);
		System.out.println();
		
		Collections.sort(lista, new ComparatorPeso());
		mostrarLista(lista);
		System.out.println();
		
		Collections.sort(lista, Collections.reverseOrder(new ComparatorPeso()));
		mostrarLista(lista);
		System.out.println();
		
		Collections.sort(lista, new ComparatorConsumoColor());
		mostrarLista(lista);
	}
	
	public static void mostrarLista(List<Electrodomestico> lista) {
		Iterator<Electrodomestico> i = lista.iterator();
		
		while(i.hasNext()) {		//for(int i = 0; i<lista.size(); i++)
			System.out.println(i.next());
		}
	}
}
