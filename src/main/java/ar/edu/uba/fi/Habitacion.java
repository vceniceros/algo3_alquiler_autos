/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ar.edu.uba.fi;


class Habitacion extends Inmueble{
    private final Double cantidadDeCamas;

    public Habitacion(Double cantidadDeCamas, String direccion) {
        super(direccion);
        this.cantidadDeCamas = cantidadDeCamas;
    }

    @Override
    public Double alquilarPorDias(int dias) {
        return this.cantidadDeCamas * (dias + 500);
    }

}
