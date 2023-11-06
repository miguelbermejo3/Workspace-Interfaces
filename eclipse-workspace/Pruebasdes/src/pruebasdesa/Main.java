package pruebasdesa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scanner=new Scanner(System.in);
		
		List<Persona>listap=new ArrayList<>();


		
		
		
		
			Persona persona1 =new Persona();
			System.out.println("itnroduzca el nombre de la  persona");
			persona1.setNOMBRE(sc.nextLine());
			System.out.println("introduzca el dni de la persona");
			persona1.setDNI(scanner.nextInt());
			listap.add(persona1);
			sc.nextLine();
			Persona persona2 =new Persona();
			System.out.println("itnroduzca el nombre de la  persona");
			persona2.setNOMBRE(sc.nextLine());
			System.out.println("introduzca el dni de la persona");
			persona2.setDNI(scanner.nextInt());
			listap.add(persona2);
			
			Persona persona3 =new Persona();
			System.out.println("itnroduzca el nombre de la  persona");
			persona3.setNOMBRE(sc.nextLine());
			System.out.println("introduzca el dni de la persona");
			persona3.setDNI(scanner.nextInt());
			listap.add(persona3);
			
			
		

		
		
		
		for (Persona persona : listap) {
			System.out.println("Dni de la  persona"+persona.getDNI()+"nombre de las personas"+persona.getNOMBRE());
		
		}
		
		
		
		
		
		
		
		
		scanner.close();
	sc.close();}
	
}
