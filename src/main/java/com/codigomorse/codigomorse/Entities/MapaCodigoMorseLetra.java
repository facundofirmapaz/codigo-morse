package com.codigomorse.codigomorse.Entities;

import java.util.HashMap;
import java.util.Map;

public class MapaCodigoMorseLetra
{
    public static Map<String, Character> mapaLetraCodigo;

    public MapaCodigoMorseLetra()
    {
        mapaLetraCodigo = new HashMap<String, Character>();
        mapaLetraCodigo.put(".-", 'a');
        mapaLetraCodigo.put("-...", 'b');
        mapaLetraCodigo.put("-.-.", 'c');
        mapaLetraCodigo.put("-..", 'd');
        mapaLetraCodigo.put(".", 'e');
        mapaLetraCodigo.put("..-.", 'f');
        mapaLetraCodigo.put("--.", 'g');
        mapaLetraCodigo.put("....", 'h');
        mapaLetraCodigo.put("..", 'i');
        mapaLetraCodigo.put(".---", 'j');
        mapaLetraCodigo.put("-.", 'k');
        mapaLetraCodigo.put(".-..", 'l');
        mapaLetraCodigo.put("--", 'm');
        mapaLetraCodigo.put("-.", 'n');
        mapaLetraCodigo.put("---", 'o');
        mapaLetraCodigo.put(".--.", 'p');
        mapaLetraCodigo.put("--.-", 'q');
        mapaLetraCodigo.put(".-.", 'r');
        mapaLetraCodigo.put("...", 's');
        mapaLetraCodigo.put("-", 't');
        mapaLetraCodigo.put("..-", 'u');
        mapaLetraCodigo.put("...-", 'v');
        mapaLetraCodigo.put(".--", 'w');
        mapaLetraCodigo.put("-..-", 'x');
        mapaLetraCodigo.put("-.--", 'y');
        mapaLetraCodigo.put("--..", 'z');
        mapaLetraCodigo.put(".----", '1');
        mapaLetraCodigo.put("..---", '2');
        mapaLetraCodigo.put("...--", '3');
        mapaLetraCodigo.put("....-", '4');
        mapaLetraCodigo.put(".....", '5');
        mapaLetraCodigo.put("-....", '6');
        mapaLetraCodigo.put("--...", '7');
        mapaLetraCodigo.put("---..", '8');
        mapaLetraCodigo.put("----.", '9');
        mapaLetraCodigo.put("-----", '0');

    }

    public String getCaracter(String codigo)
    {
        return mapaLetraCodigo.get(codigo).toString();
    }
}
