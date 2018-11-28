/*
 * que imprimer por pantalla el ejercicio
 */
package boletin12_2;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Boletin12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instancia un objeto obj1 clase1 con los parámetros 5 y 4.
        Clase1 obj1 = new Clase1(5, 4);
//imprime por pantalla el metodo modificar para el objeto obj1
        //pasandole el parametro 4
        System.out.print(obj1.modificar(4) + " ");

//    public int modificar(int i) {
//        p1 = p1 + i; // p1= 5+4=9
//        p2 = p2 + i; // p2= 4+4=8
//        System.out.print(p2 + " ");
//        return p1;
//    }
//POR LO QUE IMPRIME POR PANTALLA 8 Y 9
//intancia el objeto obj2 de la clase1 con los parametros 5 y 4
        Clase1 obj2 = new Clase1(5, 4);

        //imprime por pantalla el metodo modificar para el objeto obj2
        //pasandole el parametro 5
        System.out.print(obj2.modificar(5) + " ");

        //    public int modificar(int i) {
//        p1 = p1 + i; // p1= 5+5=10
//        p2 = p2 + i; // p2= 4+5=9
//        System.out.print(p2 + " ");
//        return p1;
//    }
        //POR LO QUE IMPRIME POR PANTALLA 9 Y 10 
        //iguala los objetos : mete los datos de obj1 en obj 2
        obj2 = obj1;
//        P1 = 9
//        P2 = 8

        //imprime por pantalla el metodo modificar para el objeto obj2
        //pasandole el parametro 5
        System.out.println(obj2.modificar(5) + " ");

        //    public int modificar(int i) {
//        p1 = p1 + i; // p1= 9+5=14
//        p2 = p2 + i; // p2= 8+5=13
//        System.out.print(p2 + " ");
//        return p1;
//    }
  //POR LO QUE IMPRIME POR PANTALLA 13 Y 14
    }

}
