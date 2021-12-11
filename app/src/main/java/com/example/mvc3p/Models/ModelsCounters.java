package com.example.mvc3p.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class ModelsCounters extends Observable
{
    private List<Integer> lista;

    public ModelsCounters()
    {
        lista = new ArrayList<Integer>(4);
        lista.add(0);
        lista.add(0);
        lista.add(0);
        lista.add(0);
    }

    public int ObtenerValorIndice(final int indice) throws  IndexOutOfBoundsException
    {
        return lista.get(indice);
    }

    public void SetValorIndice(final int indice) throws IndexOutOfBoundsException
    {
        lista.set(indice, lista.get(indice)+1);
        setChanged();
        notifyObservers();
    }
}
