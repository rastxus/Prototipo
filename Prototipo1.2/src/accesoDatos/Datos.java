package accesoDatos;

import java.util.ArrayList;

import modelo.CifradoCesar;
import modelo.SesionUsuario;
import modelo.Usuario;

public class Datos {
	
	public static final int MAX_USUARIOS=10;
	
	public static final int MAX_SESIONES=10;
	
	public static ArrayList<Usuario> datosUsuario = new ArrayList<Usuario>();
	
	public static ArrayList<SesionUsuario> SesionesUsuario=new ArrayList<SesionUsuario>();
	
	public static int e = 0;
	
	public static String buscaUsuario(String dni){
		StringBuilder aux2=new StringBuilder();
		
		for (Usuario U: datosUsuario){			
			
				if(U.nif.equals(dni)){		
					
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
				if(S.usr.nif.equals(dni)){		
					
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
			
			
			aux.nif = i+"4689523p";
			aux.nombre = e+1+"juan";
			aux.apellidos = e+1+"aaa";
		    aux.domicilio = e+1+"aaa";
			aux.correoE = Usuario.correoValido(e +"gemai@laaa.com");
			aux.fechaNacimiento = e+1+"aaa";
			aux.fechaAlta = e+1+"aaa";
			aux.claveAcceso = CifradoCesar.Cifrado(e+1+"hola123");
			aux.rol = e+1+"aaa";
			
			datosUsuario.add(aux);
			
			
			e++;
		
			
		}
		
	}
}
