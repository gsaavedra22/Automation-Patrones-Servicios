package Practica;

import java.util.ArrayList;

public class Estanteria {

	private static ArrayList<Book> listabooks = new ArrayList<>();
	private static ArrayList<AudioBook> listaaudiobook = new ArrayList<>();

	public static void addBook(Book book) {
		for (Book book1 : listabooks) {

			System.out.println(book1.getNombre() + "" + book1.getDescripcion());
		}
	}

	public static void DuracionAudiBook(int minutos) {
		for (AudioBook audiob1 : listaaudiobook) {

			System.out.println(audiob1.getMinutes());
		}
	}

	
}
