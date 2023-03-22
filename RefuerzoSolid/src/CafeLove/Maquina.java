package CafeLove;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maquina implements IPreparacion {

	public static List<Cafe> listaDeCafes = new ArrayList<Cafe>();
	public static List<Adicional> listAditional = new ArrayList<Adicional>();
	public static List<Cafe> cafesQuiereCliente = new ArrayList<Cafe>();

	public static void cargarCafes() {
		listaDeCafes.add(new CafeCaliente("Cappuccino"));
		listaDeCafes.add(new CafeFrio("Ice latte"));
		listaDeCafes.add(new CafeCaliente("Espresso de caramelo"));
		listaDeCafes.add(new CafeFrio("Frappe"));
		listaDeCafes.add(new CafeCaliente("Café Bombon"));
		listaDeCafes.add(new CafeFrio("Cold Coffe"));
		listAditional.add(new Adicional("galletas"));
		listAditional.add(new Adicional("canela en plovo"));
		listAditional.add(new Adicional("chocolate en polvo"));
	}

	@Override
	public void servirAgua() {
		System.out.println("Llenando el recipiente de agua.....");

	}

	@Override
	public void añadirCafe() {
		System.out.println("Agregando cafe.....");

	}

	@Override
	public void añadirAdicion(List<Adicional> adicionales) {
		adicionales.forEach(a -> System.out.println("Agregando adicion ......" + a.getNombreAdicional()+ "\n"));

	}

	public static void cafesParaOfrecer(boolean esFrio) {

		String cafes = "";
		int contador = 1;
		List<Cafe> cafesAMostrar = listaDeCafes.stream().filter(cafe -> {
			if (esFrio)
				return cafe instanceof CafeFrio;
			else
				return cafe instanceof CafeCaliente;

		}).toList();
		for (Cafe cafe : cafesAMostrar) {
			cafes += contador + ": " + cafe.getNombre() + "\n";
			contador++;
		}
		cafes += "0: Ninguno \n";
		System.out.println(cafes);

		System.out.println("Seleccione:");
		Scanner scan = new Scanner(System.in);
		int op = Integer.parseInt(scan.nextLine());
		if (op <= 3) {
			System.out.println("Cafes agregado: " + cafesAMostrar.get(op - 1).getNombre() + "\n");
			adicionAOfrecer(cafesAMostrar.get(op - 1));
		} else {
			cafesParaOfrecer(esFrio);
		}

	}

	public static void adicionAOfrecer(Cafe cafeseleccionado) {
		String adicionales = "";
		int contador = 1;
		for (Adicional adicion : listAditional) {
			adicionales += contador + ":" + adicion.getNombreAdicional() + "\n";
			contador++;
		}
		adicionales += "0: Ninguno \n";
		System.out.println(adicionales);

		System.out.println("Seleccione Adicional");
		Scanner scan = new Scanner(System.in);
		int opAdicional = Integer.parseInt(scan.nextLine());
		if (opAdicional <= 3) {
			cafeseleccionado.listAditional.add(listAditional.get(opAdicional - 1));
			System.out.println("Adicion agregada:" + listAditional.get(opAdicional - 1).getNombreAdicional() + "\n");
			cafesQuiereCliente.add(cafeseleccionado);
		} else {
           adicionAOfrecer(cafeseleccionado);
		}
		

	}

}
