package ort;

import java.util.ArrayList;

import ort.clases.Personal;

public class main
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList<Personal> empleados = new ArrayList <Personal>();
		Personal empleado;
		
		empleado = new Personal ("Juan","Perez","334445569");
		empleados.add(empleado);
		empleado = new Personal ("Jorge","Gutierrez","33876552");
		empleados.add(empleado);
		empleado = new Personal ("Alejadro","Fernandez","23458985");
		empleados.add(empleado);
		empleado = new Personal ("Brian","Wairaich","43789654");
		empleados.add(empleado);
		empleado = new Personal ("Julian","Gonzalez","34987657");
		empleados.add(empleado);
		
		System.out.println("El tamño del ArrayList de empleados es de " +empleados.size());
		System.out.println("");
		
		System.out.println("Listado de todos los empleados ");
		System.out.println("");
	
		 for( Personal empleadoBuscado : empleados) 
		 { 
			 System.out.print("Posicón: "+ empleados.indexOf(empleadoBuscado)+"   ");
			 System.out.print("Nombre: "+empleadoBuscado.getNombre()+"   "); 
			 System.out.print("Apellido: "+empleadoBuscado.getApellido()+"   ");
			 System.out.println("Dni: "+empleadoBuscado.getDni()+"   ");  
		 }
		 
		 
		 empleado = new Personal ("Ricardo","Lopez","334445569");
		 empleados.add(3,empleado);
		 
		 System.out.println("");
		 System.out.println("");  
		 System.out.println("");  
		 
		 System.out.println("Agregar un empleado en la posición 3 ");
		 System.out.println("");
	 
		 for( Personal empleadoBuscado : empleados) 
		 { 
			 System.out.print("Posicón: "+ empleados.indexOf(empleadoBuscado)+"   ");
			 System.out.print("Nombre: "+empleadoBuscado.getNombre()+"   "); 
			 System.out.print("Apellido: "+empleadoBuscado.getApellido()+"   ");
			 System.out.println("Dni: "+empleadoBuscado.getDni()+"   ");  
		 }
		 
		 empleados.remove(3);
		 System.out.println("");
		 System.out.println("");  
		 System.out.println("");
		 System.out.println("Eliminado el empleado en la posición 3 ");
		 System.out.println("");
		 
		 for( Personal empleadoBuscado : empleados) 
		 { 
			 System.out.print("Posicón: "+ empleados.indexOf(empleadoBuscado)+"   ");
			 System.out.print("Nombre: "+empleadoBuscado.getNombre()+"   "); 
			 System.out.print("Apellido: "+empleadoBuscado.getApellido()+"   ");
			 System.out.println("Dni: "+empleadoBuscado.getDni()+"   ");  
		 }
		 
		 
		 
		 System.out.println("");
		 System.out.println("");  
		 System.out.println("");
		 System.out.println("Modificado el empleado en la posición 2 ");
		 System.out.println("");
		 
		 empleado = empleados.get(2);
		 empleado.setNombre("Lio");
		 
		 for( Personal empleadoBuscado : empleados) 
		 { 
			 System.out.print("Posicón: "+ empleados.indexOf(empleadoBuscado)+"   ");
			 System.out.print("Nombre: "+empleadoBuscado.getNombre()+"   "); 
			 System.out.print("Apellido: "+empleadoBuscado.getApellido()+"   ");
			 System.out.println("Dni: "+empleadoBuscado.getDni()+"   ");  
		 }	 
		 
		 System.out.println("");
		 System.out.println("");  
		 System.out.println("");
		 System.out.print("El empleado buscado es: ");
		 System.out.println("");
		 
		
		Personal empleadoBuscado = null;
		int indice = 0;
	
		while (indice < empleados.size() && empleadoBuscado == null) 
		{
			if (Integer.parseInt(empleados.get(indice).getDni()) == 43789654) 
			{
				empleadoBuscado = empleados.get(indice);
				System.out.print("Posicón: "+ empleados.indexOf(empleadoBuscado)+"   ");
				System.out.print("Nombre: "+empleadoBuscado.getNombre()+"   "); 
				System.out.print("Apellido: "+empleadoBuscado.getApellido()+"   ");
				System.out.println("Dni: "+empleadoBuscado.getDni()+"   ");  	
			}
			else 
			{
				
				indice++;
			}
		}
		 	
	}

}
