package UI;

import beans.Expense;
import beans.Person;
import core.Splitting;

public class StarterConsole {
    
    public static void main(String[] args) {
        
        Person sarah = new Person("Sarah", 0 , 0);
        Person mahsa = new Person("Mahsa", 0 , 0);
        Person dorsa = new Person("Dorsa", 0 , 0);
        Person[] people = new Person[3];
        people[0] = sarah;
        people[1] = mahsa;
        people[2] = dorsa;
        
        Expense expenses[] = new Expense[5];
        expenses[0] = new Expense("ski ticket", 100, sarah);
        expenses[1] = new Expense("taxi", 40, sarah);
        expenses[2] = new Expense("snack", 20, mahsa);
        expenses[3] = new Expense("rent", 140, mahsa);
        expenses[4] = new Expense("lunch", 120, dorsa);
        
        new Splitting().split(people, expenses);
        
                
    }
    
}
