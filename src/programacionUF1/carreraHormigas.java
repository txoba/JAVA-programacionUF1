package progRecus;

import java.io.*;
import java.util.*;

public class carreraHormigas {

	/*
	 * Práctica CARRERA DE HORMIGAS. Hemos inventado una nueva prueba de
	 * atletismo: la carrera de hormigas. Consiste en colocar varias hormigas en
	 * diferentes posiciones de una fina pista de una determinada longitud. Las
	 * hormigas no tienen demasiada libertad de movimientos, por lo que
	 * únicamente pueden ir hacia un lado o hacia el otro de la pista. Eso sí,
	 * podemos asegurar que cada hormiga correrá por su carril y no chocará con
	 * otra. Cuando se colocan las hormigas en la pista (recordemos que cada una
	 * estará en diferentes posiciones), no se sabe en qué sentido comenzará a
	 * desplazarse cada una… pero se quiere saber cuáles son el mínimo y el
	 * máximo tiempo posible que tardarán todas las hormigas en llegar a uno de
	 * los extremos de la pista, sabiendo que todas se mueven a la misma
	 * velocidad, de un centímetro por segundo.
	 */

	public static void main(String[] args) {

		try {

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			int v = 0;
			int h = 0;
			int j = 0;
			int minvalue = Integer.MIN_VALUE;
			int maxvalue = Integer.MIN_VALUE;
			ArrayList<Integer> posicion = new ArrayList<Integer>();
			ArrayList<Integer> min = new ArrayList<Integer>();
			ArrayList<Integer> max = new ArrayList<Integer>();

			System.out.println("Introduce la longitud de la pista: ");
			v = Integer.parseInt(buffer.readLine());
			for (int i = 0; i < v; i++) {
				posicion.add(i, 0);
			}
			System.out.println("Introduce cuantas hormigas van a correr: ");
			h = Integer.parseInt(buffer.readLine());
			for (int i = 0; i < h; i++) {
				System.out.println("Introduce las posiciones de las hormigas: ");
				posicion.set(j = Integer.parseInt(buffer.readLine()), 1);
				if ((j + 1) < (v - j)) {
					min.add(i, j + 1);
					max.add(i, v - j);
				} else {
					min.add(i, v - j);
					max.add(i, j + 1);
				}
				if (min.get(i) > minvalue) {
					minvalue = min.get(i);
				}
				if (max.get(i) > maxvalue) {
					maxvalue = max.get(i);
				}
			}
			System.out.println(posicion);
			System.out.println(min);
			System.out.println(max);
			System.out.println(minvalue);
			System.out.println(maxvalue);
		} catch (Exception e) {

			System.out.println("Error " + e);
		}
	}
}