package m8exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class M8Exercise1 {

	public static void main(String[] args) {
		/*
		 * Crea un nou projecte Java amb una classe anomenada "Ordinador", a més a 
		 * més de la classe que conté el main. 

			Aquesta classe tindrà com a atributs la marca, el model, el processador, 
			la quantitat de memòria RAM i la capacitat del disc dur.

			L'aplicació ha de poder generar ordinadors de diferents maneres: 

			Només a partir de la marca i el model.

			Indicant tots els atributs.

			La classe Ordinador ha de disposar dels següents mètodes:

			Mètodes que permetin consultar cadascun dels atributs.
			Mètodes que permetin modificar el processador, la quantitat de memòria ram i 
			la capacitat del disc dur.
			Un mètode que rebrà un string per paràmetre i retornarà un string que digui: 
			"En aquests moments s'està executant: 'X'" (X és el paràmetre rebut pel mètode i 
			que normalment serà el nom d'un programa) Exemple: "En aquests moments s'està 
			executant: Eclipse" 
			Un mètode que retornarà una descripció completa de l'ordinador (toString()).
			Al main del projecte crea ordinadors de les 2 maneres possibles i comprova que els 
			mètodes creats funcionen correctament.
		 
		*/
		
				
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Pc> pcs = new ArrayList<Pc>();
		
		for(int i = 1; i <= 2; i++) {
			
			System.out.println("Give me a PC brand "+i);
			String brand = keyboard.nextLine();
			System.out.println("Give me a Pc model "+i);
			String model = keyboard.nextLine();
			System.out.println("Give me a PC processor "+i);
			String processor = keyboard.nextLine();
			System.out.println("Give me a PC RAM "+i);
			int ram = keyboard.nextInt();
			System.out.println("Give me a PC hardDisk "+i);
			int hardDisk = keyboard.nextInt();
			keyboard.nextLine();
			
			if( i== 1) {
			Pc pc1 = new Pc(brand, model, processor, ram, hardDisk);
			pcs.add(pc1);
			System.out.println(pc1.toExecute("Eclipse"));
			System.out.println(pc1.toString());
			} else {
				Pc pc2 = new Pc(brand, model);
				pcs.add(pc2);
				System.out.println(pc2.toExecute("Eclipse"));
				System.out.println(pc2.toString());
				
				
			}
			
			
			
		}
		
		Pc pc1 = pcs.get(0);
		Pc pc2 = pcs.get(1);
		//pc1.toExecute("Eclipse")
		pc1.getModel();
		pc2.setProcessor("i9");
		pc2.setRam(16);
		pc2.setHardDisk(2);
		System.out.println(pc2.toString());
		
		
	}

}
