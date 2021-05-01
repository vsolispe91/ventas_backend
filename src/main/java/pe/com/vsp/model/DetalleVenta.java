package pe.com.vsp.model;

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
@Table(name = "detalleventa")
public class DetalleVenta {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer idDetalleVenta;
	
	@ManyToOne
	@JoinColumn(name="id_venta",nullable=false,foreignKey=@ForeignKey(name="FK_idventa_detalleventa"))
	private Venta id_venta;
	
	@ManyToOne
	@JoinColumn(name="id_producto",nullable=false,foreignKey=@ForeignKey(name="FK_idproducto_detalleventa"))
	private Producto id_producto;
	
	@Column(name = "cantidad",nullable = false)
	private Integer cantidad;  
	
}
