
package caseproblems;


public class Event {
    public final static int PRICE_PER_GUEST = 35;
    public final static int CUT_OFF_VALUE = 50;

    private String eventNumber = "A000";

    private int guest;

    private int price;
Event(){
}

Event(String eventNumber, int guest){
        this.eventNumber = eventNumber;
        this.guest = guest;
setEventNumber(eventNumber);
setGuest(guest);
}
    public String getEventNumber(){
return eventNumber;
}
    public void setEventNumber(String eventNumber){
        this.eventNumber = eventNumber;
}
    public int getGuest(){
return guest;
}
    public int setGuest(int guest){
        this.guest = guest;
price = guest*PRICE_PER_GUEST;
return price;
}
    public int getPrice(){
return price;
}



}
