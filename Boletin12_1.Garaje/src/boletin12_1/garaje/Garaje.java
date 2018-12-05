/*
 1.	 Codifica un programa para xestionar un garaxe de coches .

A clase Garaxe ten como atributos :
numeroCoches (para saber o nº de coches que están nese momento no garaxe)
matricula para identificalo

Antes de deixar aparcar un coche. Debemos comprobar que temos sitio para él, en 
caso afirmativo poñemos unha mensaxe “ PLAZAS DISPOÑIBLES “ e rexistramos o coche .
No caso contrario poríamos unha mensaxe “ COMPLETO “.

Para facer máis doado o programa, suponer que o garaxe ten capacidade para 5 coches
Para calcular o prezo do aparcamento , considerade o seguinte :
primeiros 3 horas. ----> 1.5 €
O resto do tempo : pagamos 0.20 € cada hora.


A saida será :
FACTURA
MATRICULA COCHE ........
TEMPO .................
PRECIO...............
CARTOS RECIBIDOS...........
CARTOS DEVOLTOS............

GRACIAS POR USAR O NOSO APARCADOIRO

 */
package boletin12_1.garaje;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Garaje {

    //Atributos
    int numCoches;
    String matricula;

    //variables de calculo
    boolean tiempo = true;
    long tEntrada, tSalida, tEstancia;
    float precio, pago, vuelta;
    int hora, min, seg;

    public void comprobarPlazasLibres() {
        int numPlazas = 5;
        if (numPlazas > numCoches) {
            JOptionPane.showMessageDialog(null, "PLAZAS DISPONIBLES");
            matricula = JOptionPane.showInputDialog("Introduce la matricula para el registro");
            tiempoGaraje();
        } else {
            JOptionPane.showMessageDialog(null, "OCUPADO");
        }
    }

//    public void entradaCoche() {
//
//    }

    public void salidaCoche() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿quieres salir?", "Ventana Salida", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Espere para el cobro");
            tiempo = false;
            tiempoGaraje();
        } else {
            salidaCoche();
        }
    }

    public void calcularPrecio() {
        int tiempoSegundos;

        int tiempoHora;

        tiempoSegundos = (int) (tEstancia / 1000);
        tiempoHora = tiempoSegundos / 3600;
        hora = (int) (tiempoSegundos / 3600);
        min = (int) ((tiempoSegundos - (3600 * hora)) / 60);
        seg = (int) (tiempoSegundos - ((hora * 3600) + (min * 60)));

        if (tiempoHora <= 3) {
            precio = 1.5f;
        } else {
            precio = (float) (1.5 + (0.2 * (tiempoHora - 3)));
        }
        do {
            pago = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el importe"));

            vuelta = pago - precio;
        } while (pago < precio);
        imprimirFactura();

    }

    public void imprimirFactura() {
        JOptionPane.showMessageDialog(null,
                "FACTURA MATRICULA COCHE " + matricula
                + "\nTiempo Estancia:\t " + hora + ":" + min + ":" + seg + "horas"
                + "\nImporte Estancia:\t " + precio + "€"
                + "\nRecibido:\t" + pago + "€"
                + "\nVuelta:\t" + vuelta + "€"
                );

    }

    public void tiempoGaraje() {

        if (tiempo) {
            tEntrada = System.currentTimeMillis();
            System.out.println(tiempo);
            salidaCoche();
        } else {
            tSalida = System.currentTimeMillis();
            tEstancia = tSalida - tEntrada;
            calcularPrecio();
            System.out.println("Tiempo de ejecución en milisegundos: " + tEstancia);
        }
    }
}
