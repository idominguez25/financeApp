package com.example.Cuentas01.Controlador;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;
import com.example.Cuentas01.CuentasService.CuentasService;
import com.example.Cuentas01.Modelo.Gasto;

@RestController
@RequestMapping("/cuentas")
public class CuentasController {

	//Endpoint para mostrar todos los gastos
	@GetMapping(value="/gastos")
	public ArrayList<Gasto> listaGastos(){
		return CuentasService.listaGastos();
	}
	
	//Método para buscar un gasto en concreto
//	@GetMapping("/gastos/{name}")
//	public Gasto findByName(@PathVariable("name") String name) {
//		return CuentasService.buscarPorNombre(name);
//	}
	
	//Endpoint para añadir un nuevo gasto
	@PostMapping("/añadir")
	public static Gasto añadirGasto(@RequestBody Gasto nuevoGasto) {
		return CuentasService.añadirGasto(nuevoGasto);
	}
	
	//Endpoint para modificar un gasto
	@PutMapping("/gastos/{nombre}")
	public static void modificarGasto(@PathVariable String nombre, @RequestBody double nuevaCantidad) {
		CuentasService.modificarGasto(nombre, nuevaCantidad);
	}
}
