package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Número do quarto: ");
			int numeroQuarto = sc.nextInt();

			System.out.print("Data de check-in (DD/MM/AAAA): ");
			Date dataCheckIn = sdf.parse(sc.next());

			System.out.print("Data de check-out (DD/MM/AAAA): ");
			Date dataCheckOut = sdf.parse(sc.next());

			Reservation reserva = new Reservation(numeroQuarto, dataCheckIn, dataCheckOut);
			System.out.println("Reservas: " + reserva);
			System.out.println();

			System.out.println("Entre com as informações para atualizar a reserva: ");
			System.out.print("Data de check-in (DD/MM/AAAA): ");
			dataCheckIn = sdf.parse(sc.next());

			System.out.print("Data de check-out (DD/MM/AAAA): ");
			dataCheckOut = sdf.parse(sc.next());

			reserva.atualizaData(dataCheckIn, dataCheckOut);
			System.out.println("Reservas atualizadas: " + reserva);
			
		} catch (ParseException e) {
			System.out.println("Formato de data inválida!");
		} catch (DomainException e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado!");
		}

		sc.close();
	}

}
