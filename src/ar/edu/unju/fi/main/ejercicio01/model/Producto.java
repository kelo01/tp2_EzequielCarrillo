package ar.edu.unju.fi.main.ejercicio01.model;

public class Producto {
	
	public enum OrigenFabricacion{
		ARGENTINA,CHINA,BRASIL, URUGUAY,}
	public enum Categoria{
		TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS,
	}
	private String codigo;
	private String descripcion;
	private double precioU;
	private OrigenFabricacion origenFabricacion  ;
	private Categoria  categoria;
	
	
	public Producto(String codigo, String descripcion, double precioU,OrigenFabricacion origenFabricacion , Categoria categoria) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioU = precioU;
		this.origenFabricacion = origenFabricacion;
		this.categoria= categoria;
	}
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precioU=" + precioU
				+ ", origenFabricacion=" + origenFabricacion + "]";
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioU() {
		return precioU;
	}
	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}
	
}
