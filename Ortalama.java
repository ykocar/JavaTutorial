import java.util.Scanner;

public class Ortalama {

	public static void main(String[] args) {
		Scanner yusuf = new Scanner (System.in);
		System.out.println("Ortalama hesaplamak icin uc sayi giriniz");
		
		double sayi1 = yusuf.nextDouble();
		double sayi2 = yusuf.nextDouble();
		double sayi3 = yusuf.nextDouble();
		
		double ortalama = (sayi1 + sayi2 + sayi3) / 3;
		
		System.out.println("Girilen uc sayinin ortalamasi:" + ortalama);
		
		}
		

}
