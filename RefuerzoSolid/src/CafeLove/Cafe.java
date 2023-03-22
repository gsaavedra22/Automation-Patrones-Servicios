package CafeLove;

import java.util.ArrayList;

public class Cafe {
	
	ArrayList<Adicional> listAditional = new ArrayList<>();
	String Nombre;

	public Cafe() {
		super();
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Cafe(String nombre) {
		super();
		Nombre = nombre;
	}

	

}
