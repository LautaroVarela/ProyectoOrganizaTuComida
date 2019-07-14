package cliente;

public class USUARIO {
	
	String nombre;
	int edad;
	String email;
	String password;
	String biografia;
	CALENDARIO calendario;
	
	public USUARIO(String nom, int edad, String email, String password, String bio, CALENDARIO calendario){
		this.nombre=nom;
		this.edad=edad;
		this.email=email;
		this.password=password;
		this.biografia=bio;
		this.calendario = new CALENDARIO(calendario);
		}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public CALENDARIO getCalendario() {
		return calendario;
	}

	public void setCalendario(CALENDARIO calendario) {
		this.calendario = calendario;
	}


	public void agregarCalendario(CALENDARIO c) {
		this.calendario = c;
	
}
}

