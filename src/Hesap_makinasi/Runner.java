package Hesap_makinasi;

import java.util.Scanner;

public class Runner {//class baþlangýç

	public static void main(String[] args) {//metot baþlangýç
		
		
	
		//Scanner
		
		Scanner sc = new Scanner (System.in);
		
		//Printler
		boolean ana_menu_return = false;
		do {
		System.out.println("------------------------------");
		System.out.println("Hesap Makinasine Hos Geldiniz");
		System.out.println("------------------------------");
		
		//Degiskenler
		
		int sayi1, sayi2;
		String ana_menu = "";
		
		for (int i = 0; i < 3; i++)System.out.println("");
		
		System.out.println("Toplama (1)");
		System.out.println("Çýkartma (2)");
		System.out.println("Çarpma (3)");
		System.out.println("Bölme (4)");
		System.out.print("Lutfen yapmak istediðiniz islemi secin;");
		
		int scanner_veri = sc.nextInt();
		switch (scanner_veri) {
		
		case 1: {
			
			System.out.print("Ilk degeri girin: ");
			sayi1=sc.nextInt();
			System.out.print("Ikýnci degeri girin: ");
			sayi2=sc.nextInt();
			System.out.println("Sonuc: "+ (sayi1+sayi2));
			System.out.println("Baska bir islem yapmak ister misiniz?(e/h)");
			
		       	ana_menu = sc.next();
				if(ana_menu.equals("e")) {
					
					for (int i=0; i<15; i++)System.out.println("");
					ana_menu_return = true;
					
					}else if (ana_menu.equals("h")) {
						System.out.println("Uygulama sonlandi");
						break;
					}else {
						System.out.println("yanlis tuslama yaptiniz ana menuye yonlendiriliyorsunuz");
						ana_menu_return = true;
					}
			
				
				}//case 1 sonu
		case 2: {
			
			System.out.print("Ilk degeri girin: ");
			sayi1=sc.nextInt();
			System.out.print("Ikýnci degeri girin: ");
			sayi2=sc.nextInt();
			System.out.println("Sonuc: "+ (sayi1-sayi2));
			System.out.println("Baska bir islem yapmak ister misiniz?(e/h)");
			
		       	ana_menu = sc.next();
				if(ana_menu.equals("e")) {
					
					for (int i=0; i<15; i++)System.out.println("");
					ana_menu_return = true;
					
					}else if (ana_menu.equals("h")) {
						System.out.println("Uygulama sonlandi");
						break;
					}else {
						System.out.println("yanlis tuslama yaptiniz ana menuye yonlendiriliyorsunuz");
						ana_menu_return = true;
					}
			
				}//case 2 sonu
			
		case 3: {
			
			System.out.print("Ilk degeri girin: ");
			sayi1=sc.nextInt();
			System.out.print("Ikýnci degeri girin: ");
			sayi2=sc.nextInt();
			System.out.println("Sonuc: "+ (sayi1*sayi2));
			System.out.println("Baska bir islem yapmak ister misiniz?(e/h)");
			
		       	ana_menu = sc.next();
				if(ana_menu.equals("e")) {
					
					for (int i=0; i<15; i++)System.out.println("");
					ana_menu_return = true;
					
					}else if (ana_menu.equals("h")) {
						System.out.println("Uygulama sonlandi");
						break;
					}else {
						System.out.println("yanlis tuslama yaptiniz ana menuye yonlendiriliyorsunuz");
						ana_menu_return = true;
					}
			
				}//case 3 sonu
		
		case 4: {
			
			System.out.print("Ilk degeri girin: ");
			sayi1=sc.nextInt();
			System.out.print("Ikýnci degeri girin: ");
			sayi2=sc.nextInt();
			System.out.println("Sonuc: "+ (sayi1/sayi2));
			System.out.println("Baska bir islem yapmak ister misiniz?(e/h)");
			

			
		       	ana_menu = sc.next();		       			       	
				if(ana_menu.equals("e")) {
					
					for (int i=0; i<15; i++)System.out.println("");
					ana_menu_return = true;
					
					}else if (ana_menu.equals("h")) {
						System.out.println("Uygulama sonlandi");
						break;
					}else {
						System.out.println("yanlis tuslama yaptiniz ana menuye yonlendiriliyorsunuz");
						ana_menu_return = true;
					}
			
				}//case 4 sonu
		 default: {
			 
			System.out.println("");
			System.out.println(""); 
			System.out.println("Yanlis tuslama uygulama tekrar baslatýlýyor");
			System.out.println("");
			System.out.println("");
			ana_menu_return = true;
			
		 		}//default sonu
		 
			}//switch sonu
		
		} while (ana_menu_return);//while sonu
		
	}//metot sonu
		
}//class sonu
