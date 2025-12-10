package view;

import model.ConeIceCream;
import model.IceCream;
import model.MangoTopping;
import model.MilkIceCream;
import model.VanillaTopping;

public class IceCreamStore {
	public static void main(String[] args) {
		IceCream sorvete = new ConeIceCream(1);
		IceCream sorveteDeLeite = new MilkIceCream(3);
		IceCream sorveteComManga = new MangoTopping(sorveteDeLeite);
		IceCream sorveteComBaunilha = new VanillaTopping(sorveteComManga);
		
		printDescription(sorvete);
		printCost(sorvete); System.out.println();
		
		
		printDescription(sorveteDeLeite);
		printCost(sorveteDeLeite); System.out.println();
		
		printDescription(sorveteComManga);
		printCost(sorveteComManga); System.out.println();
		
		printDescription(sorveteComBaunilha);
		printCost(sorveteComBaunilha); System.out.println();
	}
	
	public static void printDescription(IceCream iceCream) {
		System.out.println(iceCream.getDescription());
	}
	
	public static void printCost(IceCream iceCream) {
		System.out.println("Custo: " + iceCream.getCost());
	}
}
