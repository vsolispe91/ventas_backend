package pe.com.vsp.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "venta")
public class Venta {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id_venta;
	
	@Column(name = "fecha",nullable = false)
	private LocalDateTime fecha;  
	
	@ManyToOne
	@JoinColumn(name="id_persona",nullable=false,foreignKey=@ForeignKey(name="FK_venta_persona"))
	private Persona persona;

	@Column(name = "importe",nullable = false)
	private Double importe;  
    
	
}
