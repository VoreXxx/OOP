public class Main {
    public static void main(String[] args) {
            Grifindor harry = new Grifindor(90, 85, 88);
            Grifindor hermione = new Grifindor(85, 90, 85);
            Grifindor ron = new Grifindor(88, 80, 85);

            Hufflepuff zacharias = new Hufflepuff(88, 90, 80);
            Hufflepuff sedrick = new Hufflepuff(92, 83, 95);
            Hufflepuff justin = new Hufflepuff(90, 87, 98);

            Ravenclaw cho = new Ravenclaw(95, 85, 90);
            Ravenclaw padma = new Ravenclaw(78, 80, 85);
            Ravenclaw marcus = new Ravenclaw(80, 65, 79);

            Slytherin draco = new Slytherin(80, 90,
                    95, 85, 90);
            Slytherin grehem = new Slytherin(58, 79,
                    65, 78, 30);
            Slytherin gregory = new Slytherin(40, 51,
                    67, 69, 63);
        harry.description();
        hermione.description();
        ron.description();
        zacharias.description();
        sedrick.description();
        justin.description();
        cho.description();
        padma.description();
        marcus.description();
        draco.description();
        grehem.description();
        gregory.description();
        Hogwarts research = new Hogwarts();
        research.compareGrifindorStudents(harry, ron);
        research.compareSlytherinStudents(draco, gregory);
        HogwartsStudent dracoMalfoy = new HogwartsStudent("Draco Malfoy", 95);
        HogwartsStudent zachariasSmith = new HogwartsStudent("Zacharias Smith", 85);
        research.compareMagic(dracoMalfoy, zachariasSmith);
    }
}