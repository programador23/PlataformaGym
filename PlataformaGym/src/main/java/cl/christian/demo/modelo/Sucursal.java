package cl.christian.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "sucursal")
public class Sucursal {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String region;
	private String comuna;
	private String direccion;
	private String horario;
	
	
	public Sucursal(int id, String nombre, String region, String comuna, String direccion, String horario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.region = region;
		this.comuna = comuna;
		this.direccion = direccion;
		this.horario = horario;
	}
	public Sucursal() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}

	
}
