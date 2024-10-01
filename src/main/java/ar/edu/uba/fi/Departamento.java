package ar.edu.uba.fi;

public class Departamento extends Inmueble{
    
    private final Double metrosCuadrados;

    public Departamento(Double metrosCuadrados, String direccion){
        super(direccion);
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public Double alquilarPorDias(int dias){
        return dias * metrosCuadrados;

    }
}


