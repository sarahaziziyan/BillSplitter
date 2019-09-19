package beans;

public class Expense {
    
    String name;
    float amount;
    Person person;

    public Expense(String name, float price, Person person) {
        this.name = name;
        this.amount = price;
        this.person = person;
        person.setHowMuchSpent(person.getHowMuchSpent()+amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
        person.setHowMuchSpent(person.getHowMuchSpent()+amount);
    }
    
    
}
