package pruebasdesa;

public class Persona {

	private int DNI;
	private String NOMBRE;
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public String getNOMBRE() {
		return NOMBRE;
	}
	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}
	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", NOMBRE=" + NOMBRE + "]";
	}

	
	
	
}
