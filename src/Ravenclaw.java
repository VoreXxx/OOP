public class Ravenclaw {
    int intelligence;
    int wisdom;
    int creativity;

    Ravenclaw(int intelligence, int wisdom, int creativity) {
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    void description() {
        System.out.println("Intelligence: " + intelligence + " Wisdom: " + wisdom +
                " Creativity: " + creativity);
    }
}
