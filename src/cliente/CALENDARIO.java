package cliente;

public class CALENDARIO 
{
	
	DIADECOMIDAS[] semanaDeComida;
	
	public CALENDARIO(CALENDARIO semanaDeComidas)
	{
		
		this.semanaDeComida = new DIADECOMIDAS[7];
		
	}

	/**
	 * @return the semanaDeComida
	 */
	public DIADECOMIDAS[] getSemanaDeComida() {
		return semanaDeComida;
	}

	/**
	 * @param semanaDeComida the semanaDeComida to set
	 */
	public void setSemanaDeComida(DIADECOMIDAS[] semanaDeComida) {
		this.semanaDeComida = semanaDeComida;
	}

	//metodo acceder al dia, con un click se muestra la primer comida
}
