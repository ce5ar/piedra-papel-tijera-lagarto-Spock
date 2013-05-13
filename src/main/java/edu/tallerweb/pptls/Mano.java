package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 *Incluye la matriz con los posibles resultados
 *	Filas		Jugador 1
 *	Columnas	Jugador 2
 *	
 *				PIEDRA	SPOCK	PAPEL	LAGARTO	TIJERA
 *		
 *	PIEDRA		EMPATA	PIERDE	PIERDE	GANA	GANA
 *	
 *	SPOCK		GANA	EMPATA	PIERDE	PIERDE	GANA
 *	
 *	PAPEL		GANA	GANA	EMPATA	PIERDE	PIERDE
 *	
 *	LAGARTO		PIERDE	GANA	GANA	EMPATA	PIERDE
 *	
 *	TIJERA		PIERDE	PIERDE	GANA	GANA	EMPATA
 *
 *
 */

public class Mano {
	
	private Forma forma;
	
	private Resultado [][] matriz = new Resultado [][]	{{Resultado.EMPATA, Resultado.PIERDE, Resultado.PIERDE, Resultado.GANA, Resultado.GANA},
														{Resultado.GANA, Resultado.EMPATA, Resultado.PIERDE, Resultado.PIERDE, Resultado.GANA},
														{Resultado.GANA, Resultado.GANA, Resultado.EMPATA, Resultado.PIERDE, Resultado.PIERDE},
														{Resultado.PIERDE, Resultado.GANA, Resultado.GANA, Resultado.EMPATA, Resultado.PIERDE},
														{Resultado.PIERDE, Resultado.PIERDE, Resultado.GANA, Resultado.GANA, Resultado.EMPATA}};
	
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		
		this.forma = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		
		return matriz[this.forma.getValor()][otra.forma.getValor()];
			
}
}
