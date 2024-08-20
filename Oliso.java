package modelo;

public class Oliso {
	
	/**
	 * Muestra por la consola estandar el contenido del tablero
	 * @param tablero es una matriz de enteros NXN, con N>0
	 */
	public static void mostrar_tablero(int[][] tablero) 
	{
		for (int i = 0; i < tablero.length; i ++)
		{
			for (int j = 0; j < tablero[0].length; j ++)
			{
				System.out.print(tablero[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static boolean validar_triqui (int[][] tablero)
	{
		return false;
	}
	

	public static void main(String[] args) 
	{
		// Caso de prueba #1
		int[][] caso1 = {{0,0,0},{0,0,0},{0,0,0}};
		System.out.println("Prueba #1: ");
		mostrar_tablero(caso1);
		System.out.println("Hay triqui? ");
		System.out.println(validar_triqui(caso1));
		
		// Caso de prueba #2
		int[][] caso2 = {{25,0,25},{7,700,0},{0,0,0}};
		System.out.println("Prueba #2: ");
		mostrar_tablero(caso2);
		System.out.println("Hay triqui? ");
		System.out.println(validar_triqui(caso2));
				
	}

}
	