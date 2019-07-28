package pe.edu.rena;

public class Meteorito extends objetoEspacial{
	public Meteorito(int radio) {
		this.radio = radio;
	}
	private int radio = 0;
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj instanceof Meteorito) {
			Meteorito otro = (Meteorito)obj;
			return this.radio == otro.radio;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return radio;
	}
//	@Override
//	public void desplazar() {
//		System.out.println("Mi radio es "+radio);
//		super.desplazar();
//	}
}
