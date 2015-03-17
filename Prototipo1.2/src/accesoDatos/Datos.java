package accesoDatos;

import java.util.ArrayList;

import util.CifradoCesar;
import modelo.Nif;
import modelo.SesionUsuario;
import modelo.Usuario;
import modelo.Direccion;
import modelo.Usuario.RolUsuario;

public class Datos {
	
	public static final int MAX_USUARIOS=10;
	
	public static final int MAX_SESIONES=10;
	
	public static ArrayList<Usuario> datosUsuario = new ArrayList<Usuario>();
	
	public static ArrayList<SesionUsuario> SesionesUsuario=new ArrayList<SesionUsuario>();
	
	public static int e = 0;
	
	public static String buscaUsuario(String dni){
		StringBuilder aux2=new StringBuilder();
		
		for (Usuario U: datosUsuario){			
			
				if(U.getNif().equals(dni)){		
					
						aux2.append(U.aTextoConSeparador('\n'));	
						return aux2.toString();
				}
		
		}
		return null;
		
	}
	public static String buscaSesion(String dni){
		StringBuilder aux3=new StringBuilder();
		
		for (SesionUsuario S: SesionesUsuario){			
			if(S!=null){
				if(S.usr.getNif().equals(dni)){		
					
					aux3.append("El Usuario inicio sesion el :"+S.fecha);
					
					return aux3.toString();
				}
			}
		}
		return "Usuario no conectado";
		
	}
	
	
	public static String datosUsuariosTexto(){
		
		StringBuilder aux=new StringBuilder();
		
		for(Usuario U: datosUsuario){
			if(U!=null){
			aux.append(U.aTextoConSeparador('\n'));
			}
			
		}
		return aux.toString();
	}
	
	public static String datosSesionesTexto(){
		
		StringBuilder auxSesion=new StringBuilder();
		
		for(SesionUsuario S: SesionesUsuario){
			if(S!=null){
			auxSesion.append(S.usr.aTextoConSeparador('\n'));
			auxSesion.append(S.fecha + "\n\n");
						
			}
		}
		return auxSesion.toString();
	}
	
	public static void crearDatosPrueba(int n){	
		String barra = "";
	    int ale;

	   
		//creando el resto de usuarios automaticamente
		for(int i=0;i<n;i++)
		{
			
			ale = (int) (Math.random()*(99999999));
			
			Usuario aux = new Usuario();
			
			
			aux.setNif(new Nif(i+"7689523P"));
			aux.setNombre(e+1+"juan");
			aux.setApellidos(e+1+"aaa");
		    aux.setDomicilio(new Direccion("via de la plata","30006","3","Murcia","Españistan"));
			aux.setCorreoE(Usuario.correoValido(e +"gemai@laaa.com"));
			aux.setFechaNacimiento(e+1+"aaa");
			aux.setFechaAlta(e+1+"aaa");
			aux.setClaveAcceso(CifradoCesar.Cifrado(e+1+"hola123"));
			aux.setRol(RolUsuario.INVITADO);
			
			datosUsuario.add(aux);
			
			
			e++;
		
			
		}
		
	}
}
