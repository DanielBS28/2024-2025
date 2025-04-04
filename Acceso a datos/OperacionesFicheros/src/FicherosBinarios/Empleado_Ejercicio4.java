package FicherosBinarios;

import java.io.Serializable;

public class Empleado_Ejercicio4 implements Serializable{
	
	private String nombre;
	private String apellido;
	private String puesto;
	private double salario;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Empleado_Ejercicio4 [nombre=" + nombre + ", apellido=" + apellido + ", puesto=" + puesto + ", salario="
				+ salario + "]";
	}
	public Empleado_Ejercicio4(String nombre, String apellido, String puesto, double salario) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.puesto = puesto;
		this.salario = salario;
	}
	
	

}
