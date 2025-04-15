package ejercicio1;

import java.io.IOException;

public class DniInvalido extends IOException {

	public DniInvalido() {
		
	}
	
	@Override
	public String getMessage() {
		return "El dni es invalido y no debe tener letras.";
	}
    
}
