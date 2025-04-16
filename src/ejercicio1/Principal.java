package ejercicio1;


import java.util.ArrayList;
import java.util.List;
public class Principal {

	public static void main(String[] args) {
		
		// a partir de aca se estaría leyendo el archivo Personas.txt
		
		/*Leer el archivo llamado Personas.txt, que está compuesto por Nombre
		– Apellido – Dni y pasar los datos que se encuentran en el archivo a una
		lista que no acepte datos duplicados, que permita ordenar los datos
		según el Apellido desde la A – Z*/
		
		
		Archivo archivo = new Archivo();
		
		archivo.setRuta("src/Personas.txt");
		
		
		archivo.lee_letra_x_letra();
		
		List<Persona> listaPersonas = new ArrayList<>();
		
		
		
		
		
		
	

	}

	

}
