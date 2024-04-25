package ar.edu.unju.fi.main.ejercicio01.main;
import ar.edu.unju.fi.main.ejercicio01.model.*;
import ar.edu.unju.fi.main.ejercicio01.model.Producto.Categoria;
import ar.edu.unju.fi.main.ejercicio01.model.Producto.OrigenFabricacion;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Producto> listado = new ArrayList<Producto>();
		Producto prod01=new Producto("p01","caracteristica p01",23,OrigenFabricacion.BRASIL,Categoria.INFORMATICA);
		System.out.println(prod01.toString());
		

	}

}
