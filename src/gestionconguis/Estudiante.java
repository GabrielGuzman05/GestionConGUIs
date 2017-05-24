package gestionconguis;

public class Estudiante extends Persona {

	private String carrera;
	private String añoIngreso;

    public Estudiante(String carrera, String añoIngreso, String nombre, String apellido, String rut) {
        super(nombre, apellido, rut);
        this.carrera = carrera;
        this.añoIngreso = añoIngreso;
    }

        

	public String getCarrera() {
		return this.carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getAñoIngreso() {
		return this.añoIngreso;
	}

	public void setAñoIngreso(String añoIngreso) {
		this.añoIngreso = añoIngreso;
	}
}