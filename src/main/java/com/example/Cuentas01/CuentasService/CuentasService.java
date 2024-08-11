package com.example.Cuentas01.CuentasService;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Cuentas01.Modelo.Gasto;

@Service
public class CuentasService {
	//Creamos la variable con los gastos predefinidos
		private static final ArrayList<Gasto> gastos = new ArrayList<Gasto>() {{
		
			add(new Gasto(24, "internet"));
			add(new Gasto(334, "coche"));
			add(new Gasto(461, "alquiler"));
			add(new Gasto(45, "gym"));
			add(new Gasto(3, "Spotify"));
			add(new Gasto(10, "anillo"));
			add(new Gasto(50, "gasolina"));
			add(new Gasto(200, "comida"));
			add(new Gasto(6, "Netflix"));
			
	}};

	//Método para listar todos los gastos
	public static ArrayList<Gasto> listaGastos(){
		return gastos;
	}
	
	//Método para buscar un gasto en concreto
	//public static Gasto buscarPorNombre(@PathVariable("name") String name) {
		//return gastos.stream().filter(gastos -> gastos.getdescripcion().equals(name)).findFirst().orElse(null);
	//}
	
	//Método para añadir un nuevo gasto
	public static Gasto añadirGasto(Gasto nuevoGasto) {
		gastos.add(nuevoGasto);
		return nuevoGasto;
		
	}

	//Método para modificar un gasto
	public static void modificarGasto(String nombre, Gasto gastoModificado) {
		for(Gasto gasto : gastos) {
			if(gasto.getdescripcion().equalsIgnoreCase(nombre)) {
				gasto.setCantidad(gastoModificado.getCantidad());
	}
		}
	}
	
}
