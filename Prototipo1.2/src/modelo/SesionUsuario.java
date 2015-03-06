package modelo;



/**
 * @author jesus
 *
 */
public class SesionUsuario {
	public Usuario usr;		//hemos creado el objeto "usr" que esta formado por la clase usuario.
	public String fecha;
	
	@Override
	public String toString() {
		
		//return "Sesion Usuario inicializada por: \n" + usr + "\n" + fecha+"\n";
		
			return "" + usr + "" + fecha + "\n\n";
		}
	
}

