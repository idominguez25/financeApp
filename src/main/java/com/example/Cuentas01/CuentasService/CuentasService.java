package com.example.Cuentas01.CuentasService;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.example.Cuentas01.Modelo.Gasto;

@Service
public class CuentasService {
	//Creamos la variable con los gastos predefinidos
	private static final ArrayList<Gasto> gastos = new ArrayList<Gasto>() {{
	
		add(new Gasto(24, "Internet"));
		add(new Gasto(334, "Coche"));
		add(new Gasto(461, "Alquiler"));
		add(new Gasto(45, "Gym"));
		add(new Gasto(3, "Spotify"));
		add(new Gasto(10, "Anillo"));
		add(new Gasto(50, "Gasolina"));
		add(new Gasto(200, "Comida"));
		add(new Gasto(6, "Netflix"));
		
	}};
	
	//Creamos la variable para guardar los resultados
	

	//Método para listar todos los gastos
	public static ArrayList<Gasto> listaGastos(){
		return gastos;
	}
	
	//Método para buscar un gasto en concreto
	public static Gasto buscarPorNombre(String name) {
		for(Gasto gasto: gastos) {
			if(gasto.getdescripcion().equalsIgnoreCase(name)) {
				return gasto;
			}
		}
		return null;
		//return gastos.stream().filter(gastos -> gastos.getdescripcion().equalsIgnoreCase(name)).findFirst().orElse(null);
	}
	
	//Método para añadir un nuevo gasto
	public static Gasto añadirGasto(Gasto nuevoGasto) {
		gastos.add(nuevoGasto);
		return nuevoGasto;
		
	}

	//Método para modificar un gasto
	public static Gasto modificarGasto(String nombre, Gasto gastoModificado) {
		Gasto gastoEncontrado = buscarPorNombre(nombre);
		if(gastoEncontrado != null) {
			gastoEncontrado.setdescripcion(gastoModificado.getdescripcion());
			gastoEncontrado.setCantidad(gastoModificado.getCantidad());
		}
		return gastoEncontrado;
	}

	//Método para eliminar un gasto
	public static void eliminarGasto(String nombre) {
		Gasto gastoEncontrado = buscarPorNombre(nombre);
			if (gastoEncontrado != null) {
				gastos.remove(gastoEncontrado);
			}
		}
	
	//Método para restar obtener el dinero restante
	public static double dineroRestante(double sueldo) {
		
		return sueldo - sumaGastos();
	}

	//Método para sumar gastos
	public static double sumaGastos(){
		double totalGastos = 0;
		
		for(Gasto gasto : gastos) {
		    totalGastos += gasto.getCantidad();
		}
		
		return totalGastos;
	}
	
	//Método para calcular el 30% de margen (caprichos)
	public static double dineroCaprichos(double sueldo) {
		return (dineroRestante(sueldo) * 30) / 100;
		
	}
		
	//Método para calcular el total de ahorro
	public static double ahorro(double sueldo) {
		return dineroRestante(sueldo) - dineroCaprichos(sueldo);
		
	}
	}

