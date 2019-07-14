package cliente;

public class DIADECOMIDAS
{
	COMIDA[] comidasDiarias;
	

	public DIADECOMIDAS(COMIDA[] comidasDiarias) {
		
		this.comidasDiarias = new COMIDA[6];
	}


	/**
	 * @return the comidasDiarias
	 */
	public COMIDA[] getComidasDiarias() {
		return comidasDiarias;
	}
	public void setComidasDiarias(COMIDA[] comidasDiarias) {
		this.comidasDiarias = comidasDiarias;
	}
	
	
	
}
