package Practica;

public class Book {

	private String Nombre;
	private String Descripcion;
	private int paginas;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public Book(String nombre, String descripcion) {
		super();
		Nombre = nombre;
		Descripcion = descripcion;
	}
	
}
