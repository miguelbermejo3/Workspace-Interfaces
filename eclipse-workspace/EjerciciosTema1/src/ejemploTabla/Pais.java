package ejemploTabla;

public class Pais {

	private String codigo;
	private String nombre;
	private Integer poblacion;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(Integer poblacion) {
		this.poblacion = poblacion;
	}
	@Override
	public String toString() {
		return "Pais [codigo=" + codigo + ", nombre=" + nombre + ", poblacion=" + poblacion + "]";
	}
	
	
}
