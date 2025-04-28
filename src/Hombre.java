import java.util.Scanner;

public class Hombre {
    String nombre;
    int pasos;

    public Hombre(String nombre) {
        this.nombre = nombre;
    }

    public void jugarConRobot(Robot robot) {
        Scanner teclado = new Scanner(System.in);
        int op;

        do {
            System.out.println("1. Avanzar");
            System.out.println("2. Retroceder");
            System.out.println("3. Ver energía");
            System.out.println("4. Dormir (Finalizar)");
            System.out.println("5. Despertar");
            System.out.println("6. Recargar batería");
            System.out.print("Elige una opción: ");
            op = teclado.nextInt();

            if (op == 1 || op == 2) {
                System.out.print("Cuántos pasos: ");
                pasos = teclado.nextInt();
                robot.mover(pasos);
            } else if (op == 3) {
                System.out.println("Energía actual: " + robot.bateria.getCarga());
            } else if (op == 4) {
                robot.dormir();
            } else if (op == 5) {
                robot.despertar();
            } else if (op == 6) {
                robot.recargar();
            } else {
                System.out.println("Opción inválida");
            }
        } while (!robot.dormido);
    }
}