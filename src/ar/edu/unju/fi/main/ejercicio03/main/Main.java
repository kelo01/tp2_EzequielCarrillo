package ar.edu.unju.fi.main.ejercicio03.main;
import ar.edu.unju.fi.main.ejercicio03.constantes.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Provincia[] provincias = Provincia.values();
        
        for (Provincia provincia : provincias) {
            System.out.println("Provincia: " + provincia);
            System.out.println("Cantidad de población: " + provincia.getCantidadPoblacion());
            System.out.println("Superficie: " + provincia.getSuperficie() + " km^2");
            System.out.println("Densidad de Poblacion : " + provincia.calcularDensidadPoblacional() + " habitantes/km^2");
            System.out.println();
        }

	}

}
