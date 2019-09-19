package beans;

public class Person {   
    
    private String name;
    private float howMuchSpent;
    private float howMuchOwesToTreasury;

    public Person() {
    }
    
    public Person(String name, float howMuchSpent, float howMuchOwesToTreasury) {
        this.name = name;
        this.howMuchSpent = howMuchSpent;
        this.howMuchOwesToTreasury = howMuchOwesToTreasury;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHowMuchSpent() {
        return howMuchSpent;
    }

    public void setHowMuchSpent(float howMuchSpent) {
        this.howMuchSpent = howMuchSpent;
    }

    public float getHowMuchOwesToTreasury() {
        return howMuchOwesToTreasury;
    }

    public void setHowMuchOwesToTreasury(float howMuchOwesToTreasury) {
        this.howMuchOwesToTreasury = howMuchOwesToTreasury;
    }
    
}
