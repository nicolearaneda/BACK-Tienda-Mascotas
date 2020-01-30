package araneda.nicole.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mascotas")
public class Mascota {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_m;
	@Column
	private String nombre;
        @Column
	private String tipo;
        @Column
	private String precio;
        @Column
	private String vendido;
        
	public int getId_m() {
		return id_m;
	}
	public void setId_m(int id_m) {
		this.id_m = id_m;
	}
        
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
        
        public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
        
        public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
        
        public String getVendido() {
		return vendido;
	}
	public void setVendido(String vendido) {
		this.vendido = vendido;
	}

}

