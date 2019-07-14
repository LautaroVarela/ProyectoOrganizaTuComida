package datos;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import cliente.CALENDARIO;
import cliente.COMIDA;
import cliente.DIADECOMIDAS;
import cliente.USUARIO;

public class JSON {
	
	String archivoJson;
    
	public JSON(String ruta) {
		archivoJson = ruta;
	}

	public void setRuta(String archivo) {
		archivoJson = archivo;
	}

	public String nombreDeArchivo() {
		return archivoJson;
	}

	
	
	
	@SuppressWarnings({ "unchecked", "unused" })
	public void guardarUsuarios ( ArrayList<USUARIO> usuario) {
		
		JSONArray listaJsonUser = new JSONArray();
		JSONParser parser = new JSONParser();
		
	
		for (int i = 0; i < usuario.size(); i++) 
		{
			
			JSONObject objetoUsuario = new JSONObject();
			
			objetoUsuario.put("Nombre: ", usuario.get(i).getNombre());
			objetoUsuario.put("E-Mail: ", usuario.get(i).getEmail());
			objetoUsuario.put("Contraseña:", usuario.get(i).getPassword());
			objetoUsuario.put("Edad: ", usuario.get(i).getEdad());
			objetoUsuario.put("Biografía: ", usuario.get(i).getBiografia());
			objetoUsuario.put("Semana: ", usuario.get(i).getCalendario());
			
			
			
			JSONArray listaJsonOf = new JSONArray();
			
			listaJsonOf.add(objetoUsuario);
			listaJsonUser.add(listaJsonOf);
			
		}

		try {
			FileWriter file = new FileWriter(archivoJson);
			file.write(listaJsonUser.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {}


	}
	
	@SuppressWarnings({ "unchecked", "unused" })
	public void guardarComidas (ArrayList<COMIDA> comidas)
	{
		JSONArray listaJsonComida = new JSONArray();
		JSONParser parserC = new JSONParser();
		
		for (int i = 0 ; i < comidas.size() ; i++)
		{
			JSONObject objetoComidas = new JSONObject();
			
			objetoComidas.put("Título de comida: ", comidas.get(i).getNombreDeComida());
			objetoComidas.put("Hora: ", comidas.get(i).getHorario());
			objetoComidas.put("Calorías: ", comidas.get(i).getCalorias());
			objetoComidas.put("Porciones: ", comidas.get(i).getPorciones());
			
			JSONArray listaJsonOf = new JSONArray();
			
			listaJsonOf.add(objetoComidas);
			listaJsonComida.add(listaJsonOf);
		}
		try {
			FileWriter file = new FileWriter(archivoJson);
			file.write(listaJsonComida.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {}


	}
	@SuppressWarnings({ "unused", "unchecked" })
	public void guardarDiaComidas (ArrayList<DIADECOMIDAS> comidasdiarias)
	{
		JSONArray listaJsonDiaComidas = new JSONArray();
		JSONParser parserD = new JSONParser();
		
		for (int i = 0 ; i < comidasdiarias.size() ; i++)
		{
			JSONObject objetoDiaComidas = new JSONObject();
			
			objetoDiaComidas.put("Comidas diarias: ", comidasdiarias.get(i).getComidasDiarias());
			
			JSONArray listaJsonOf = new JSONArray();
			
			listaJsonOf.add(objetoDiaComidas);
			listaJsonDiaComidas.add(listaJsonOf);
		}
		try {
			FileWriter file = new FileWriter(archivoJson);
			file.write(listaJsonDiaComidas.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {}


	}
	 @SuppressWarnings({ "unchecked", "unused" })
	public void guardarCalendario (ArrayList <CALENDARIO> semanaDeComida)
	   {
		   JSONArray listaJsonCalendarios = new JSONArray();
		   JSONParser parserR = new JSONParser();
		   
		   for (int i = 0 ; i < semanaDeComida.size(); i++)
			   {
			       JSONObject objetoSemana = new JSONObject();
			       objetoSemana.put("Semana: ", semanaDeComida.get(i).getSemanaDeComida());
			      
			       JSONArray listaJsonOf = new JSONArray();
			       listaJsonOf.add(objetoSemana);
			       listaJsonCalendarios.add(listaJsonOf);
			   }
		   try {
				FileWriter file = new FileWriter(archivoJson);
				file.write(listaJsonCalendarios.toJSONString());
				file.flush();
				file.close();

			} catch (IOException e) {}
			   
	   }

		



@SuppressWarnings("unused")
	public ArrayList <USUARIO> cargarUsuarios()
	{
		JSONParser parser = new JSONParser();
		ArrayList<USUARIO> usuarios = new ArrayList<USUARIO>();

		try {
			
		Object obj = parser.parse(new FileReader(archivoJson));
		JSONArray listaJson = (JSONArray) obj;
		
		for (int i = 0; i < listaJson.size(); i++) {
			
			JSONArray listaJson1 = (JSONArray) listaJson.get(i);
			JSONObject USUARIO = (JSONObject) listaJson1.get(0);
			
			String nombre = (String) USUARIO.get("Nombre: ");
			String email = (String) USUARIO.get("E-Mail: ");
			String password = (String) USUARIO.get("Contraseña: ");
			int edad = (int) USUARIO.get("Edad: ");
			String biografia = (String) USUARIO.get("Biografia: ");
			CALENDARIO calendario = (CALENDARIO) USUARIO.get("Semana: ");
			
			
			USUARIO user = new USUARIO (nombre, edad, email, password, biografia, calendario);

			usuarios.add(user);
			
			
		}
		
		
	}
		
	catch (FileNotFoundException e) {} 
	catch (IOException e) {} 
	catch (ParseException e) {}
		
		
	return usuarios;
    }

public ArrayList <COMIDA> cargarComidas() 
{
       JSONParser parser = new JSONParser();
       ArrayList<COMIDA> comidas = new ArrayList<COMIDA>();
       
       try {
    	   Object obj = parser.parse(new FileReader(archivoJson)); 
    	   JSONArray listaJsonComida = (JSONArray) obj;
    	   
    	   for (int i = 0; i < comidas.size(); i++) {
    		   
    		   JSONArray listaJson2 = (JSONArray) listaJsonComida.get(i);
    		   JSONObject COMIDA = (JSONObject) listaJson2.get(0);
    		   
    		   String nombreDeComida = (String) COMIDA.get("Título de comida: ");
    		   int horario = (int) COMIDA.get("Hora: ");
    		   int calorias = (int) COMIDA.get("Calorias: ");
    		   int porciones = (int) COMIDA.get("Porciones: ");
    		   
    		   COMIDA com = new COMIDA (nombreDeComida, horario, calorias, porciones);
    		   comidas.add(com);
    		   
    		   
    	   }
       }
       
    	   
    		catch (FileNotFoundException e) {} 
    		catch (IOException e) {} 
    		catch (ParseException e) {}
    			
    			
    		return comidas;
    	    }
    	   
       
    	   public ArrayList  <DIADECOMIDAS> cargarDiaComidas() 
    	{
    	       JSONParser parser = new JSONParser();
    	       ArrayList<DIADECOMIDAS> comidas = new ArrayList<DIADECOMIDAS>();
    	       
    	       try {
    	    	   Object obj = parser.parse(new FileReader(archivoJson)); 
    	    	   JSONArray listaJsonDiaComida = (JSONArray) obj;
    	    	   
    	    	   for (int i = 0; i < comidas.size(); i++) {
    	    		   
    	    		   JSONArray listaJson3 = (JSONArray) listaJsonDiaComida.get(i);
    	    		   JSONObject DIADECOMIDAS = (JSONObject) listaJson3.get(0);
    	    		   
    	    		   COMIDA[] comidasDiarias = (COMIDA[]) DIADECOMIDAS.get("Comidas diarias: ");
    	    		   
    	    		   DIADECOMIDAS comidasD = new DIADECOMIDAS (comidasDiarias);
    	    		   comidas.add(comidasD);
    	    		   
    	    		   
    	    	   
    	    	   }
    	    	   }
    	    	   
catch (FileNotFoundException e) {} 
catch (IOException e) {} 
catch (ParseException e) {}
    	    	    			
    	    	    			
    	    	    		return comidas;
    	    	    	    }

	  
	   public ArrayList <CALENDARIO> cargarCalendarios()
	   {
		   JSONParser parser = new JSONParser();
		   ArrayList<CALENDARIO> semanaDeComida = new ArrayList<CALENDARIO>();
		   
		   try 
		   {
			Object obj = parser.parse(new FileReader(archivoJson));
			JSONArray listaJsonCalendarios = (JSONArray) obj;
			
			for (int i = 0; i < semanaDeComida.size(); i++)
			{
				JSONArray listaJson4 = (JSONArray) listaJsonCalendarios.get(i);
				JSONObject semana = (JSONObject) listaJson4.get(0);
				
				CALENDARIO semanaDeComidas = (CALENDARIO) semana.get("Semana: ");
				
				CALENDARIO semanaC = new CALENDARIO (semanaDeComidas);
				semanaDeComida.add(semanaC);
				
				
			}
		   }
	    	   
catch (FileNotFoundException e) {} 
catch (IOException e) {} 
catch (ParseException e) {}
    	    	    			
    	    	    			
    	    	    		return semanaDeComida;
    	    	    	    }
}
    	       
	 	
