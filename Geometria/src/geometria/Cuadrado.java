/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author Elena
 * 14/12/2021
 * v 1.01
 */
/**
 * Clase donde se implementan los atributos y métodos para calcular el area del
 * del cuadrado.
 * @author alumnado
 * @version 1.0
 * @since 14/12/2021
 */
public class Cuadrado implements FiguraGeometrica
{
    private double lado;
    private double areaCuadrado;

    public Cuadrado(double lado) 
    {
        //Método constuctor
        this.lado = lado;
    }
    
    public double getLado() 
    {
        //Consultor
        return lado;
    }

    public void setLado(double lado) 
    {
        //Modificador
        this.lado = lado;
    }

    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}