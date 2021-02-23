package bolum02;

public class MevcutSaatiGoster {
	public static void main(String[] args) {
		
		long toplamMilisaniye = System.currentTimeMillis();
		
		long toplamSaniye = toplamMilisaniye / 1000;
		
		System.out.println("toplamSaniye = " + toplamSaniye);
		
		long mevcutSaniye = toplamSaniye % 60;
		
		System.out.println("mevcutSaniye = " + mevcutSaniye);
		
		long toplamDakika = toplamSaniye / 60;
		
		System.out.println("toplamDakika = " + toplamDakika);
		
		long mevcutDakika = toplamDakika % 60;
		
		System.out.println("mevcutDakika = " + mevcutDakika);
		
		long toplamSaat = toplamDakika / 60;
		
		System.out.println("toplamSaat = " + toplamSaat);
		
		long mevcutSaat = toplamSaat % 24;
		
		System.out.println("mevcutSaat = " + mevcutSaat);
		
		
		
	}

}

