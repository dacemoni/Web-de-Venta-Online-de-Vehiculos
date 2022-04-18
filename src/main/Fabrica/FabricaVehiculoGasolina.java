package main.Fabrica;

import main.Automovil.Automovil;
import main.Automovil.AutomovilGasolina;
import main.Scooter.Scooter;
import main.Scooter.ScooterGasolina;

public class FabricaVehiculoGasolina implements FabricaVehiculo {
  public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
    return new AutomovilGasolina(modelo, color,
        potencia, espacio);
  }

  public Scooter creaScooter(String modelo, String color, int potencia) {
    return new ScooterGasolina(modelo, color, potencia);
  }
}
