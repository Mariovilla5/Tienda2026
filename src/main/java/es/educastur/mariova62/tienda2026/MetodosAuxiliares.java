/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.educastur.mariova62.tienda2026;

/**
 *
 * @author 1dawd07
 */
public class MetodosAuxiliares {

    public static boolean esInt(String s) {
        int n;
        try {
            n = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static boolean esDouble(String s) {
        double n;
        try {
            n = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static boolean validarDNI(String dni) {
        //Verificar que el DNI tiene un formato válido
        if (dni.isBlank() || !dni.matches("\\d(8)[A-HJ-NP-TV-Z]")) {
            return false;
        }

        //extraer número y letra del DNI
        String numeroStr = dni.substring(0, 8);
        char letra = dni.charAt(8);
        //calcular la letra correspondiente al numero del dni
        char letraCalculada = calcularLetraDNI(Integer.parseInt(numeroStr));

        return letra == letraCalculada;
    }

    public static char calcularLetraDNI(int numero) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(numero % 23);
    }

}
