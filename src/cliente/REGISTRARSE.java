package cliente;
import java.util.ArrayList;

import datos.DATOS;


public class REGISTRARSE 
{
    DATOS datos;
	public String nombre;
	public int edad;
	public String biografia;
	public CALENDARIO calendario;
	public String password;
	public String email;

       //lista de usuarios como atributo
       
       
       public REGISTRARSE()
       {
    	   this.datos=new DATOS();
       }
       
       
       public void registrar() {
    	   USUARIO u = new USUARIO(nombre, edad, email, password, biografia, calendario);
    	   datos.registrar(u);
       }
       
       public ArrayList<USUARIO> getUsuarios()
       {
    	   return datos.getUsuarios();
       }
       
       
       
       
       public String getEmails()
       {
    	   String e="";
    	   for (int i = 0; i<datos.emails().size(); i++)
    	   {
    		   e = e + " --- " + datos.emails().get(i);
    	   }
    	   return e;
       }
       
       
       public String getPassword()
       {
    	   String c="";
    	   for (int i = 0; i<datos.contrasenias().size(); i++)
    	   {
    		   c = c + " --- " + datos.contrasenias().get(i);
    	   }
    	   return c;
       }
       
       
       public String getEdad()
       {
    	   String d="";
    	   for(int i=0; i<datos.edades().size(); i++)
    	   {
    		   d = d + " --- " + datos.edades().get(i);
    	   }
    	   return d;
       }
       
       
       public String getBiografia()
       {
    	   String b = "";
    	   for(int i=0; i<datos.biografias().size(); i++) 
    	   {
    		    b = b + " --- " + datos.biografias().get(i);
    	   }
    	   return b;
       }
       
       
       
       
}


