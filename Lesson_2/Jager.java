public class Jager {
    private String modelName;
    private String mark;
    private String origin;
    private double height;
    private double weight;
    private int speed;
    private int power;
    private int armour;
    private boolean active;
    private boolean drift;

    public Jager() {
        active = true;
    }

    public Jager(String modelName, String mark, String origin, double height, double weight,
            int speed, int power, int armour) {
        this();
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.armour = armour;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String Mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isDrifting() {
        return drift;
    }

    public void startDrifting() {
        drift = true;
    }

    public void stopDrifting() {
        drift = false;
    }

    public void move() {
        System.out.println("Moved five steps forward");
    }

    public String scanKaiju() {
        return "nothing";
    }
}