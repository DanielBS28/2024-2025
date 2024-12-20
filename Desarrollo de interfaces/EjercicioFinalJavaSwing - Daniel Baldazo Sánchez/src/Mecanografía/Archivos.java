package Mecanografía;

import java.io.*;
import java.util.ArrayList;

public class Archivos {

	final static String Usuarios = "src/Mecanografía/ArchivosIniciales/Usuarios.txt";
	final static String Estadísticas = "src/Mecanografía/ArchivosIniciales/Estadísticas.txt";
	final static String Textos = "src/Mecanografía/ArchivosIniciales/Textos.txt";

	public static boolean escanearArchivos() {

		File ArchivoUsuarios = new File(Usuarios);
		File ArchivoEstadísticas = new File(Estadísticas);
		File ArchivoTextos = new File(Textos);
		

		if (ArchivoUsuarios.exists() && ArchivoEstadísticas.exists() && ArchivoTextos.exists()) {
			DatosTXT.cargarUsuarios();
			DatosTXT.cargarTextos();
			return true;	
		}
		else
			return false;
	}

	public static ArrayList<Usuario> leerUsuarios() {

		ArrayList<Usuario> USUARIOS = new ArrayList<>();
		
		USUARIOS.add(new Usuario("a","admin", "a", "cuentacoces1@gmail.com"));	

		String linea = "";
		
		String [] campos = {"ID","Nombre","Contraseña","Correo"};
		try {
			BufferedReader fis = new BufferedReader(new FileReader(Usuarios));

			while ((linea = fis.readLine()) != null) {
				
				String [] lectura = linea.split(",");
				
				if(lectura.length == campos.length) 
					USUARIOS.add(new Usuario(lectura[0],lectura[1], lectura[2], lectura[3]));	

			}
			
			fis.close();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return USUARIOS;

	}
	
	public static ArrayList<String> leerTextos() {

		ArrayList<String> TEXTOS = new ArrayList<>();
		
		String linea = "";
		
		try {
			BufferedReader fis = new BufferedReader(new FileReader(Textos));

			while ((linea = fis.readLine()) != null) {
				
				String [] lectura = linea.split("<cambiodetexto>");
				if(lectura.length == 2) {
				TEXTOS.add(lectura[0]);
				TEXTOS.add(lectura[1]);
				}

			}
			
			fis.close();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return TEXTOS;

	}

}
