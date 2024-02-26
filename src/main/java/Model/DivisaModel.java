/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author dell
 */
public class DivisaModel {
    private double cantidad;
    private String moneda;
    private double valor;
    //@GETTERS
    public double getValor() {
        return valor;
    }
    //@SETTERS
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public void calcularDivisa(){
    switch(this.moneda){
        case "Pesos" -> {
            this.valor = this.cantidad * 0.00026;
        }
        case "Euros" -> {
            this.valor = this.cantidad * 1.10;
        }
        case "Soles" -> {
            this.valor = this.cantidad * 0.27;
        }
    }
    }
}