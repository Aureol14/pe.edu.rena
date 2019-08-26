package pe.edu.rena.colecciones;

import java.util.HashMap;
import java.util.Objects;

class MiLlave {
	private final String dni;
	private final String prefijoPersona;

	public MiLlave(String dni, String prefijoPersona) {// Constructor
		this.dni = dni;
		this.prefijoPersona = prefijoPersona;
	}

	public String getDni() {// getter
		return this.dni;
	}

	public String getPrefijoPersona() {// getter
		return this.prefijoPersona;
	}

	@Override
	public boolean equals(Object o) {// equals
		if (o == null) {
			return false;
		}
		if (o == this) {
			return true;
		}
		if(o instanceof MiLlave) {//Asegurar el DownCasting
			MiLlave millave = (MiLlave)o; //DownCasting
			return this.dni.equals(millave.dni) && this.prefijoPersona.equals(millave.prefijoPersona);
		}
		return false;
	}
	@Override
	public int hashCode() {//Identificador "unico" del objeto, hashcode y equals van de la mano
		return Objects.hash(dni,prefijoPersona);
	}
}

public class HashMap2 {
	public static void main(String[] args) {
		MiLlave millave1 = new MiLlave("48309307", "Re");
		MiLlave millave2 = new MiLlave("48309307", "Re");
		MiLlave millave3 = new MiLlave("06295484", "Pe");
		int x = 6;
		int y = 5;
		System.out.println(x == y);
		System.out.println(millave1 == millave2);
		System.out.println(millave1.equals(millave2));
		System.out.println(millave1.equals(new Object()));
		System.out.println(millave1.equals(millave1));
		
		HashMap<MiLlave,Integer> mapa = new HashMap<>();
		mapa.put(millave1, 5);
		mapa.put(millave2, 6);
		mapa.put(millave3, 2);
		System.out.println(mapa.size());
		System.out.println(mapa.get(millave1));
	}
}