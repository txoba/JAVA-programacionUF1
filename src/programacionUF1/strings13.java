package progRecus;

import java.io.*;

public class strings13 {
	public static void main(String[] args) throws IOException {

		try {

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Nombre:");
			String nombre = buffer.readLine();
			System.out.println("Apellido:");
			String apellido = buffer.readLine();
			System.out.println("Año nacimiento:");
			String anyo = buffer.readLine();
			System.out.println("Nota media:");
			String nota = buffer.readLine();

			int edad = Integer.parseInt(anyo);
			double notaMedia = Double.parseDouble(nota);
			int x = 0;
			int fecha = 0;
			double nota2 = 0;
			double nota3 = 0;
			double mediaTotal = 0;

			while (x != 0) { // si es 0, sortira del programa

				System.out.println("MENU");
				System.out.println("1 NOMBRE Y APELLIDO");
				System.out.println("2 EDAD");
				System.out.println("3 NOTA MEDIA");
				System.out.println("4 NOTA COMPAÑEROS");
				System.out.println("5 INFO USUARIO");
				System.out.println("6 NOMBRE/APELLIDO COMPAÑEROS");
				System.out.println("0 SALIR");
				x = Integer.parseInt(buffer.readLine());

				switch (x) {
				case 1: // Nom i cognoms complerts.

					System.out.println(nombre + " " + apellido);
					break;

				case 2: // Edat, i dir si és major d’edat o no.

					System.out.println(edad);
					fecha = 2016 - edad;
					if (fecha > 18) {
						System.out.println("Mayor de edad");
					} else {
						System.out.println("Menor de edad");
					}
					break;

				case 3: // Informar de la nota mitja del cicle i dir si està
						// suspès, suficient, bé, notable o excel·lent

					if (notaMedia >= 5 && notaMedia < 6) {
						System.out.println("Suficiente");
					} else if (notaMedia >= 6 && notaMedia < 7) {
						System.out.println("Bien");
					} else if (notaMedia >= 7 && notaMedia < 9) {
						System.out.println("Notable");
					} else if (notaMedia >= 9 && notaMedia <= 10) {
						System.out.println("Excelente!!");
					} else if (notaMedia > 10) {
						System.out.println("Introducir del 0 al 10");
					} else {
						System.out.println("Suspendido...");
					}
					break;

				case 4: /*
						 * Demanar la nota de dos companys més del cicle, i dir
						 * quina és la nota mitja de tots tres, quina és la nota
						 * més alta i quina és la nota més baixa.
						 */

					System.out.println("Nota media compañero 1:");
					String com1 = buffer.readLine();
					nota2 = Double.parseDouble(com1);

					System.out.println("Nota media compañero 2:");
					String com2 = buffer.readLine();
					nota3 = Double.parseDouble(com2);

					mediaTotal = (notaMedia + nota2 + nota3) / 3;

					System.out.println("Nota media de los tres: " + mediaTotal);

					if (notaMedia > nota2 && notaMedia > nota3) {
						System.out.println("Nota más alta: " + notaMedia);
					} else if (nota2 > notaMedia && nota2 > nota3) {
						System.out.println("Nota más alta: " + nota2);
					} else {
						System.out.println("Nota más alta: " + nota3);
					}

					if (notaMedia < nota2 && notaMedia < nota3) {
						System.out.println("Nota más baja:" + notaMedia);
					} else if (nota2 < notaMedia && nota2 < nota3) {
						System.out.println("Nota más baja: " + nota2);
					} else {
						System.out.println("Nota más baja: " + nota3);
					}
					break;

				case 5: /*
						 * A partir del nom de l’usuari demanat per teclat,
						 * mostrar la següent informació: Nombre de caràcters
						 * que té el nom, mostrar la inicial del nom, i mostrar
						 * la inicial del cognom
						 */

					int tamanyo = nombre.length();
					System.out.println("El nombre " + nombre + " tiene " + tamanyo + " carácteres");

					System.out.println("Letra inicial del nombre: " + nombre.charAt(0));
					System.out.println("Letra inicial del apellido: " + apellido.charAt(0));
					break;

				case 6: /*
						 * Demanar el nom i el cognom de dos companys del cicle
						 * (per separat), i informar si hi ha algun nom igual, i
						 * ordenar alfabèticament, primer els noms, i després
						 * els cognoms.
						 */

					System.out.println("Nombre 1:");
					String name1 = buffer.readLine();

					System.out.println("Apellido 1:");
					String sur1 = buffer.readLine();

					System.out.println("Nombre 2:");
					String name2 = buffer.readLine();

					System.out.println("Apellido 2:");
					String sur2 = buffer.readLine();

					if (name1.contentEquals(name2)) {
						System.out.println("Nombres iguales");
					} else {
						System.out.println("Nombres NO iguales");
					}

					if (sur1.contentEquals(sur2)) {
						System.out.println("Apellidos iguales");
					} else {
						System.out.println("Apellidos NO iguales");
					}
					break;

				}
			}
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
	}
}