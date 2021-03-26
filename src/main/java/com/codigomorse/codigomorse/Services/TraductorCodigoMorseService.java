package com.codigomorse.codigomorse.Services;

import com.codigomorse.codigomorse.Entities.CodigoMorse;
import com.codigomorse.codigomorse.Entities.MapaCodigoMorseLetra;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class TraductorCodigoMorseService
{
    public static CodigoMorse traducirCodigoMorse(String codigo)
    {
        ArrayList<String> codigos = new ArrayList<>();
        ArrayList<String> res;

        String [] palabrasEnMorse = separarPalabras(codigo);

        res = traducirPalabras(palabrasEnMorse);

        for (int i = 0; i < palabrasEnMorse.length; i++)
            codigos.add(palabrasEnMorse[i]);

        return new CodigoMorse(codigos, res);
    }

    private static ArrayList<String> traducirPalabras(String[] palabrasEnMorse)
    {
        MapaCodigoMorseLetra mapa = new MapaCodigoMorseLetra();

        ArrayList<String> resultado = new ArrayList<>();
        for (int i = 0; i < palabrasEnMorse.length; i++)
        {
            String[] letras = palabrasEnMorse[i].split(" ");
            String palabraTraducida = "";
            for (int j = 0; j < letras.length; j++)
            {
                palabraTraducida = palabraTraducida + mapa.getCaracter(letras[j]);
            }
            resultado.add(palabraTraducida);
        }

        return resultado;
    }

    private static String[] separarPalabras(String codigo)
    {
        return codigo.split("   ");
    }


}
