package com.edd.main;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//cadena1.compareTo(cadena2) < 0)
		
		String cadena1 ="alejandro";
		String cadena2 ="juanito";
		
		if(cadena1.compareTo(cadena2)<0) 
		{
			System.out.println("la cadena 1 es menor a la cadena 2");
		}else if(cadena1.compareTo(cadena2)>0) 
		{
			System.out.println("la cadena 2 es menor a la cadena1 ");
		}
		
	
		System.out.println("["+Math.max(3,-3)+"]");
		
	}

}
