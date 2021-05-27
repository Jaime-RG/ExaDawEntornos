
package paquete1;


import org.jetbrains.annotations.Contract;

public class enteros {
    /**
     *
     * @param n declaramos la variable n en el metodo r_factorial
     * @return
     */
    public static int r_factorial(int n) {
        int resultado;

        if (n == 0) {
            resultado = 1;
        } else {
            resultado = n * r_factorial(n - 1);
        }
        return resultado;
    }

    /**
     *
     * @param n declaramos la variable n de tipo int , en el metodo factorial que nos dara un numero factorial
     * @return
     */

    public static int factorial(int n) {
        int resultado;

        resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    /**
     *
     * @param cadena declaramos la variable cadena de tipo String cuyo metodo dara un nombre escrito al reves
     * @return
     */
    public static String alreves(String cadena) {
        String resultado = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado = resultado + cadena.charAt(i);
        }
        return resultado;
    }

    /**
     *
     * @param n Declaramos la variable n de tipo int en el metodo de capicua
     * @return
     */
    public static boolean capicua(int n) {
        boolean resultado;
        String cadena;

        cadena = Integer.toString(n);
        if (cadena.equals(alreves(cadena))) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }

    /**
     *
     * @param multiplo declaramos la variable multiple de tipo int
     * @param divisor  declaramos la variable divisor de tipo int
     * @return
     */
    public static boolean divisible(int multiplo, int divisor) {
        boolean resultado;

        if (multiplo % divisor == 0) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }

    /**
     *
     * @param mult declaramos la variable mult de tipo int
     * @param divisor declaramos la variable divisor de tipo int
     * @return
     */
    public static boolean multiplo(int mult, int divisor) {
        boolean resultado;

        try {
            if (mult % divisor == 0) {
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (ArithmeticException e) {
            resultado = false;
        }
        return resultado;
    }

    /**
     *
     * @param n Declaramos la variable n de tipo int , este metodo muestra si el numero es primo o no
     * @return
     */
    public static boolean esPrimo(int n) {
        boolean primo;

        if (n <= 1) {
            primo = false;
        } else {
            primo = true;
            int i = 2;
            while (primo && i <= n / 2) {
                if (divisible(n, i)) {
                    primo = false;
                } else {
                    i++;
                }
            }
        }
        return primo;
    }

    /**
     *
     * @param n declaramos la variable n de tipo int , este metodo muestra si es primo o no mas el resultado
     * @return
     */
    public static int n_primos(int n) {
        int resultado = 0;

        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                resultado++;
            }
        }
        return resultado;
    }

    /**
     *
     * @param n Declaramos la variable n de tipo int , este metodo mostrara hasta que numero es primo
     *          dependiendo del numero que deseemos que sea el final
     * @return
     */
    public static int[] primosHasta(int n) {
        int[] resultado;

        resultado = new int[n_primos(n)];
        int cont = 0;
        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                resultado[cont] = i;
                cont++;
            }
        }

        return resultado;
    }

    /**
     *
     * @param n Declaramos la variable n de tipo int
     * @return
     */
    public static int[] primerosPrimos(int n) {
        int[] resultado = new int[(n < 0) ? 0 : n];

        int cont = 0;
        int i = 2;
        while (cont < n) {
            if (esPrimo(i)) {
                resultado[cont] = i;
                cont++;
            }
            i++;
        }

        return resultado;
    }
}
