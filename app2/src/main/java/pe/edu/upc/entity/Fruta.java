package pe.edu.upc.entity;

public class Fruta {
	
	/*atributos de instancia porque sus valores van a cambiar depende de su valor*/
	private String nombre;
	private String color;
	private String sabor;
	private boolean puedoHacerJugo;
	
	/*Atributos de clase cuyo valor no depende del objeto*/
	public static String LugarOrigen = "UPC";

	/*constructor sobre carga -- reserva espacio en la memoria*/
	public Fruta(){
		this.nombre = "Indefinido";/*varios metedoso con un mismo nobmre pero se diferencia con una sobrecarga*/
		this.color = "S/C";
		this.sabor = "S/C";
		this.puedoHacerJugo = false;
	}
	
	
	public Fruta(String nombre, String color, String sabor) {
		super();/**/
		this.nombre = nombre;/*el this hereda el constructor de la clase Padre*/
		this.color = color;
		this.sabor = sabor;
		this.puedoHacerJugo = false;
	}

    /*Metodos de acceso a datos (get y set)*/
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public boolean isPuedoHacerJugo() {
		return puedoHacerJugo;
	}


	public void setPuedoHacerJugo(boolean puedoHacerJugo) {
		this.puedoHacerJugo = puedoHacerJugo;
	}

    /*Sobreescritura de metodso heredados*/
	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", color=" + color + ", sabor=" + sabor + ", puedoHacerJugo="
				+ puedoHacerJugo + "]";
	}
	
	

}

