package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Apartament;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Apartament[] vect = new Apartament[10];

		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			sc.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			int room = sc.nextInt();

			vect[room] = new Apartament(name, email);
		}

		System.out.println("\nBusy rooms: ");

		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();
	}

}
