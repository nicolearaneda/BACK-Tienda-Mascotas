package araneda.nicole.Model;

//import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_u;
	@Column
	private String nombre;
        @Column
	private String apellidos;
        @Column
	private String telefono;
        @Column
	private String username;
        @Column
	private String password;
      	@Column
	private int rol;
        
        
	public int getId_u() {
		return id_u;
	}
	public void setId_u(int id_u) {
		this.id_u = id_u;
	}
        
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
        
        public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
        
        public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
        
        public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
        
        public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
        
        public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
		this.rol = rol;
	}

}
