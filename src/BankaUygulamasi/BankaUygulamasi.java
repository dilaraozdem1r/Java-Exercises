package BankaUygulamasi;
import java.util.Scanner;
public class BankaUygulamasi {
	static Scanner S= new Scanner(System.in);
	static int Bakiye=0;
	static int tutar;
	public static void main(String[] args) {
		String AdSoyad;
		int Secenek;
		AdSoyad=AdSoyadAl();
		
		do {
			Menu(AdSoyad);
			Secenek=Sec();
			SecenekKontrol(Secenek);	
			if(Secenek==4)
				break;
			MenuYonlendirme();
		 }while(Secenek!=4);
			}
		
public static String AdSoyadAl(){
	String Ad;
	String Soyad;
	
	System.out.println("Hosgeldiniz,ilerlemek icin");
	System.out.print("Adinizi giriniz:");
	Ad=S.next();
	System.out.print("Soyadinizi giriniz:");
	Soyad=S.next();
	System.out.println();
	return Ad+" "+Soyad;
	
}
public static void Menu(String AdSoyad) {
    System.out.println("Hosgeldin," +AdSoyad);
	System.out.println("*MENU*");
	System.out.println("1 ) Para Yatirma");
	System.out.println("2 ) Para Cekme");
	System.out.println("3 ) Bakiye Sorgulama");
	System.out.println("4 ) Cikis");
}
public static int Sec(){

	System.out.println("Yapmak istediginiz islemi giriniz:");
	int secenek=S.nextInt();
	return secenek;
		
}
public static void SecenekKontrol(int s) {
	
	if(s==1) {
		ParaYatir();
	}
	else if(s==2) {
		ParaCekme(); 
	}
	else if(s==3) {
		BakiyeSorgulama();
	}
	else if(s==4) {
		Cikis();
	}
	else 
		System.out.println("Yanlis bir secenek sectiniz.Lutfen tekrar giris yapiniz.");
	
	
	
}
public static void ParaYatir() {
	System.out.println("Hesaptaki paraniz:" +Bakiye);
	do {
	System.out.println("Yatirmak istediginiz tutari giriniz:");
	tutar=S.nextInt();
	if(tutar<0)
		System.out.println("Boyle bir para girisi yapilamaz,yeniden giriniz:");
	}
	while(tutar<0);
	
	Bakiye+=tutar;
	System.out.println("Yeni bakiyeniz:" +Bakiye);
	
}
public static void ParaCekme() {
	System.out.println("Hesabinizdaki paraniz:" +Bakiye);
	System.out.println("Cekmek istediginiz tutari giriniz:");
	tutar=S.nextInt();
	if(tutar<=Bakiye) {
		Bakiye-=tutar;
		System.out.println("Yeni bakiyeniz:" +Bakiye);
	}
	else {
	do { System.out.println("Bakiyeniz yetersiz.Lutfen tekrar cekmek istediginiz tutari giriniz:");
	     tutar=S.nextInt();
	}
	while(tutar>Bakiye);
}
}
public static void BakiyeSorgulama() {
	System.out.println("Bakiyeniz:" +Bakiye);
	
}
public static void Cikis() {
	System.out.println(" Hesabinizdan cikis yapildi.");
}
public static void MenuYonlendirme() {
	System.out.println("\nMenuye yonlendiriliyorsunuz...\n");
	
}

}