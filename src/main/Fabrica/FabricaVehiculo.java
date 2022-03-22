package main.Fabrica;

import Main.Scooter.Scooter;

public interface FabricaVehiculo  

{  
  Automovil creaAutomovil(String modelo, String color,  
    int potencia, double espacio);  
  
  Scooter creaScooter(String modelo, String color, int  
    potencia);  
}  