import java.util.Random;

class DnDCharacter {

    private final Random random;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    DnDCharacter() {
        random = new Random();
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        this.hitpoints = 10 + modifier(this.constitution);
    }

    int ability() {
        // Throw four dice
        int a = random.nextInt(6) + 1;
        int b = random.nextInt(6) + 1;
        int c = random.nextInt(6) + 1;
        int d = random.nextInt(6) + 1;
        // Sum the largest three
        int min = Math.min(Math.min(a, b), Math.min(c, d));
        return a + b + c + d - min;
    }

    int modifier(int constitution) {
        return Math.floorDiv(constitution - 10, 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }
}
