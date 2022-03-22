package com.vehiculos_online.vehiculos_online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehiculosOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiculosOnlineApplication.class, args);
		public static int nAutos = 3;  
  public static int nScooters = 2;  
  
  public static void main(String[] args)  
  {  
    Scanner reader = new Scanner(System.in);  
    FabricaVehiculo fabrica;  
    Automovil[] autos = new Automovil[nAutos];  
    Scooter[] scooters = new Scooter[nScooters];  
    System.out.print("Desea utilizar " +  
      "vehiculos electricos (1) o a gasolina (2):");  
    String eleccion = reader.next();  
    if (eleccion.equals("1"))  
    {  
      fabrica = new FabricaVehiculoElectricidad();  
    }  
    else  
    {  
      fabrica = new FabricaVehiculoGasolina();  
    }  
    for (int index = 0; index < nAutos; index++)  
      autos[index] = fabrica.creaAutomovil("estandar",   
        "amarillo", 6+index, 3.2);  
    for (int index = 0; index < nScooters; index++)  
      scooters[index] = fabrica.creaScooter("clasico",   
        "rojo", 2+index);  
    for (Automovil auto: autos)  
      auto.mostrarCaracteristicas();  
    for (Scooter scooter: scooters)  
      scooter.mostrarCaracteristicas();  
  }  
	}

}
