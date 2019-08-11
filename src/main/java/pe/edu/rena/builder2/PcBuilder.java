package pe.edu.rena.builder2;

public class PcBuilder {
	private double capacidadProcesador = 1.8;
	private String tipoProcesador = "GHz";
	private String marcaProcesador = "Intel";
	private int capacidadRam = 8;
	private String nombreRam = "GHz";
	private String tipoDisco = "HDD";
	private int capacidadDisco = 1024;

	public PcBuilder() {
		
	}
	//Copy Constructor
	public PcBuilder(PcBuilder otro) {
		this.capacidadDisco = otro.capacidadDisco;
		//TODO ...
	}

	public PcBuilder setCapacidadProcesador(double capacidadProcesador) {// setter builder
		this.capacidadProcesador = capacidadProcesador;
		return this;
	}

	public PcBuilder setTipoProcesador(String tipoProcesador) {
		this.tipoProcesador = tipoProcesador;
		return this;
	}

	public PcBuilder setMarcaProcesador(String marcaProcesador) {
		this.marcaProcesador = marcaProcesador;
		return this;
	}

	public PcBuilder setCapacidadRam(int capacidadRam) {
		this.capacidadRam = capacidadRam;
		return this;
	}

	public PcBuilder setNombreRam(String nombreRam) {
		this.nombreRam = nombreRam;
		return this;
	}

	public PcBuilder setTipoDisco(String tipoDisco) {
		this.tipoDisco = tipoDisco;
		return this;
	}

	public PcBuilder setCapacidadDisco(int capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
		return this;
	}
	public Pc construirPc() {
		return new Pc(
				new Procesador(capacidadProcesador, tipoProcesador, marcaProcesador),
				new Disco(tipoDisco, capacidadDisco),
				new Ram(capacidadRam, nombreRam)
				);
	}

}
