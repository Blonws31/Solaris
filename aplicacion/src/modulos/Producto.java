package modulos;
import java.util.*;

public class Producto {
	private String _nombre,_codigo;
	private String _pc2,_pv2;
	private static int _cont=0;
	private double _pc,_pv;
	public Producto(String codigo,String nombre,String pc,String pv)
	{
		this._codigo=codigo;
		this._nombre=nombre;
		this._pc2=pc;
		this._codigo=codigo;
		this._pv2=pv;		
		
	}
	public Producto(String codigo,String nombre,double pc,double pv)
	{	
		this._codigo=codigo;
		this._nombre=nombre;
		this._pc=pc;
		this._codigo=codigo;
		this._pv=pv;
	}
	public Producto(String nombre,double pc,double pv)
	{	
		this._nombre=nombre;
		this._pc=pc;
		this._codigo=GenerarCodigo();
		this._pv=pv;
	}
	//generar el codigo del producto
	public static String GenerarCodigo()
	{
		_cont++;
		return "PROD"+_cont;
				
	}
	public static String getUltimoCodigo()
	{
		return "PROD"+_cont;	
	}
	
	//obtener todos los atributos de productos en un vector
	public Vector<String> getProducto()
	{
		Vector<String> Prod= new Vector<String>();
		Prod.add(this._codigo);
		Prod.add(this._nombre);
		Prod.add(""+this._pc2);
		Prod.add(""+this._pv2);		
		return Prod;		
	}
	
	public String toString()
	{
		
		return "Codigo: "+this._codigo+" Nombre: "+this._nombre+" PC: "+this._pc+" PV: "+this._pv;
	}
	
}
