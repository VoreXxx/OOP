public class Hogwarts {
    void compareGrifindorStudents(Grifindor student1, Grifindor student2) {
        int totalStudent1 = student1.bravery + student1.honor + student1.nobility;
        int totalStudent2 = student2.bravery + student2.honor + student2.nobility;
        if (totalStudent1 > totalStudent2) {
            System.out.println(student1.getClass().getSimpleName() + " is a better student than " + student2.getClass().getSimpleName());
        } else {
            System.out.println(student2.getClass().getSimpleName() + " is a better student than " + student1.getClass().getSimpleName());
        }
    }

    void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        int totalStudent1 = student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.thirstPower;
        int totalStudent2 = student2.cunning + student2.determination + student2.ambition + student2.resourcefulness + student2.thirstPower;
        if (totalStudent1 > totalStudent2) {
            System.out.println(student1.getClass().getSimpleName() + " is a better student than " + student2.getClass().getSimpleName());
        } else {
            System.out.println(student2.getClass().getSimpleName() + " is a better student than " + student1.getClass().getSimpleName());
        }
    }

    void compareMagic(HogwartsStudent student1, HogwartsStudent student2) {
        if (student1.magicPower > student2.magicPower) {
            System.out.println(student1.name + " has a greater magical power than " + student2.name);
        } else {
            System.out.println(student2.name + " has a greater magical power than " + student1.name);
        }
    }
}
