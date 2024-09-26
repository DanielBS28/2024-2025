package EjerciciosBásicos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio1 {

	static Scanner teclado = new Scanner(System.in);

	static void comprobarDirectorio(File directorio) {

		if (directorio.exists()) {
			System.out.println("El directorio es valido, vamos a ver los archivos");
			nombrarArchivos(directorio);
		}else 
			System.out.println("Has introducido mal los datos del directorio o el directorio no existe");
		
	}
	
	static void nombrarArchivos(File directorio) {
		
		File [] ficheros = directorio.listFiles();
		
		for (File f : ficheros)
			System.out.println("El nombre del archivo es: " + f.getName());
		
		/*for(int i = 0; i<ficheros.length; i++)
			System.out.println("El nombre del archivo es: " + ficheros[i].getName());
		 */
	}
	
	static void ejercicio1() {
		
		System.out.println("Dime el nombre del directorio que quieras (A partir de la ruta actual)");
		String directorioSolicitado = teclado.nextLine();
		File directorio = new File(".\\" + directorioSolicitado + "\\");
		comprobarDirectorio(directorio);
		
		/* Estas lineas de código me permiten ver todos los archivos si introduzco una ruta absoluta
		 * System.out.println("Introduce la ruta absoluta del directorio que quieres ver");
		File directorio2 = new File(teclado.nextLine());
		comprobarDirectorio(directorio2);
		 */
	}
	
	static void ejercicio2() {
		String fichero = ("ficheroprueba.txt");
		File documento = new File(fichero);
		crearFichero(documento);
		comprobarFichero(documento);
		
	}
	
	static void crearFichero(File creardocumento) {
		
		try {
		if(!creardocumento.exists()) {
			if(creardocumento.createNewFile())
				System.out.println("El fichero se ha creado correctamente");
			else 
				System.out.println("El fichero no se ha podido crear");
		}else
			System.out.println("El fichero ya existe");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	static void comprobarFichero(File fichero) {
		
		
		if(fichero.exists()) {
			System.out.println("El fichero existe, vamos a borrarlo");
			fichero.delete();
		}else 
			System.out.println("El fichero no existe");
		}
			
	public static void main(String[] args) {
		
		 ejercicio1();
		
		 // ejercicio2();
		
	}

}
