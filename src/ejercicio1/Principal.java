package ejercicio1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
public class Principal {

	public static void main(String[] args) throws DniInvalido {
		
		// a partir de aca se estaría leyendo el archivo Personas.txt
		
		/*Leer el archivo llamado Personas.txt, que está compuesto por Nombre
		– Apellido – Dni y pasar los datos que se encuentran en el archivo a una
		lista que no acepte datos duplicados, que permita ordenar los datos
		según el Apellido desde la A – Z*/
		
		TreeSet<Persona> listaNoDuplicados = new TreeSet<Persona>();
		
		Archivo archivo = new Archivo();
		archivo.setRuta("src/Personas.txt");
		
		FileReader entrada;
		try {
			entrada = new FileReader(archivo.getRuta());
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			String linea = miBuffer.readLine();;
			while (linea != null) {
				
				String[] partes = linea.split("-");
					
				if (partes.length == 3) {
					String nombre = partes[0];
					String apellido = partes[1];
					String dni = partes[2];
					
					boolean dnivalido = Dni.verificarDniInvalido(dni);
					if(dnivalido) {
						Persona p = new Persona(nombre, apellido, dni);
						listaNoDuplicados.add(p);
					}
				}
				linea = miBuffer.readLine();
			}
			miBuffer.close();
			entrada.close();

		} 
		catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
		
		Archivo nuevoArchivo = new Archivo("Resultado.txt");
		nuevoArchivo.creaArchivo();
		
		for (Persona persona : listaNoDuplicados) {
			System.out.println(persona.getNombre() + " " + persona.getApellido() + " " + persona.getDni());
			nuevoArchivo.escribe_letra_x_letra(persona.getNombre() + " " + persona.getApellido() + " " + persona.getDni() + "\n");
		}
	}
}
