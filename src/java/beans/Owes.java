package beans;

public class Owes {
    
    private Person debtor;
    private Person creditor;
    private float amount;
    
    public Owes(){
    }

    public Owes(Person debtor, Person creditor, float amount) {
        this.debtor     = debtor;
        this.creditor   = creditor;
        this.amount     = amount;
    }

    public Person getDebtor() {
        return debtor;
    }

    public void setDebtor(Person debtor) {
        this.debtor = debtor;
    }

    public Person getCreditor() {
        return creditor;
    }

    public void setCreditor(Person creditor) {
        this.creditor = creditor;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    
    
}
