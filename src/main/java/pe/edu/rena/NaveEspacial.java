package pe.edu.rena;

public class NaveEspacial extends objetoEspacial{
	@Override
	public void desplazar() {
		System.out.println("Soy una nave espacial");		
	}
	public void detener() {
		System.out.println("Deteniendo la nave");
	}
}
