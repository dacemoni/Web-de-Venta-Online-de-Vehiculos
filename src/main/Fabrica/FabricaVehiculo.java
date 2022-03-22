package main.Fabrica;

import main.Automovil.Automovil;

import main.Scooter.Scooter;

public interface FabricaVehiculo  

{  
  Automovil creaAutomovil(String modelo, String color,  
    int potencia, double espacio);  
  
  Scooter creaScooter(String modelo, String color, int  
    potencia);  
}  