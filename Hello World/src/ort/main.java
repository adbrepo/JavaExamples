package ort;

import java.util.Scanner;

public class main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String textoIngresado = "";
		
		Double numeroDecimalIngresado = 0.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresar texto");
		textoIngresado = input.nextLine();
		System.out.println("El texto ingresado es: " + textoIngresado);
		
		
		System.out.println("Ingresar numero decimal");
		numeroDecimalIngresado = Double.parseDouble(input.nextLine());
		System.out.println("El numero ingresado es: " + numeroDecimalIngresado);

		Mascota miMascota = new Mascota ("perro","oliver");
		System.out.println("Mi mascota es un "+ miMascota.getEspecie() + " llamado " + miMascota.getNombre());
		
			
	}

}
