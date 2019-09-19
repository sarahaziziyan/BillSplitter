package core;

import beans.Expense;
import beans.Owes;
import beans.Person;

public class Splitting {
    
    public Owes split(Person[] people, Expense[] expenses){
        Owes owes[] = new Owes[people.length-1];
        
        float sumExpenses = 0;
        float owesToTreasury = 0;

        for (Expense expense : expenses) {
            sumExpenses += expense.getAmount();
        }
        
        owesToTreasury = sumExpenses/people.length;
        Person creditor = null;
        for(Person person : people){
            float howMuchOwesToTreasury = person.getHowMuchSpent() - owesToTreasury;
            if(howMuchOwesToTreasury > 0 ){
                creditor =  person;
            }
            person.setHowMuchOwesToTreasury(howMuchOwesToTreasury);
            
        }        
        
        for(int i = 0; i < people.length; i++){
            Person debtor = null;
            int owesCount = 0;
            if(people[i].getHowMuchOwesToTreasury() < 0){
                debtor = people[i];
                owes[owesCount] = new Owes(debtor, creditor, Math.abs(people[i].getHowMuchOwesToTreasury()));
                System.out.println(debtor.getName()+" owes " + Math.abs(people[i].getHowMuchOwesToTreasury()) + " to " + creditor.getName());
                owesCount++;
            }
        }
        
        
        
        
        
        return null;        
    }
    
}
