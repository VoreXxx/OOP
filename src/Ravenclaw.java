public class Ravenclaw extends Hogwarts{
    private final int intelligence;
    private final int wisdom;
    private final int creativity;

    public Ravenclaw(String name, int magicPower, int transgession,
                     int intelligence, int wisdom, int creativity) {
        super(name, magicPower, transgession);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCreativity() {
        return creativity;
    }
    public void compareRavenclawStudents (Ravenclaw student){
        int totalStudent1 = this.getCreativity() + this.getIntelligence() + this.getWisdom();
        int totalStudent2 = student.getCreativity() + student.getIntelligence() + student.getWisdom();
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
                ", intelligence= " + intelligence +
                ", wisdom= " + wisdom +
                ", creativity= " + creativity;
    }
}
