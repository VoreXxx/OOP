public class Slytherin extends Hogwarts{
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstPower;

    public Slytherin(String name, int magicPower, int transgession, int cunning,
                     int determination, int ambition, int resourcefulness, int thirstPower) {
        super(name, magicPower, transgession);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    public void compareSlytherinStudents (Slytherin student){
        int totalStudent1 = this.getCunning() + this.getDetermination() +
                this.getAmbition() + this.getResourcefulness() + this.getThirstPower();
        int totalStudent2 = student.getCunning() + student.getDetermination() +
                student.getAmbition() + student.getResourcefulness() + student.getThirstPower();
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
                ", cunning= " + cunning +
                ", determination= " + determination +
                ", ambition= " + ambition +
                ", resourcefulness= " + resourcefulness +
                ", thirstPower= " + thirstPower;
    }
}
