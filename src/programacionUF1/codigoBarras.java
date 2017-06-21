package progRecus;

import java.io.*;
import java.util.*;

public class codigoBarras {

	/*
	 * Práctica CÓDIGO DE BARRAS. En 1952, tres norteamericanos patentaron lo
	 * que terminó llamándose código de barras. Consiste en una técnica para
	 * representar números (y, en menos ocasiones, letras) mediante una serie de
	 * líneas verticales paralelas, con diferentes grosores y separaciones entre
	 * ellas. Si bien el primer uso sirvió para identificar de manera automática
	 * los vagones de un ferrocarril, hoy los códigos de barras se utilizan en
	 * infinidad de lugares, siendo la catalogación de productos la más
	 * habitual. La manera concreta de codificar mediante barras los números y
	 * las letras puede ser muy variada, lo que ha llevado a la aparición de
	 * diferentes estándares. De todos ellos, el EAN (European Article Number)
	 * resulta ser el más extendido. De éste, hay principalmente dos formatos,
	 * que se diferencian en el ancho. Existe así el llamado EAN-8, que codifica
	 * 8 números, y el EAN-13, que, naturalmente, codifica 13.
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
