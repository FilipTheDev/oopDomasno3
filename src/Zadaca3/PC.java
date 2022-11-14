package Zadaca3;

public class PC {
	public static Integer memorija;
	public static String tipNaMemorija;
	public static Integer SSD;
	public static String golemina = "GB";
	
	public PC() {
		memorija = 2;
		tipNaMemorija = "DDR4";
		SSD = 256;
	}
	public void prvMetod(int zgolemiMemorija, int novSSD) {
		int vkupnoMemorija = PC.memorija + zgolemiMemorija;
		System.out.println("Memorijata bese " + PC.memorija + " GB, sega iznesuva " +
		vkupnoMemorija + " GB" + "\nTipot na memorijata e " + PC.tipNaMemorija + ".\n" +
		"SSD ima golemina od " + novSSD + " GB. Prethodno iznesuvase " + PC.SSD + " GB");
	}	
}
