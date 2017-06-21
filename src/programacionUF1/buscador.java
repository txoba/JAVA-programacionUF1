package programacionUF1;
import java.io.*;
public class buscador {

	/*
	 * Escriure un programa en Java que llegeixi per teclat una frase o conjunt
	 * de paraules. Cadascuna de les lletres haurà d’estar emmagatzemada en una
	 * posició de l’array. El programa serà un cercador. Haurà de cercar una
	 * paraula que introduirà l’usuari per teclat, i indicar per pantalla si
	 * s’ha trobat aquella paraula o no.
	 */

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			String buscador;
			int count = 0;
			
			System.out.println("Frase o conjunto de palabras:");
			buscador = buffer.readLine();
			buscador = buscador.toLowerCase();
			char[] b1 = buscador.toCharArray();
			
			System.out.println("Buscar:");
			buscador = buffer.readLine();
			buscador = buscador.toLowerCase();
			char[] b2 = buscador.toCharArray();
			int j = 0;
			for (int i = 0; i < b1.length; i++) {
				if (j != b2.length) {
					if (b2[j] == b1[i]) {
						count++;
						j++;
						i++;
						if (j != b2.length) {
							if (b2[j] == b1[i]) {
								count++;
								j++;
							}
						}
					}
				}
			}
			System.out.println("Contiene " + count + " letras");
		} catch (Exception e) {

			System.out.println("Error " + e);
		}
	}
}