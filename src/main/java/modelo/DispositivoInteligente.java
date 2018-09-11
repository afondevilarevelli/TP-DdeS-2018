package modelo;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dispInteligente" )
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class DispositivoInteligente extends Dispositivo {
@Id @GeneratedValue
@Column (name = "dispIntel_id")
private long id;
@Column(length = 20)
private String nombre;
@Embedded
private Estado estado;
@OneToMany @JoinColumn(name = "dispIntel_id")
private Fabricante fabricante;
private Double consumoMensual;


    public DispositivoInteligente(){}

	public DispositivoInteligente(String nom, boolean bajoConsumo, double kwh) {
		setNombre(nom);
		setBajoConsumo(bajoConsumo);
		setKwh(kwh);		
		estado = Estado.ENCENDIDO;
	}
	
	public boolean estaEncendido() {
		return estado == Estado.ENCENDIDO;
	}

	public boolean estaApagado() {
		return estado == Estado.APAGADO;
	}
	

	public float energiaEnLasUltimasHoras(Integer horas) {
		return fabricante.obtenerConsumoUltimasHoras(horas);
	}

	public void ponerseEnEstado(Estado e) {
		estado = e;
	}
	
	public void encender() {
		this.ponerseEnEstado(Estado.ENCENDIDO);
	}
	
	public void apagar() {
		this.ponerseEnEstado(Estado.APAGADO);
	}
	
	public void modoDeEnergia() {
		this.ponerseEnEstado(Estado.AHORROENERGIA);
	}
	
	@Override
	public double getConsumoMensual() {
		return consumoMensual;
	}

	public void setConsumoMensual(Double consumoMensual) {
		this.consumoMensual = consumoMensual;
	}
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
