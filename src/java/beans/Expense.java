package beans;

public class Expense {
    
    String name;
    float price;
    Person person;

    public Expense(String name, float price, Person person) {
        this.name = name;
        this.price = price;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
