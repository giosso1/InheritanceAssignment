public class Party{
    private int guests;

    //getters and setters
    public int getGuests(){return this.guests;}
    public void setGuests(int g){this.guests=g;}

    //returns string, invitation
    public String displayInvitation(){
        return "Please come to my party";
    }
}