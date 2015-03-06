package modelo;

import accesoDatos.Datos;


public class CifradoCesar {
	
	public static String Cifrado(String Contraseña){
	
		
		
		int nAleatorio = ((int)(Math.random()*100000000));
		
		
		char[] ArrayChar = Contraseña.toCharArray();
		
		String Textocifrado = "";
		
		int aux;	
				
		for(int i = 0;i < ArrayChar.length;i++){
			
			aux = ArrayChar[i];
			
			aux = aux + nAleatorio;
			
			ArrayChar[i] = (char) aux;
			
			Textocifrado += ArrayChar[i];
			
		}
			Textocifrado +=","+nAleatorio;
		
		return Textocifrado;
	}
	
	/*
	 * Metodo para descifrar la clave de registro,
	 * 
	 * 
	 */
public static String RegistroCifrado(String Contraseña,int n){
	
	
			
		
		char[] ArrayChar = Contraseña.toCharArray();
		
		String Textocifrado = "";
		
		int aux;	
				
		for(int i = 0;i < ArrayChar.length;i++){
			
			aux = ArrayChar[i];
			
			aux = aux + n;
			
			ArrayChar[i] = (char) aux;
			
			Textocifrado += ArrayChar[i];
			
		}
			Textocifrado +=","+n;
		
		return Textocifrado;
	}

}