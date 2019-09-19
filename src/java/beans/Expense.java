package beans;

import java.io.Serializable;

public class Expense implements Serializable{
    
    private String name;
    private float amount;
    private Person person;

    public Expense() {
    }
    
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
