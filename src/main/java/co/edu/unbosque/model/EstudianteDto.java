package co.edu.unbosque.model;

public class EstudianteDto {

	private String nombre,apellido,cedula,programa,fechaIngreso,creado_por;

	public EstudianteDto(String nombre, String cedula, String apellido, String programa, String creado_por) {
		
		this.nombre = nombre;
		this.cedula = cedula;
		this.programa = programa;
		this.apellido = apellido;
		this.creado_por = creado_por;
	}
	public EstudianteDto() {
		
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

	public void setApellido(String apellido) {this.apellido = apellido;	}

	public String getCreado_por() {	return creado_por;}

	public void setCreado_por(String creado_por) {this.creado_por = creado_por;	}




	
	
	
	
}