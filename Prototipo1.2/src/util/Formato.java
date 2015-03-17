package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formato {
	
	private static final String Patron_DNI = "^(([A-Z]\\d{8})|(\\d{8}[A-Z]))$"; //regex DNI
	
	private static final String Patron_CorreoE = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";//regex CorreoE

	public static boolean formatoNifValido(String cadena){ 
		
        Pattern expresion = Pattern.compile(Patron_DNI);
        Matcher validador = expresion.matcher(cadena);
        
        		if(validador.find()){
        			return true;
        		}
        
    	return false;
	}
	
	public static boolean formatoCorreoEvalido(String crreo){ 
			
	        Pattern expresion = Pattern.compile(Patron_CorreoE);
	        Matcher validador = expresion.matcher(crreo);
	        
	        		if(validador.find()){
	        			return true;
	        		}
	        
	    	return false;
		}

}
