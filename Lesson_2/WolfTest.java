public class WolfTest {
    public static void main(String[] args) {
        Wolf someWolf = new Wolf();
        
        someWolf.setAge(7);
        someWolf.setColor("серый");
        someWolf.setMale(true);
        someWolf.setNickname("Акела");
        someWolf.setWeight(62);

        System.out.println("кличка: " + someWolf.getNickname());
        System.out.println("пол: " + (someWolf.isMale() ? "самец" : "самка"));
        System.out.println("возраст, лет: " + someWolf.getAge());
        System.out.println("цвет: " + someWolf.getColor());
        System.out.println("вес: " + someWolf.getWeight());

        someWolf.howl();
        someWolf.hunt();
        someWolf.run();
        someWolf.sit();
        someWolf.walk();
    }
}