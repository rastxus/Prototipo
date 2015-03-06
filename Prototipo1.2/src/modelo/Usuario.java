package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jesus
 *
 */
public class Usuario {

		public String nif;
		public String nombre;
		public String apellidos;
		public String domicilio;
		public String correoE;
		public String fechaNacimiento;
		public String fechaAlta;
		public String claveAcceso;
		public String rol;
		
	
		/**public String toString() {
			return "\n\nNIF:\t\t" + nif + "\n\nNombre:\t\t" + nombre
					+ "\n\nApellidos:\t" + apellidos + "\n\nDomicilio:\t" + domicilio
					+ "\n\nCorreoE:\t" + correoE + "\n\nFecha de Nacimiento:\t"
					+ fechaNacimiento + "\n\nFecha de Alta:\t" + fechaAlta
					+ "\n\nClaveAcceso:\t" + claveAcceso + "\n\nRol:\t" + rol;
		}*/
		
		
		public String aTextoConSeparador(char c) {
			
			return	
					
					"NIF:\t\t" + nif + c + 
					"Nombre:\t\t" + nombre + c +
					"Apellidos:\t" + apellidos + c +
					"Domicilio:\t" + domicilio + c +
					"CorreoE:\t" + correoE + c +
					"Fecha de Nacimiento:\t" +fechaNacimiento + c +
					"Fecha de Alta:\t" +fechaAlta + c +
					"ClaveAcceso:\t" + claveAcceso + c +
					"Rol:\t" + rol +c +"\n\n";
		}
		
		public static String correoValido(String correo){
			
			String patron = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			
			Pattern expresion = Pattern.compile(patron);
	        Matcher validador = expresion.matcher(correo);
	        
	        if(validador.find()){
	        	return correo;
	        }
			
			return "Error";
			
		}
		
}