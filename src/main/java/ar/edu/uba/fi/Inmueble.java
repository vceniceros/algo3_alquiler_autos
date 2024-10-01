package ar.edu.uba.fi;

import ar.edu.uba.fi.Vehiculo;

public abstract class Inmueble implements Alquilable{
    protected String direccion;
    
    public Inmueble(String direccion){
        this.direccion = direccion;
    }

    @Override
    public abstract Double alquilarPorDias(int dias);

    public boolean esIgualA(Inmueble unInmueble){
        return unInmueble.tieneMismaDireccion(this.direccion);
    }

    private boolean tieneMismaDireccion(String direccion){
        return (this.direccion == direccion);
    }

}
