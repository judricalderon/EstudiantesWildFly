package co.edu.unbosque.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "djestudiantes")
public class Estudiante {
	@Id
	@Column(name="cedula_estudiante")
	private String cedula;
	@Column(name="nombre_estudiante")
	private String nombre;
	@Column(name="programa_estudiante")
	private String programa;
	@Column(name="correo_estudiante")
	private String correo;
	@Column(name="fecha_ingreso")
	private String fechaIngreso;

public Estudiante(String nombre, String cedula, String programa, String correo, String fechaIngreso) {
	
	this.nombre = nombre;
	this.cedula = cedula;
	this.programa = programa;
	this.correo = correo;
	this.fechaIngreso = fechaIngreso;
}

	public Estudiante() {

	}

	public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
	this.cedula = cedula;
}

public String getPrograma() {
	return programa;
}

public void setPrograma(String programa) {
	this.programa = programa;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public String getFechaIngreso() {
	return fechaIngreso;
}

public void setFechaIngreso(String fechaIngreso) {
	this.fechaIngreso = fechaIngreso;
}


}
