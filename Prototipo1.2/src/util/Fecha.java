package util;

import java.util.GregorianCalendar;

/**
 * Implementar el GregorianCalendar
 * @author jesus
 *
 */

public class Fecha {


	private String fecha;
	
	@Override
	public String toString() {
		return "" + fecha;
	}

	public Fecha(String fecha){
		super();
		this.fecha = fecha;
	}
	
	public Fecha(Fecha f){
		
		fecha = new String(f.fecha);
	}

}
