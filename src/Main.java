import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int numeroEjercicio;
        string actvText = """
             Eliga la actividad que desea visualizar: 
              1.Ejercicio 1  9.Ejercicio 9
              2.Ejercicio 2  10.Ejercicio 10
              3.Ejercicio 3  11.Ejercicio 11
              4.Ejercicio 4  12.Ejercicio 12
              5.Ejercicio 5  13.Ejercicio 13
              6.Ejercicio 6  14.Ejercicio 14
              7.Ejercicio 7  15.Salir
              8.Ejercicio 8 """;
        do {

            String input = JOptionPane.showInputDialog(actvText);
            try {
                numeroEjercicio = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opción inválida. Ingrese otro número.");
                numeroEjercicio = -1;
                continue;
            }
            switch (numeroEjercicio) {
                case 1:
                    Ejercicios.ejercicio1();
                    break;
                case 2:
                    Ejercicios.ejercicio2();
                    break;
                case 3:
                    Ejercicios.ejercicio3();
                    break;
                case 4:
                    Ejercicios.ejercicio4();
                    break;
                case 5:
                    Ejercicios.ejercicio5();
                    break;
                case 6:
                    Ejercicios.ejercicio6();
                    break;
                case 7:
                    Ejercicios.ejercicio7();
                    break;
                case 8:
                    Ejercicios.ejercicio8();
                    break;
                case 9:
                    Ejercicios.ejercicio9();
                    break;
                case 10:
                    Ejercicios.ejercicio10();
                    break;
                case 11:
                    Ejercicios.ejercicio11();
                    break;
                case 12:
                    Ejercicios.ejercicio12();
                    break;
                case 13:
                    Ejercicios.ejercicio13();
                    break;
                case 14:
                    Ejercicios.ejercicio14();
                    break;
                case 15:
                    JOptionPane.showMessageDialog(null, "......Finalizando programa......");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (numeroEjercicio != 15);
    }
}
