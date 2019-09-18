package beans;

public class Person {   
    
    String name;
    String howMuchSpent;

    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHowMuchSpent() {
        return howMuchSpent;
    }

    public void setHowMuchSpent(String howMuchSpent) {
        this.howMuchSpent = howMuchSpent;
    }

    
}
