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
@Table(name="persona")
public class Persona {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	Integer id_persona;
	
	
	@NotNull
	@Size(min = 3, message = "nombres es minimo 3")
	@Column(name = "nombres",nullable = false,length = 70)
	String nombres;
	
	
	@NotNull
	@Size(min = 3, message = "apellidos es minimo 3")
	@Column(name = "apellidos",nullable = false,length = 70)
	String apellidos;


	public Integer getId_persona() {
		return id_persona;
	}


	public void setId_persona(Integer id_persona) {
		this.id_persona = id_persona;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
	
}
