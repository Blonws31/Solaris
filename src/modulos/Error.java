package modulos;
import java.util.*;
	
public class Error extends Exception{
	//private static ArrayList<String> _mensajes=new ArrayList<String>();
	//introducir el codigo del error para su respectivo mensaje
	public Error(String msg)//int MsgCod)
	{		
		super(msg);//_mensajes.get(MsgCod));
	}
	/*public static void CrearMensajesDeError()
	{
		_mensajes.add("Error01: Campos del formulario vacios");
	}*/
	
	
}
