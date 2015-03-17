package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import util.Formato;
public class Nif {
	
	@Override
	public String toString() {
		return "" + texto;
	}



	private String texto;

	
	public String getTexto() {
		return texto;
	}
	//Constructor
	public Nif(String nif){
		setTexto(nif);
	}
	
	public Nif(Nif nif){
		texto = new String(nif.texto);
	}
	
	public void setTexto(String txn) {
		
		
		
		if(Formato.formatoNifValido(txn) && LetraNifValida(txn)){
			
			texto = txn;
			
		}		
		
	}
	

	
	public boolean LetraNifValida(String dni){
		
		
		return true;
	}


}
