public class WolfTest {
    public static void main(String[] args) {
        Wolf someWolf = new Wolf();
        someWolf.age = 7;
        someWolf.color = "серый";
        someWolf.isMale = true;
        someWolf.nickname = "Акела";
        someWolf.weight = 62;

        System.out.println("кличка: " + someWolf.nickname);
        System.out.println("пол: " + (someWolf.isMale ? "самец" : "самка"));
        System.out.println("возраст, лет: " + someWolf.age);
        System.out.println("цвет: " + someWolf.color);
        System.out.println("вес: " + someWolf.weight);

        someWolf.howl();
        someWolf.hunt();
        someWolf.run();
        someWolf.sit();
        someWolf.walk();
    }
}