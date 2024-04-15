package co.edu.unbosque.model;

public class EstudianteDto {

	private String nombre,apellido,cedula,programa, creadoPor;

	public EstudianteDto(String nombre, String cedula, String apellido, String programa, String creadoPor) {
		
		this.nombre = nombre;
		this.cedula = cedula;
		this.programa = programa;
		this.apellido = apellido;
		this.creadoPor = creadoPor;
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

	public String getCreadoPor() {	return creadoPor;}

	public void setCreadoPor(String creadoPor) {this.creadoPor = creadoPor;	}

	@Override
	public String toString() {
		return "EstudianteDto{" +
				"nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				", cedula='" + cedula + '\'' +
				", programa='" + programa + '\'' +
				", creadoPor='" + creadoPor + '\'' +
				'}';
	}
}