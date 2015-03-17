package modelo;

import util.Formato;

public class CorreoE {
	
	private String correoE;
	
	@Override
	public String toString() {
		return "" + correoE;
	}

	public String getCorreoE() {
		return correoE;
	}

	public void setCorreoE(String correoE) {
		
		if(Formato.formatoCorreoEvalido(correoE)){	
		
			this.correoE = correoE;
		}
	}

	public CorreoE(String correoE){
		super();
		this.correoE = correoE;
	}
	
	public CorreoE(CorreoE c){
		
		correoE = new String(c.correoE);
	}

}
