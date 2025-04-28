public class TestJuego {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Hombre h1 = new Hombre("Carlos");
        System.out.println("Turno de Carlos:");
        h1.jugarConRobot(robot);

        Hombre h2 = new Hombre("Sergio");
        if (robot.dormido) {
            robot.despertar();
        }
        System.out.println("Turno de Sergio:");
        h2.jugarConRobot(robot);

        System.out.println("Juego terminado");
    }
}