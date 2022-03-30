package militar;

/**
 * Clase Bicolas estáticas (Primero en entrar es el primero en salir = PEPS)
 * Características : para su representación usan arreglos, no se pueden
 * recorrer, como cada estructura tiene inserta y elimina como métodos
 * principales, las Bicolas usan los extremos del arreglo como entradas o
 * salidas de cada una de las dos colas
 *
 * @author Mauro
 * @param <T>
 */
public class Bicolas<T> {

    private T[] cola;
    private int atras2, atras1 = -1;  // indica que la cola esta vacia para el atras 1

    public Bicolas(T n[]) {
        cola = n;
        atras2 = cola.length; // indica que la cola esta vacia para el atras 2
    }

    public Bicolas()
    {
    }

    public Bicolas(T[] cola, int atras2)
    {
        this.cola = cola;
        this.atras2 = atras2;
    }

    public T[] getCola() {
        return cola;
    }

    public void setCola(T[] cola) {
        this.cola = cola;
    }

    public int getAtras1() {
        return atras1;
    }

    public void setAtras1(int atras1) {
        this.atras1 = atras1;
    }

    public int inserta(T dato, int atras, int lim, int factor) {
        if (!llena(atras, factor, lim)) {
            atras += factor;
            cola[atras] = dato;
        } else {
            System.out.println(" Cola llena");
        }
        return atras;
    }

    public Object[] elimina(int atras, int lim, int factor) {
        Object arr[] = new Object[2];
        // en la posición cero colocaremos el dato eliminado 
        // en la posición uno  colocaremos el nuevo atras
        if (vacia(atras, lim)) {
            System.out.println("Cola vacia");
            arr[0] = null;
        } else {
            arr[0] = cola[lim + factor]; // el primer elemento de la cola
            for (int i = lim + factor; i != atras; i += factor) {
                cola[i] = cola[i + factor]; //recorrer una posición todos los datos y puede se a la izq
                // o derecha dependiendo del factor
            }
            atras -= factor; // como se elimino un dato se mueve el atras ya sea a la izq en -1 o 
            // a la derecha en +1
        }
        arr[1] = atras;
        return arr;
    }

    public boolean vacia(int atras, int lim) {
        return atras == lim;
    }

    public boolean llena(int atras, int factor, int otroAtras) {
        return atras + factor == otroAtras;
    }

    /**
     * @return the atras2
     */
    public int getAtras2() {
        return atras2;
    }

    /**
     * @param atras2 the atras2 to set
     */
    public void setAtras2(int atras2) {
        this.atras2 = atras2;
    }

}
