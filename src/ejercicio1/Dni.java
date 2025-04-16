package ejercicio1;

public class Dni {
	public Dni()
	{
	}

	public static boolean verificarDniInvalido(String dni) throws DniInvalido {
		if(dni.matches("\\d+")) {
			return true;
		}
		else {
			return false; 
		}
	}

}
