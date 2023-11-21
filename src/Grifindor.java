public class Grifindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Grifindor(String name, int magicPower, int transgession,
                     int nobility, int honor, int bravery) {
        super(name, magicPower, transgession);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
    public void compareGrifindorStudents (Grifindor student){
        int totalStudent1 = this.getBravery() + this.getHonor() + this.getNobility();
        int totalStudent2 = student.getBravery() + student.getHonor() + student.getNobility();
        if (totalStudent1 > totalStudent2) {
            System.out.println(this.getName() + ": " + totalStudent1 + " is a better student than "
                    + student.getName() + ": " + totalStudent2);
        } else {
            System.out.println(student.getName() + ": " + totalStudent2 + " is a better student than "
                    + this.getName() + ": " + totalStudent1);
        }
    }
    @Override
    public String toString() {
        return super.toString() +
                ", nobility= " + nobility +
                ", honor= " + honor +
                ", bravery= " + bravery;
    }
}
