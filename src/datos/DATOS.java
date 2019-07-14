package datos;
import cliente.USUARIO;

import java.util.ArrayList;





public class DATOS {
	ArrayList <USUARIO> usuario;
	JSON json;


public DATOS() 
{
	json = new JSON("Base de datos.json");
	usuario = (ArrayList<USUARIO>) json.cargarUsuarios();
	
}
public void registrar(USUARIO u) 
{
	usuario.add(u);
	//System.out.println(nombres.toString());
	json.guardarUsuarios(usuario);
}


public ArrayList <String> nombres() {
	ArrayList <String> n = new ArrayList<String>();
	for (int i = 0; i < usuario.size(); i++)
	{
		n.add(usuario.get(i).getNombre());
	}
	return n;
}

public ArrayList <String> emails() {
	ArrayList <String> m = new ArrayList<String>();
	for (int i = 0; i < usuario.size(); i++) 
	{
		m.add(usuario.get(i).getEmail());
	}
	return m;
}

public ArrayList <String> contrasenias() 
{
	ArrayList<String> c = new ArrayList<String>();
	for (int i = 0; i < usuario.size(); i++) 
	{
		c.add(usuario.get(i).getPassword());
	}
	return c;
}

public ArrayList <Integer> edades()
{
	ArrayList<Integer> e = new ArrayList<Integer>();
	for (int i = 0; i<usuario.size(); i++)
	{
		e.add(usuario.get(i).getEdad());
	}
	return e;
	}

public ArrayList <String> biografias()
{
	ArrayList<String> b = new ArrayList<String>();
	for (int i = 0; i<usuario.size(); i++)
	{
		b.add(usuario.get(i).getBiografia());
	}
	return b;
}

public ArrayList <USUARIO> getUsuarios() {
	return this.usuario;
}


public void borrarCuenta(int i) 
{
	usuario.remove(i);
}

}


