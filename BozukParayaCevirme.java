import java.util.Scanner;

public class BozukParayaCevirme {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Elinizdeki Parayi Tam Olarak Giriniz");
		
		double para = klavye.nextDouble();
		
		int toplamKurus = (int) (para * 100);
		
			
		System.out.println("Paranizin Toplami:" + toplamKurus + " kurus ");
		
		int toplamTL = toplamKurus / 100;
		
		System.out.println("Toplam TL Miktari:" + toplamTL);
		
		int kalanKurus = toplamKurus %100;
		
		int elliKurus = kalanKurus / 50;
		
		System.out.println("50 kurus miktari:" + elliKurus);
		
		kalanKurus = kalanKurus %50;
		
		int yirmibesKurus = kalanKurus / 25;
		
		System.out.println("25 kurus miktari:" + yirmibesKurus);
		
		kalanKurus = kalanKurus %25;
		
		int onKurus = kalanKurus / 10;
		
		System.out.println("10 kurus miktari:" + onKurus);
		
		kalanKurus = kalanKurus %10;
		
		int besKurus = kalanKurus / 5;
		
		System.out.println("5 kurus miktari:" + besKurus);
		
		kalanKurus = kalanKurus %5;
		
		int birKurus = kalanKurus / 1;
		
		System.out.println("1 kurus miktari:" + birKurus);
		
		
			
			
		
	
	}

}