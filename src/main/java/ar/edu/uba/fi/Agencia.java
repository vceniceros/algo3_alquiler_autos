package ar.edu.uba.fi;

import java.util.ArrayList;

import ar.edu.uba.fi.Alquilable;
import ar.edu.uba.fi.Inmueble;
import ar.edu.uba.fi.InmuebleYaRegistradoException;

public class Agencia {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();

    public void registrarVehiculo(Vehiculo unVehiculo) {
        for(Vehiculo vehiculo: vehiculos){
            if(vehiculo.esIgualA(unVehiculo)){
                throw new VehiculoYaRegistradoException();
            }
        }
        vehiculos.add(unVehiculo);
    }

    void registrarInmueble(Inmueble unInmueble) {
        for(Inmueble inmueble: inmuebles){
            if(inmueble.esIgualA(unInmueble)){
                throw new InmuebleYaRegistradoException();
            }
        }
        inmuebles.add(unInmueble);
    }


    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Double calcularAlquilerParaCliente(Cliente unCliente) {
        for (Cliente cliente: clientes){
            if(cliente.esIgualA(unCliente)){
                return cliente.calcularPrecioAlquileres();
            }
        }
        throw new ClienteNoRegistradoException();
    }

    public void registrarAlquiler(Cliente unCliente, Alquilable unAlquilable, int dias) {
        Cliente cliente = buscarCliente(unCliente);
        Alquilable alquilable = buscarAlquilable(unAlquilable);
        cliente.registrarAlquiler(alquilable, dias);
    }

    private Vehiculo buscarVehiculo(Vehiculo unVehiculo) {
        for(Vehiculo vehiculo: vehiculos){
            if(vehiculo.esIgualA(unVehiculo)){
                return vehiculo;
            }
        }
        throw new VehiculoNoRegistradoException();
    }

    private Inmueble buscarInmueble(Inmueble unInmueble){
        for(Inmueble inmueble: inmuebles){
            if(inmueble.esIgualA(unInmueble)){
                return inmueble;
            }
        }
        throw new VehiculoNoRegistradoException();
    }

   private Alquilable buscarAlquilable(Alquilable unAlquilable) {
        if (unAlquilable instanceof Vehiculo) {
            return buscarVehiculo((Vehiculo) unAlquilable);
        } else if (unAlquilable instanceof Inmueble) {
            return buscarInmueble((Inmueble) unAlquilable);
        }
        throw new AlquilableNoRegistradoException();
}


    private Cliente buscarCliente(Cliente unCliente) {
        for(Cliente cliente: clientes){
            if(cliente.esIgualA(unCliente)){
                return cliente;
            }
        }
        throw new ClienteNoRegistradoException();
    }

    public Double calcularAlquilerTotal() {
        double suma = 0;
        for(Cliente cliente: clientes){
            suma += cliente.calcularPrecioAlquileres();
        }
        return suma;
    }

   
}
