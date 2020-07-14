package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Número do quarto: ");
		int numeroQuarto = sc.nextInt();
		
		System.out.print("Data de check-in (DD/MM/AAAA): ");
		Date dataCheckIn = sdf.parse(sc.next());
		
		System.out.print("Data de check-out (DD/MM/AAAA): ");
		Date dataCheckOut = sdf.parse(sc.next());
		
		if (!dataCheckOut.after(dataCheckIn)) {
			System.out.println("Erro na reserva: Data de Check-Out deve ser depois da data de Check-In");
		} else {
			Reservation reserva = new Reservation(numeroQuarto, dataCheckIn, dataCheckOut);
			System.out.println("Reservas: " + reserva);
			System.out.println();
			
			System.out.println("Entre com as informações para atualizar a reserva: ");
			System.out.print("Data de check-in (DD/MM/AAAA): ");
			dataCheckIn = sdf.parse(sc.next());
			
			System.out.print("Data de check-out (DD/MM/AAAA): ");
			dataCheckOut = sdf.parse(sc.next());
			
			String erro = reserva.atualizaData(dataCheckIn, dataCheckOut);
			if (erro != null) {
				System.out.println("Erro na reserva: " + erro);
			} else {
				System.out.println("Reservas atualizadas: " + reserva);
			}
		}
		sc.close();
	}

}
