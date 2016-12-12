package com.val.inflando;

/**
 * Created by vale on 11/05/16.
 */
public class StringUtil {

    public static String mensajeSalida (String nombre)
    {
        // String mensaje = null;
        //  mensaje = "El nombre tiene " +nombre.length() + " letras";

        String nombreInvertido = "";

        for (int c = nombre.length()-1; c >= 0; c--) {
            nombreInvertido = nombreInvertido + nombre.charAt(c);
        }

        return nombreInvertido;
    }
}
