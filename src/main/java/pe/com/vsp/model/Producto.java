package pe.com.vsp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="producto")
public class Producto {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	Integer id_Producto;
	
	
	@NotNull
	@Size(min = 3, message = "nombre de producto es minimo 3")
	@Column(name = "nombre",nullable = false,length = 70)
	String nombre;
	
	
	@NotNull
	@Size(min = 3, message = "marca es minimo 3")
	@Column(name = "marca",nullable = false,length = 70)
	String marca;


	public Integer getId_Producto() {
		return id_Producto;
	}


	public void setId_Producto(Integer id_Producto) {
		this.id_Producto = id_Producto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
}
