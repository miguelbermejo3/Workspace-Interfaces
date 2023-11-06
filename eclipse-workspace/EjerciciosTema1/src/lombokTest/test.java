package lombokTest;


import java.time.LocalDate;

public class test {

	
	public static void main(String[] args) {
		Betis betis=new Betis();
		betis.setCapacidad(62000);
		betis.setEstadio("Benito Villamarín");
		betis.setFechaNacimiento(LocalDate.now());
		betis.setNumSocios(54000);
		System.out.println(betis);
	}
}
