public class Slytherin {
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;
    int thirstPower;

    public Slytherin(int cunning, int determination,
                     int ambition, int resourcefulness, int thirstPower) {
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }
    void description() {
        System.out.println("Cunning: " + cunning + " Determination: " + determination + " Ambition: "
                + ambition + " Resourcefulness: " + resourcefulness + " Thirst for Power: " + thirstPower);
    }
}
