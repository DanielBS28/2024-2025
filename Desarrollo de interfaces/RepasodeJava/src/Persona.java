
public class Persona {

	private String DNI; 
	private String Nombre; 
	private String Apellidos; 

	
	public Persona(String dNI, String nombre, String apellidos) {
		
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;

	}
	

	


	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + "]";
	}





	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	
	
	
	
	
	

}
