package dam2.evinicial.ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {

		String lineaerronea="Tomás Pérez CamposTomás Pérez Campos";
		
		String[] lineasinerror = lineaerronea.split(" ");
		
		if (lineasinerror.length==5) {
			
			System.out.println(lineasinerror[0] + " " + lineasinerror[1] + " " + lineasinerror[lineasinerror.length-1]);

		} else {
			
			System.out.println(lineasinerror[0] + " " + lineasinerror[1] + " " + lineasinerror[2] + " " + lineasinerror[lineasinerror.length-1]);

		}
				

}
}