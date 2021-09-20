import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class setAutomatons {
    int automatons;
    private String line = "";
    private JFrame frame;
    private JPanel panel;
    private JFormattedTextField statesField;
    private JFormattedTextField symbolsField;
    private JFormattedTextField finalStatesField;
    private JButton submitButton;
    private JCheckBox printToFileCheckBox;
    private JLabel stateToField;
    private JFormattedTextField formattedTextField1;
    private JCheckBox printVisualDiagramCheckBox;
    private JFormattedTextField formattedTextField2;
    private JLabel statesAccepted;
    private JLabel symbolsAccepted;
    private boolean automatonIsSet;
    private ArrayList<finiteAutomaton> automatonList;

    //Constructors
    public setAutomatons(int automatons) {
        this.automatons = automatons;
        this.automatonList = new ArrayList<finiteAutomaton>(automatons);
        frame = new JFrame();

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("runAutomaton");
        frame.pack();
        frame.setVisible(true);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] states;
                String[] symbols;
                String[] finalStates;
                automatonIsSet = false;
                while (!automatonIsSet) {
                    states = statesField.getText().split(", ");
                    symbols = symbolsField.getText().split(", ");
                    finalStates = finalStatesField.getText().split(", ");
                }
            }
        });
    }
}