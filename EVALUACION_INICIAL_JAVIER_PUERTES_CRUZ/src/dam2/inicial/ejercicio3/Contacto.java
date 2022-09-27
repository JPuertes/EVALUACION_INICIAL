package dam2.inicial.ejercicio3;

public class Contacto {
	
	private String nombre;
	private String apellido;
	private int numero;
	
	
	public Contacto(){
		
	}
	
	public Contacto(String nombre, String apellido, int numero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return " Nombre=" + nombre + ", Apellido=" + apellido + ", Numero=" + numero + "\n";
	}

	
	
	
}
