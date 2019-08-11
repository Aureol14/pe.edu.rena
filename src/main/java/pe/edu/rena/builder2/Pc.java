package pe.edu.rena.builder2;

public class Pc {
	private final Procesador procesador;
	private final Disco disco;
	private final Ram ram;
	
	public Pc(Procesador procesador, Disco disco, Ram ram) {
		this.procesador = procesador;
		this.disco = disco;
		this.ram = ram;
	}
	public Procesador getProcesador() {
		return this.procesador;
	}
	public Disco getDisco() {
		return this.disco;
	}
	public Ram getRam() {
		return this.ram;
	}
	@Override
	public String toString() {
		return "Pc [procesador=" + procesador + ", disco=" + disco + ", ram=" + ram + "]";
	}
	
	
}
