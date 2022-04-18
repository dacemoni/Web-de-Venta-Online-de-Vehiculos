package main.Documentacion;

import java.util.*;

public abstract class Documentacion {
    protected List<String> contenido = new ArrayList<String>();

    public abstract void agregaDocumento(String documento);

    public abstract void imprime();
}