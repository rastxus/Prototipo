//	Paquete al que pertenece
package accesoDatos;	
// Paquete que quiero importar .laclase
import modelo.Usuario;	

/**Algortimo de Busqueda Binaria.
 * 
 *  
 * 
 */
 public class BusquedaAlgoritmo {
	public static Usuario buscarUsuarioBin(String nif) {
		int comparacion;
		int inicio = 0;
		int fin = Datos.datosUsuario.size()-1;
		int medio = 0;
		while (inicio <= fin) {
			medio = (inicio+fin) / 2;
			comparacion = Datos.datosUsuario.get(medio).getNif().getTexto().compareTo(nif);
			if ( comparacion == 0 )
				return Datos.datosUsuario.get(medio);
			else if ( comparacion < 0) {
				inicio = medio + 1;
			} else {
				fin = medio - 1;
			}
		}
		return null;
	}
}
