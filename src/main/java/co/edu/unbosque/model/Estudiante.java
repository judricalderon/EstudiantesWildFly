package co.edu.unbosque.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiante {
	@Id
	@Column(name="cedula_estudiante")
	private String cedula;
	@Column(name="nombre_estudiante")
	private String nombre;
	@Column(name="apellido_estudiante")
	private String apellido;
	@Column(name="programa_estudiante")
	private String programa;
	@Column(name="creado_por")
	private String creado_por ;

public Estudiante(String nombre, String cedula, String apellido, String programa, String creado_por) {
	this.cedula = cedula;
	this.nombre = nombre;
	this.apellido = apellido;
	this.programa = programa;
	this.creado_por = creado_por;

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

public String getApellido() {return apellido;}

	public void setApellido(String apellido) {this.apellido = apellido;}

	public String getCreado_por() {	return creado_por;}

	public void setCreado_por(String creado_por) {this.creado_por = creado_por;	}
}
