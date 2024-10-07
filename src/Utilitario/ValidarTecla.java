/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilitario;

import java.awt.event.KeyEvent;

/**
 *
 * @author Antony
 */
public class ValidarTecla {

    public static void validarLetra(KeyEvent evt, String textoActual, int mxtecla) {

        char keyChar = evt.getKeyChar();
        boolean esLetra = Character.isLetter(keyChar);
        boolean esEspacio = Character.isWhitespace(keyChar);
        if (!(esLetra || esEspacio) || (textoActual.length() >= mxtecla)) {
            evt.consume();
        }
    }

    public static void validarNro(KeyEvent evt, String textoActual, int mxtecla) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!(numeros) || (textoActual.length() >= mxtecla)) {
            evt.consume();
        }
    }
}
