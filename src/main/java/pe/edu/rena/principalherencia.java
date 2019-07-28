package pe.edu.rena;

public class principalherencia {
	static void intentarDetener(objetoEspacial oe) {
		if (oe instanceof NaveEspacial) {
			((NaveEspacial)oe).detener();
		}
	}
	
	static void imprimir(objetoEspacial oe) {
		System.out.println("Soy un objeto Espacial");
	}
	static void imprimir(NaveEspacial ne) {
		System.out.println("Soy una Nave Espacial");
	}
	
	public static void main(String[] args) {
		objetoEspacial oe1 = new NaveEspacial();
		oe1.desplazar();
		intentarDetener(oe1);
		//((Meteorito)oe1).desplazar();
		System.out.println(oe1 instanceof NaveEspacial);
		System.out.println(oe1 instanceof Meteorito); 
		NaveEspacial oe2 = new NaveEspacial();
		oe2.detener();
		imprimir(oe1);
		imprimir((objetoEspacial)oe2);
		Meteorito met1 = new Meteorito(16);
		Meteorito met2 = new Meteorito(24);
		Meteorito met3 = new Meteorito(24);
		System.out.println(met1.equals(met2));
		System.out.println(met1.equals(met3));
		System.out.println(met2.equals(met3));
		System.out.println(met2.equals(oe2));
		Meteorito met4 = null;
		System.out.println(met3.equals(met4));
		met1.desplazar();
		Roca roca = new Roca(12);
		roca.desplazar();
	}
}
