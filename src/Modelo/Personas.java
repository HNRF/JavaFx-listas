package Modelo;

import java.util.Objects;

public class Personas {

	private String Nombre;
	private String Apellido;
	private int Edad;

	public Personas() {
		super();
	}

	public Personas(String nombre, String apellido, int edad) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	@Override
	public String toString() {
		return "Personas [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + "]";
	}


}
