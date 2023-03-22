package CafeLove;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		tomarOrden();
		resumenCompra();
		nuevaOrden();
	}

	public static void tomarOrden() {
		Maquina.cargarCafes();
		System.out.println("Bienvenido a CafeLove \n Ingrese el numero de cafes a preparar:");
		Scanner scan = new Scanner(System.in);
		int numeroDeCafes = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < numeroDeCafes; i++) {
			if (Maquina.cafesQuiereCliente.size() < numeroDeCafes) {
				System.out.println("Te ofrecemos cafes frios como:");
				Maquina.cafesParaOfrecer(true);
			}
			if (Maquina.cafesQuiereCliente.size() < numeroDeCafes) {
				System.out.println("Te ofrecemos cafes calientes como:");
				Maquina.cafesParaOfrecer(false);

			}
		}
				
	}
	public static void nuevaOrden() {
		System.out.println(" 1.Desea una nueva orden de cafe? \n 2. Salir");
		Scanner scan1 = new Scanner(System.in);
		int op = Integer.parseInt(scan1.nextLine());
		if (op == 1) {			
			tomarOrden();
		} else {
			
			
			Maquina.cafesQuiereCliente.forEach(c -> {
				System.out.println("Su orden fue" + c.getNombre());
				
			});
		}
	}

	public static void resumenCompra() {
		System.out.println(" 1.Lo desea llevar\n 2.Consumir Aqui");
		Scanner scan = new Scanner(System.in);
		int op = Integer.parseInt(scan.nextLine());
		if (op == 2) {
			Maquina maqui = new Maquina();
			Maquina.cafesQuiereCliente.forEach(c -> {
				System.out.println("Preparación de cafe - " + c.getNombre());
				maqui.servirAgua();
				maqui.añadirCafe();
				maqui.añadirAdicion(c.listAditional);
			});
		} else {
			System.out.println("Su orden es para llevar");
		}
	}

}
