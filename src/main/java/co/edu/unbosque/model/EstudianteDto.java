package co.edu.unbosque.model;

public class EstudianteDto {

	private String nombre,cedula,programa,correo,fechaIngreso;

	public EstudianteDto(String nombre, String cedula, String programa, String correo, String fechaIngreso) {
		
		this.nombre = nombre;
		this.cedula = cedula;
		this.programa = programa;
		this.correo = correo;
		this.fechaIngreso = fechaIngreso;
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