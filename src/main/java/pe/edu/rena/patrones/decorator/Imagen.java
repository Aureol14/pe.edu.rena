package pe.edu.rena.patrones.decorator;

public class Imagen {
	private final String contenido;
	public Imagen(String contenido){
		this.contenido = contenido;
	}
	public String getContenido() {
		return contenido;
	}
}
