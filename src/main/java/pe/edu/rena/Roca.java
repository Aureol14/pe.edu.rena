package pe.edu.rena;

public class Roca extends Meteorito{
	public Roca(int radio) {
		//radio = 0;
		super(radio);
	}

	@Override
	public void desplazar() {
		System.out.println("Soy una roca");
		super.desplazar();
	}
}
