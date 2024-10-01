/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ar.edu.uba.fi;


class Cabaña extends Inmueble{
    private final Double cantidadDeInquilinos;

    public Cabaña(Double cantidadDeInquilinos, String direccion){
        super(direccion);
        this.cantidadDeInquilinos = cantidadDeInquilinos;
    }

    @Override
    public Double alquilarPorDias(int dias){
        return dias * Math.pow(this.cantidadDeInquilinos, 2);

    }
}
