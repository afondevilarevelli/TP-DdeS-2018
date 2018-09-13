package modelo;

import common.Tuple;

import java.util.ArrayList;
import java.util.List;

public class ZonaGeografica {
    public String nombre;
    public List<Transformador> transformadores = new ArrayList<Transformador>();
    public Double radioAbarcativo = 10D;


    public double getConsumoTotal() {
        return transformadores.stream().mapToDouble(t -> t.energiaQueEstaConsumiendo()).sum();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Transformador> getTransformadores() {
        return transformadores;
    }

    public void setTransformadores(List<Transformador> transformadores) {
        this.transformadores = transformadores;
    }



    public Double getRadioAbarcativo() {
        return radioAbarcativo;
    }
}
