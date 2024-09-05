import javax.swing.JOptionPane;

public class Ejercicios {
    final static int IVA = 21;

    // Ejercicio 1
    public static void ejercicio1() {
        String nombre = "Franco";
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
    }

    // Ejercicio 2
    public static void ejercicio2() {
        String nombre = JOptionPane.showInputDialog("Escriba el nombre de usuario:");
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
    }

    // Ejercicio 3
    public static void ejercicio3() {
        try {
            double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
            double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));

            String resultado = String.format(
                    "La suma: %.2f + %.2f = %.2f\n" +
                            "La resta: %.2f - %.2f = %.2f\n" +
                            "La multiplicación: %.2f * %.2f = %.2f\n" +
                            "La división: %.2f / %.2f = %.2f\n" +
                            "El módulo: %.2f %% %.2f = %.2f",
                    valor1, valor2, valor1 + valor2,
                    valor1, valor2, valor1 - valor2,
                    valor1, valor2, valor1 * valor2,
                    valor1, valor2, valor1 / valor2,
                    valor1, valor2, valor1 % valor2
            );
            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese números válidos.");
        }
    }

    // Ejercicio 4
    public static void ejercicio4() {
        try {
            double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
            double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));

            String resultado;
            if (valor1 > valor2) {
                resultado = valor1 + " es mayor que " + valor2;
            } else if (valor1 < valor2) {
                resultado = valor2 + " es mayor que " + valor1;
            } else {
                resultado = valor1 + " y " + valor2 + " son iguales.";
            }
            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese números válidos.");
        }
    }

    // Ejercicio 5
    public static void ejercicio5() {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            String resultado = (numero % 2 == 0) ? "El número es divisible entre 2" : "El número no es divisible entre 2";
            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un número entero válido.");
        }
    }

    // Ejercicio 6
    public static void ejercicio6() {
        try {
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
            double precioFinal = precio + (precio * IVA / 100);
            JOptionPane.showMessageDialog(null, "El precio final con IVA es: " + precioFinal);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un precio válido.");
        }
    }

    // Ejercicio 7
    public static void ejercicio7() {
        StringBuilder sb = new StringBuilder();
        int num = 1;
        while (num <= 100) {
            sb.append(num).append("\n");
            num++;
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // Ejercicio 8
    public static void ejercicio8() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append(i).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // Ejercicio 9
    public static void ejercicio9() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                sb.append(i).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // Ejercicio 10
    public static void ejercicio10() {
        int numero;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número mayor o igual a 0:"));
        } while (numero < 0);
        JOptionPane.showMessageDialog(null, "El número ingresado es: " + numero);
    }

    public static void ejercicio11() {
    String contrasena = "hola";
    int contador = 3;
    boolean acceso = false;

    while (contador > 0 && !acceso) {
        String ingresoDeContrasena = JOptionPane.showInputDialog("Ingrese su contraseña. Tiene " + contador + " intentos.");

        if (contrasena.equals(ingresoDeContrasena)) {
            JOptionPane.showMessageDialog(null, "Acceso correcto");
            acceso = true;
        } else {
            contador--;
            if (contador == 0) {
                JOptionPane.showMessageDialog(null, "Acceso denegado");
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Intente nuevamente.");
            }
        }
    }
}

    public static void ejercicio12() {
    int valor1;
    do {
        String input = JOptionPane.showInputDialog("Ingrese un día de la semana en número (1 para lunes, 7 para domingo):");
        valor1 = Integer.parseInt(input);

        switch (valor1) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                JOptionPane.showMessageDialog(null, "Es un día laboral.");
                break;
            case 6:
            case 7:
                JOptionPane.showMessageDialog(null, "No es un día laboral.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número inválido. Ingrese un número del 1 al 7.");
                valor1 = 0;
                break;
        }
    } while (valor1 == 0);
}

    public static void ejercicio13() {
    String input = JOptionPane.showInputDialog("Ingrese un número para saber si es primo:");
    int valor1 = Integer.parseInt(input);
    boolean esPrimo = valor1 > 1;

    for (int i = 2; i <= Math.sqrt(valor1); i++) {
        if (valor1 % i == 0) {
            esPrimo = false;
            break;
        }
    }

    if (esPrimo) {
        JOptionPane.showMessageDialog(null, valor1 + " es primo.");
    } else {
        JOptionPane.showMessageDialog(null, valor1 + " no es primo.");
    }
}

    public static void ejercicio14() {
    int numAleatorio = (int) (Math.random() * 100);
    int contador = 0;
    int valor1;

    do {
        String input = JOptionPane.showInputDialog("Ingrese un número entre 0 y 100:");
        valor1 = Integer.parseInt(input);
        contador++;

        if (valor1 == numAleatorio) {
            JOptionPane.showMessageDialog(null, "¡Correcto! El número era " + numAleatorio + ". Cantidad de intentos: " + contador);
        } else if (valor1 > numAleatorio) {
            JOptionPane.showMessageDialog(null, "Es muy alto.");
        } else {
            JOptionPane.showMessageDialog(null, "Es muy bajo.");
        }
    } while (valor1 != numAleatorio);
}
}

