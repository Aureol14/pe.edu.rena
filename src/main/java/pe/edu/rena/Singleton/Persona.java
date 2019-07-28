package pe.edu.rena.Singleton;

public class Persona {
	private static Persona instance;
	private String nombre;
	
	private Persona() {
		
	}
	public static Persona getInstance() {
		if (instance == null) {
			instance = new Persona();
		}
		return instance;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/*
	 * private static Persona instance = new Persona();
	 * private Persona(){
	 * }
	 * public static Persona getPersona(){
	 * return instance;
	 * }
	 * */
}