package progRecus;

import java.io.*;
import java.util.*;

public class codigoBarras {

	/*
	 * Pr�ctica C�DIGO DE BARRAS. En 1952, tres norteamericanos patentaron lo
	 * que termin� llam�ndose c�digo de barras. Consiste en una t�cnica para
	 * representar n�meros (y, en menos ocasiones, letras) mediante una serie de
	 * l�neas verticales paralelas, con diferentes grosores y separaciones entre
	 * ellas. Si bien el primer uso sirvi� para identificar de manera autom�tica
	 * los vagones de un ferrocarril, hoy los c�digos de barras se utilizan en
	 * infinidad de lugares, siendo la catalogaci�n de productos la m�s
	 * habitual. La manera concreta de codificar mediante barras los n�meros y
	 * las letras puede ser muy variada, lo que ha llevado a la aparici�n de
	 * diferentes est�ndares. De todos ellos, el EAN (European Article Number)
	 * resulta ser el m�s extendido. De �ste, hay principalmente dos formatos,
	 * que se diferencian en el ancho. Existe as� el llamado EAN-8, que codifica
	 * 8 n�meros, y el EAN-13, que, naturalmente, codifica 13.
	 */

	public static void main(String[] args) {

		try {

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			ArrayList<Integer> codigo = new ArrayList<Integer>();
			ArrayList<String> resultado = new ArrayList<String>();
			String x = "";
			int suma = 0;
			int j = 0;

			System.out.println("CODIGO DE BARRAS: ");
			x = buffer.readLine();
			while (Long.parseLong(x) != 0) {
				for (int i = x.length() - 1; i >= 0; i--) {
					codigo.add(Character.getNumericValue(x.charAt(i)));
				}
				for (int i = 0; i < codigo.size(); i++) {
					if (i != 0) {
						if (i % 2 == 0) {
							suma += codigo.get(i);
						} else {
							suma += (codigo.get(i) * 3);
						}
					}
				}
				if (suma % 10 == 0) {
					if (codigo.size() <= 8) {
						resultado.add(j, "SI. EAN-8");
					} else {
						resultado.add(j, "SI. EAN-13");
					}
				} else {
					suma += codigo.get(0);
					if (suma % 10 == 0) {
						if (codigo.size() <= 8) {
							resultado.add(j, "SI. EAN-8");
						} else {
							resultado.add(j, "SI. EAN-13");
						}
					} else {
						if (codigo.size() <= 8) {
							resultado.add(j, "NO. EAN-8");
						} else {
							resultado.add(j, "NO. EAN-13");
						}
					}
				}
				j++;
				codigo.clear();
				suma = 0;
				System.out.println("CODIGO DE BARRAS: ");
				x = buffer.readLine();
			}
			for (j = 0; j < resultado.size(); j++) {
				System.out.println(resultado.get(j));
			}
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
	}
}
