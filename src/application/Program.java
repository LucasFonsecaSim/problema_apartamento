package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Apartament;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/* / Vetor de 10 espaços. / */
		Apartament[] vect = new Apartament[10];

		/* / Quantidade de quantos alugados./ */
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();

		/* / Preenchendo o vetor com os dados dos clientes / */
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

		/* / Print para mostrar os quantos alugados com os dados dos clientes. / */
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();
	}

}
