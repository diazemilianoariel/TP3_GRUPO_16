package ejercicio1;

public class Persona  implements Comparable<Persona>{
	
	private String apellido;
	private String nombre;
	private String dni; 
	
	
	public Persona() {
		
		
	}
	
	public Persona(String nombre,String apellido, String dni) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	public String toString() {
		return "Persona [apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + "]";
	}

	
	 	// Va a comparar y solo va a tomar los datos de aquellos registros que 
		// lleguen a tener el mismo apellido y nombre pero distinto dni.
		@Override
		public int compareTo(Persona otra) {
			boolean dniInvalido;
			try {
				dniInvalido = Dni.verificarDniInvalido(dni);
				
				if(dniInvalido) {
					
					// Comparamos por apellido si son iguales y los ordena de la A-Z
					int compararApellido = this.apellido.compareTo(otra.apellido);
					if (compararApellido != 0) 
						return compararApellido;
				    
					// Luego compara por DNI
					int compararDni = this.dni.compareTo(otra.dni);
				    if (compararDni != 0) 
				    	return compararDni;

				    // Y por ultimo comparamos por nombre
				    return this.nombre.compareTo(otra.nombre); 
				}
				
			} catch (DniInvalido e) {
				e.printStackTrace();
			}
			return -1; 
		}

}
