
public class Tutorial_4 {

	public static void main(String[] args) {
		double total = summe(15.90, 21.90, 32.50);

		System.out.println("Lieferschein");
		line(12, '*');
		System.out.println("Artikel 1		          15.90");
		System.out.println("Artikel 2		          21.90");
		System.out.println("Artikel 3		          32.50");
		line(40, '-');
		System.out.println("Preis total		          " + total);
		line(40, '=');
	}

	public static void line(int laenge, char zeichen){
		for(int i=0;i<laenge;i++){
			System.out.print(zeichen);
		}
		System.out.println();
	}

	public static double summe(double artikel1, double artikel2, double artikel3){
		return artikel1 + artikel2 + artikel3;
	}

}
