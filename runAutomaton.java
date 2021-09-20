import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class runAutomaton {
    private String line = "";
    private int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JFormattedTextField numOfAutomatons;
    private JButton submitButton;
    public int automatons;

    //Methods
    //Method to check if String is a Number.
    public static boolean isNumeric(String stringIn) {
        if (stringIn == null) {
            return false;
        }
        try {
            int test = Integer.parseInt(stringIn);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    //Constructors
    public runAutomaton() {
        frame = new JFrame();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("runAutomaton");
        frame.pack();
        frame.setVisible(true);

        submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isNum = false;

                if (isNumeric(numOfAutomatons.getText())) {
                    isNum = true;
                }
                //If Num of Automatons is a String
                if (!isNum) {
                    JOptionPane.showMessageDialog(frame,"Please Enter A Valid Number");
                    //If Num of Automatons is less than or equal to 0.
                } else if ((automatons = Integer.parseInt(numOfAutomatons.getText())) <= 0) {
                    JOptionPane.showMessageDialog(frame,"Please Enter A Value That Is Greater Than 0");
                } else {
                    line = "Creating " + String.valueOf(automatons) + " Automatons.";
                    JOptionPane.showConfirmDialog(frame, line,"Confirmation", JOptionPane.DEFAULT_OPTION);
                    new setAutomatons(automatons);
                    frame.dispose();
                }
            }
        });
    }

    public static void main(String[] args) {
        //Creates the RunAutomaton Program
        new runAutomaton();


    }
}
