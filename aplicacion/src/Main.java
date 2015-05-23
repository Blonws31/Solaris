/*pasar por herencia los estilos*/
class Cliente{
			private String _nombre;
			public Cliente(String nombre)
			{
				this._nombre=nombre;
			}
			public String toString()
			{
				return this._nombre;
			}
		
	}
public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Object a=new Cliente("HOLA");
		
		System.out.println("HELLO SOLARIS!"+a);
		// TODO Auto-generated method stub
	}

}
