public class Grifindor {
    int nobility;
    int honor;
    int bravery;

    public Grifindor(int nobility, int honor, int bravery) {
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    void description() {
        System.out.println("Bravery: " + bravery + " Honor: " + honor + " Nobility: " + nobility);
    }
}
