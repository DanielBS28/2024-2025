package RepasoExamen;

public class Persona {

	private String nombre;
	private String contrasena;
	private String rol;
	
	public Persona(String nombre, String contrasena, String rol) {
		super();
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.rol = rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", contrasena=" + contrasena + ", rol=" + rol + "]";
	}
	
	
	
}