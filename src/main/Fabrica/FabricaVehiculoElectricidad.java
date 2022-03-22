package main.Fabrica;

import main.Automovil.Automovil;
import main.Automovil.AutomovilElectricidad;
import main.Scooter.Scooter;
import main.Scooter.ScooterElectricidad;

public class FabricaVehiculoElectricidad implements FabricaVehiculo  
{  
  public Automovil creaAutomovil(String modelo, String  
    color, int potencia, double espacio)  
  {  
    return new AutomovilElectricidad(modelo, color,  
      potencia, espacio);  
  }  
  
  public Scooter creaScooter(String modelo, String  
    color, int potencia)  
  {  
    return new ScooterElectricidad(modelo, color,  
      potencia);  
  }  
}  
