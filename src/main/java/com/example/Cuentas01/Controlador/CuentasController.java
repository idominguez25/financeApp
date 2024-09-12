package com.example.Cuentas01.Controlador;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;
import com.example.Cuentas01.CuentasService.CuentasService;
import com.example.Cuentas01.Modelo.Gasto;

@RestController
@RequestMapping("/cuentas/gastos")
public class CuentasController {
	@CrossOrigin(origins = "http://localhost:4200")
	//Endpoint para mostrar todos los gastos
	@GetMapping("/verTodo")
	public ArrayList<Gasto> listaGastos(){
		return CuentasService.listaGastos();
	}
	
	//Método para buscar un gasto en concreto
	@GetMapping("/buscar")
	public Gasto findByName(@RequestParam String nombre) {
		return CuentasService.buscarPorNombre(nombre);
	}
	
	//Endpoint para añadir un nuevo gasto
	@PostMapping("/añadir")
	public static Gasto añadirGasto(@RequestBody Gasto nuevoGasto) {
		return CuentasService.añadirGasto(nuevoGasto);
	}
	
	//Endpoint para modificar un gasto
	@PutMapping("/modificar")
	public static Gasto modificarGasto(@RequestParam String nombre, @RequestBody Gasto gastoModificado) {
		return CuentasService.modificarGasto(nombre, gastoModificado);
	}
	
	//Endpoint para eliminar un gasto
	@DeleteMapping("/eliminar")
	public static void eliminarGasto(@RequestParam String nombre) {
		CuentasService.eliminarGasto(nombre);
	}
	
	//Enpoint para mostrar el dinero restante
	@GetMapping("/dineroRestante")
	public static double dineroRestante(@RequestParam double sueldo) {
		return CuentasService.dineroRestante(sueldo);
	}
	
	//Enpoint para mostrar la suma de los gastos
	@GetMapping("/sumaGastos")
	public static double sumaGastos() {
		return CuentasService.sumaGastos();
	}
	
	//Enpoint para mostrar el 30% de margen (caprichos)
	@GetMapping("/margen")
	public static double dineroCaprichos(double sueldo) {
		return CuentasService.dineroCaprichos(sueldo);
	}
	
	//Enpoint para mostrar el total de ahorro
	@GetMapping("/ahorro")
	public static double ahorro(double sueldo) {
		return CuentasService.ahorro(sueldo);
	}
}
