package cliente;

public class COMIDA 
{
	
	String nombreDeComida;
	int horario;
	int calorias;
	int porciones;
	
	public COMIDA(String nombreDeComida, int horario, int calorias, int porciones) 
	{
		
		this.nombreDeComida = nombreDeComida;
		this.calorias = calorias;
		this.porciones = porciones;
		this.horario = horario;
	}


	public COMIDA() {
		// TODO Auto-generated constructor stub
	}


	public String getNombreDeComida() {
		return nombreDeComida;
	}
	public void setNombreDeComida(String nombreDeComida) {
		this.nombreDeComida = nombreDeComida;
	}
	
	
	
	public int getCalorias() {
		return calorias;
	}
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	
	
	
	public int getPorciones() {
		return porciones;
	}
	public void setPorciones(int porciones) {
		this.porciones = porciones;
	}
	
	
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	


}




