package ort;

public class Mascota
{
	private String especie;
	private String nombre;
	
	public Mascota (String especie, String nombre)
	{
		this.especie = especie;
		this.nombre = nombre;
	}
	
   public String getEspecie() 
   {
	   return especie;
   }		
   public String getNombre() 
   {
	   return nombre;
   }

}
