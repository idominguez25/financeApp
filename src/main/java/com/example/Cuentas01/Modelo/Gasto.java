package com.example.Cuentas01.Modelo;


public class Gasto {
	//Variables
	double cantidad;
	String descripcion;
	
	//Constructor
	public Gasto(double x, String d) {
		//Asignamos los parámetos al objeto
		this.cantidad = x;
		this.descripcion = d;
	}

	
	//Getters y Setters
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String getdescripcion() {
		return descripcion;
	}
	public void setdescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Gasto [cantidad=" + cantidad + ", descripcion=" + descripcion + "]";
	}
	
	
	

}
