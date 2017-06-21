package progRecus;

import java.io.*;

public class strings12 { // verificar si un NIF es correcto o no

	public static void main(String[] args) {

		try {

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce un NIF:");
			String nif = buffer.readLine();

			int dni = nif.length();
			char x = 0;
			int count = -1;
			System.out.println("La longitud del DNI '" + nif + "' és " + dni);

			// comprobamos que el DNI tiene 9 caracteres
			if (dni != 9) {
				System.out.println("El DNI debe tener 9 caracteres.");
			}

			// comprobamos que el ultimo caracter es una letra
			else {
				if (!Character.isLetter(nif.charAt(8))) {
					System.out.println("DNI incorrecto. El ultimo caracter debe ser una letra!");
				} else if (Character.isLetter(nif.charAt(8))) {
					x = nif.charAt(8);
				}

				// comprobamos que los 8 primeros caracteres son numeros
				for (int i = 0; i < 8; i++) {
					count++;
					if (!Character.isDigit(nif.charAt(count))) {
						System.out.println("DNI incorrecto. Los primeros 8 caracteres deben ser numeros!");
					}
				}

				// el DNI sera correcto
				if (dni == 9 && count == 7 && x == nif.charAt(8)) {
					System.out.println("DNI correcto!");
				}
			}
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
	}
}
