package CafeLove;

import java.util.ArrayList;
import java.util.List;

public class Adicional {

	public static List<Adicional> listAditional = new ArrayList<Adicional>();
	
	String nombreAdicional;

	public String getNombreAdicional() {
		return nombreAdicional;
	}

	public void setNombreAdicional(String nombreAdicional) {
		this.nombreAdicional = nombreAdicional;
	}

	public Adicional(String nombreAdicional) {
		super();
		this.nombreAdicional = nombreAdicional;
	}
	
	public static void listaAdicionales() {		
		listAditional.add(new Adicional("galletas"));
		listAditional.add(new Adicional("canela en plovo"));
		listAditional.add(new Adicional("chocolate en polvo"));
			
		 
		
	}
}
