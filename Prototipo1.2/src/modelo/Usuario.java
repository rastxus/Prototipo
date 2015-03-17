package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import util.Fecha;
import modelo.CorreoE;
/**
 * @author Jesus
 *
 */
public class Usuario {
	
	private String idUser;
	private Nif nif;
	private String nombre;
	private String apellidos;
	private Direccion domicilio;
	private CorreoE correoE;
	private Fecha fechaNacimiento;
	private Fecha fechaAlta;
	private String claveAcceso;
	private RolUsuario rol;
	
		public enum RolUsuario { INVITADO, NORMAL, ADMINISTRADOR }

		private String idUsr;
		public String getIdUsr() {
			return idUsr;
		}

		public void setIdUsr(String idUsr) {
			this.idUsr = idUsr;
		}

		public Nif getNif() {
			return nif;
		}

		public void setNif(Nif nif) {
			this.nif = nif;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public Direccion getDomicilio() {
			return domicilio;
		}

		public void setDomicilio(Direccion domicilio) {
			this.domicilio = domicilio;
		}

		public CorreoE getCorreoE() {
			return correoE;
		}

		public void setCorreoE(String correoE) {
			this.correoE = new CorreoE(correoE);
		}

		public Fecha getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(String fechaNacimiento) {
			this.fechaNacimiento = new Fecha(fechaNacimiento);
		}

		public Fecha getFechaAlta() {
			return fechaAlta;
		}

		public void setFechaAlta(String fechaAlta) {
			this.fechaAlta = new Fecha(fechaAlta);
		}

		public String getClaveAcceso() {
			return claveAcceso;
		}

		public void setClaveAcceso(String claveAcceso) {
			this.claveAcceso = claveAcceso;
		}

		public RolUsuario getRol() {
			return rol;
		}

		public void setRol(RolUsuario rol) {
			this.rol = rol;
		}

		public Usuario(String idUsr, Nif nif, String nombre, String apellidos,
				Direccion domicilio, CorreoE correoE, Fecha fechaNacimiento,
				Fecha fechaAlta, String claveAcceso, RolUsuario rol) {
			super();
			this.idUsr = idUsr;
			this.nif = nif;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.domicilio = domicilio;
			this.correoE = correoE;
			this.fechaNacimiento = fechaNacimiento;
			this.fechaAlta = fechaAlta;
			this.claveAcceso = claveAcceso;
			this.rol = rol;
		}
		public Usuario() {
			this.idUsr = null;
			this.nif = null ;
			this.nombre = null;
			this.apellidos = null;
			this.domicilio = null;
			this.correoE = null;
			this.fechaNacimiento = null;
			this.fechaAlta = null;
			this.claveAcceso = null;
			this.rol = RolUsuario.INVITADO;
			
		}
		public Usuario(Usuario u) {
			super();
			this.idUsr = new String(u.idUsr);
			this.nif = new Nif(u.nif);
			this.nombre = new String(u.nombre);
			this.apellidos = new String(u.apellidos);
			this.domicilio = new Direccion(u.domicilio);
			this.correoE = new CorreoE(u.correoE);
			this.fechaNacimiento = new Fecha(u.fechaNacimiento);
			this.fechaAlta = new Fecha(u.fechaAlta);
			this.claveAcceso = new String(u.claveAcceso);
			this.rol = rol.INVITADO;
		}


		
	
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