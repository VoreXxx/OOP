public abstract class Hogwarts {
    private final int magicPower;
    private final int transgession;
    private final String name;

    public Hogwarts(String name, int magicPower, int transgession) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgession = transgession;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgession() {
        return transgession;
    }

    public String getName() {
        return name;
    }
    public void compareMagic (Hogwarts student){
            if (this.getMagicPower() + this.getTransgession()
                    > student.getMagicPower() + student.getTransgession()) {
                System.out.println(this.getName() + " has a greater magical power than "
                        + student.getName());
            } else {
                System.out.println(student.getName() + " has a greater magical power than "
                        + this.getName());
            }
        }

    @Override
    public String toString() {
        return "Student: " + name +
                ", magicPower = " + magicPower +
                ", transgession=" + transgession;
    }
}
