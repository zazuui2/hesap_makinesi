package Hesap_makinasi;

import java.util.Scanner;

public class Runner {//class ba�lang��

	public static void main(String[] args) {//metot ba�lang��
		
		
	
		//Scanner
		
		Scanner sc = new Scanner (System.in);
		
		//Printler
		boolean ana_menu_return = false;
		do {
		System.out.println("------------------------------");
		System.out.println("Hesap Makinesine Hos Geldiniz");
		System.out.println("------------------------------");
		
		//Degiskenler
		
		int sayi1, sayi2;
		String ana_menu = "";
		String ilk_deger = "Ilk degeri yazin:";
		String ikinci_deger = "Ikinci degeri yazin";
		String sonuc = "Sonuc: ";
		String baskaislem = "Baska bir islem yapmak ister misiniz? (e/h)";
		
		
		for (int i = 0; i < 3; i++)System.out.println("");
		
		System.out.println("Toplama (1)");
		System.out.println("��kartma (2)");
		System.out.println("�arpma (3)");
		System.out.println("B�lme (4)");
		System.out.print("Lutfen yapmak istedi�iniz islemi secin;");
		
		int scanner_veri = sc.nextInt();
		switch (scanner_veri) {
		
		case 1: {
			
			System.out.print(ilk_deger);
			sayi1=sc.nextInt();
			System.out.print(ikinci_deger);
			sayi2=sc.nextInt();
			System.out.println("Sonuc: "+ (sayi1+sayi2));
			System.out.println("baskaislem");
			
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
			
			System.out.print(ilk_deger);
			sayi1=sc.nextInt();
			System.out.print(ikinci_deger);
			sayi2=sc.nextInt();
			System.out.println("Sonuc: "+ (sayi1-sayi2));
			System.out.println("baskaislem");
			
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
			
			System.out.print(ilk_deger);
			sayi1=sc.nextInt();
			System.out.print(ikinci_deger);
			sayi2=sc.nextInt();
			System.out.println("Sonuc: "+ (sayi1*sayi2));
			System.out.println("baskaislem");
			
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
			
			System.out.print(ilk_deger);
			sayi1=sc.nextInt();
			System.out.print(ikinci_deger);
			sayi2=sc.nextInt();
			System.out.println("Sonuc: "+ (sayi1/sayi2));
			System.out.println("baskaislem");
			

			
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
			System.out.println("Yanlis tuslama uygulama tekrar baslat�l�yor");
			System.out.println("");
			System.out.println("");
			ana_menu_return = true;
			
		 		}//default sonu
		 
			}//switch sonu
		
		} while (ana_menu_return);//do sonu
		
	}//metot sonu
		
}//class sonu
