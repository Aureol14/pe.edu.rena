package pe.edu.rena.builder2;

public class CompradorPc {
	public static void main(String[] args) {
		Procesador procesador = new Procesador(2.8, "i3", "intel");
		Disco disco = new Disco("HDD", 500);
		Ram ram = new Ram(4, "GB");
		Pc armarPc = new Pc(procesador, disco, ram);
		System.out.println(armarPc);
		Pc pc2 = new PcBuilder().construirPc();
		System.out.println(pc2);
		Pc pc3 = new PcBuilder().setTipoDisco("SSD").setCapacidadRam(32).
				construirPc();
		System.out.println(pc3);
		PcBuilder nuevaPlantillaLaptopGamer = new PcBuilder(new PcBuilder()
				.setCapacidadProcesador(3.8)
				.setCapacidadRam(32)
				.setCapacidadDisco(2048)
				.setTipoDisco("SSD"));
		Pc pc = new PcBuilder(nuevaPlantillaLaptopGamer).
				setCapacidadDisco(1024).setCapacidadRam(64).construirPc();
	}
}
