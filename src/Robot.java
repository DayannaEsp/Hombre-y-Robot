public class Robot {
    Bateria bateria = new Bateria(1000);
    boolean dormido = false;

    public void mover(int pasos) {
        if (dormido) {
            System.out.println("El robot está dormido y no se puede mover");
        } else if (bateria.getCarga() == 0) {
            System.out.println("La batería está vacía, no puede moverse");
        } else {
            int energia = (pasos / 100) * 10;
            bateria.setCarga(Math.max(0, bateria.getCarga() - energia));
            System.out.println("El robot se movio " + pasos + " pasos.");
        }
    }

    public void dormir() {
        dormido = true;
        System.out.println("Robot dormido");
    }

    public void despertar() {
        dormido = false;
        System.out.println("Robot despierto");
    }

    public void recargar() {
        bateria.setCarga(1000);
        System.out.println("Batería recargada a 1000");
    }
}