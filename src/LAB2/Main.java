package LAB2;

import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Ajutor instanta = new Ajutor();
		System.out.println("Introdu text: ");
		String mesaj = scan.next();
		System.out.println(mesaj+"\n");
		if(mesaj.equals("hello")) {
			instanta.Afisare();
		}else if(mesaj.equals("exit")){
			System.out.println("PRogramul a iesit di executie");
			System.exit(0);
		}else {
			instanta.Info();
		}

	}

}
