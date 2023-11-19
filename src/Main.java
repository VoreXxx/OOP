public class Main {
    public static void main(String[] args) {
            Grifindor harry = new Grifindor("Harry",90, 85,
                    88, 67, 88);
            Grifindor hermione = new Grifindor("Hermione", 85, 90,
                    85, 94, 76);
            Grifindor ron = new Grifindor("Ron", 88, 80,
                    85, 65, 70);

            Hufflepuff zacharias = new Hufflepuff("Zachrias", 88, 90,
                    80, 30, 98);
            Hufflepuff sedrick = new Hufflepuff("Sedrick",92, 83,
                    95, 87, 65);
            Hufflepuff justin = new Hufflepuff("Justin",90, 87,
                    98,44, 55);

            Ravenclaw cho = new Ravenclaw("Cho",95, 85,
                    90, 45, 78);
            Ravenclaw padma = new Ravenclaw("Padma",78, 80,
                    85, 66, 32);
            Ravenclaw marcus = new Ravenclaw("Marcus", 80, 65,
                    79, 45,78);

            Slytherin draco = new Slytherin("Draco",80, 90,
                    95, 85, 90, 66, 99);
            Slytherin grehem = new Slytherin("Grehem", 58, 79,
                    65, 78, 30, 45, 21);
            Slytherin gregory = new Slytherin("Gregory", 40, 51,
                    67, 69, 63, 39, 87);

        System.out.println(harry.toString());
        System.out.println(hermione.toString());
        System.out.println(ron.toString());
        System.out.println(zacharias.toString());
        System.out.println(sedrick.toString());
        System.out.println(justin.toString());
        System.out.println(cho.toString());
        System.out.println(padma.toString());
        System.out.println(marcus.toString());
        System.out.println(draco.toString());
        System.out.println(grehem.toString());
        System.out.println(gregory.toString());

        draco.compareSlytherinStudents(gregory);
        ron.compareGrifindorStudents(harry);
        harry.compareMagic(draco);
        hermione.compareMagic(cho);

    }
}