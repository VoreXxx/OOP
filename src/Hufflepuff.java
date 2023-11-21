public class Hufflepuff extends Hogwarts{
    private final int hardworking;
    private final int loyal;
    private final int honest;

    public Hufflepuff(String name, int magicPower, int transgession,
                      int hardworking, int loyal, int honest) {
        super(name, magicPower, transgession);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
    public void compareHufflepuffStudents (Hufflepuff student){
        int totalStudent1 = this.getHardworking() + this.getLoyal() + this.getHonest();
        int totalStudent2 = student.getHardworking() + student.getLoyal() + student.getHonest();
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
                ", hardworking= " + hardworking +
                ", loyal= " + loyal +
                ", honest= " + honest;
    }
}
