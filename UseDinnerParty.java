import javax.swing.*;

public class UseDinnerParty {
    public static void main(String[] args){
        int numGuests;
        String choice;
        Party p1 = new Party();
        DinnerParty dp = new DinnerParty();

        numGuests = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of guests for the party: "));
        p1.setGuests(numGuests);

        JOptionPane.showMessageDialog(null, "The party has "+p1.getGuests()+" guests");
        JOptionPane.showMessageDialog(null, p1.displayInvitation());

        //get information from user
        numGuests = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of guests for the dinner party"));
        dp.setGuests(numGuests);
        String[] choices = {"Chicken", "Vegetarian", "Fish"};
        choice = (String)JOptionPane.showInputDialog(null, "Choose", "Choose", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        //set variables in dinner party
        dp.setGuests(numGuests);
        dp.setDinnerChoice(choice);
        JOptionPane.showMessageDialog(null, "The dinner party has "+dp.getGuests()+" guests\nMenu option "+dp.getDinnerChoice()+" will be served");

        String[] options = {"Yes", "No"};
        JOptionPane.showOptionDialog(null, dp.displayInvitation(), null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

    }
}
