package ort.clases;

public class Personal 
{
	private String nombre;
	private String apellido;
	private String dni;
	
	public Personal (String nombre, String apellido, String dni)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public String getApellido()
	{
		return apellido;
	}
	
	public String getDni()
	{
		return dni;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
}
