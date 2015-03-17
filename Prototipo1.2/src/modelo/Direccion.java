package modelo;

public class Direccion {
	

	
	@Override
	public String toString() {
		return "Calle:" + via + ", Codigo postal: " + codigopostal
				+ ", Número: " + numero + ", Poblacion: " + poblacion + ", Pais: "
				+ pais;
	}
	private String via;	
	private String codigopostal;
	private String numero;
	private String poblacion;
	private String pais;
	
	//constructor por defecto
	public Direccion(){
		this("","","","","");
	}
	
	//Constructor
	public Direccion(String via, String codigopostal, String numero,
			String poblacion, String pais) {
		super();
		this.via = via;
		this.codigopostal = codigopostal;
		this.numero = numero;
		this.poblacion = poblacion;
		this.pais = pais;
	}
	//Contructor copia
	public Direccion(Direccion d) {
		
		codigopostal = new String(d.codigopostal);
		via = new String(d.via);
		numero = new String(d.numero);
		poblacion = new String(d.poblacion);
		pais = new String(d.pais);
	
	}
	
	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getCodigopostal() {
		return codigopostal;
	}

	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
