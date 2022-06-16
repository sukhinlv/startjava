public class JagerTest {
    public static void main(String[] args) {
        Jager strikerEureka = new Jager();
        strikerEureka.setModelName("Striker Eureka");
        strikerEureka.setMark("Mark-5");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setHeight(76.2);
        strikerEureka.setWeight(1850);
        strikerEureka.setSpeed(10);
        strikerEureka.setPower(10);
        strikerEureka.setArmour(9);

        Jager coyoteTango = new Jager ("Coyote Tango", "Mark-1", "Japan",
                85.34, 2312, 5, 7, 4);

        System.out.println("Model name: " + strikerEureka.getModelName());
        System.out.println("Origin: " + strikerEureka.getOrigin());
        System.out.println("try to scan Kaiju: " + strikerEureka.scanKaiju());
        System.out.println();

        System.out.println("Model name: " + coyoteTango.getModelName());
        coyoteTango.move();
        System.out.println(coyoteTango.isDrifting() ? "drifting" : "not drifting");
        coyoteTango.startDrifting();
        System.out.println(coyoteTango.isDrifting() ? "drifting" : "not drifting");
    }
}