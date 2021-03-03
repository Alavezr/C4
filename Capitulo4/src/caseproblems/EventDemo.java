
package caseproblems;


public class EventDemo {
    
    public static void main(String[] args){
    Event obj1 = new Event();

    System.out.println("Event Number is: " + obj1.getEventNumber()+ " and Number of Guests: " + obj1.getGuest());

    Event obj2 = new Event("ABC200",200);

System.out.println("Event Number is: " + obj2.getEventNumber()+ " and Number of Guests: " + obj2.getGuest()+ " Total Price: " +obj2.getPrice());
}
    
}
