import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {


    JTextField nameTxt = new JTextField(10);
    JTextField ageTxt = new JTextField(2);
    JCheckBox male = new JCheckBox("Male");
    JTextArea output = new JTextArea(2, 30);
    JButton ok = new JButton("OK");


    public Main() {

        setLayout(new FlowLayout());
        setSize(600, 120);
        setTitle("Rail card eligibility");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new Label("Type your name:"));
        add(nameTxt);
        add(new Label("     Type your age:"));
        add(ageTxt);
        add(male);
        add(ok);

        ok.addActionListener(this);
        add(output);
        output.setEditable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String name = nameTxt.getText();
            int age = Integer.parseInt(ageTxt.getText());
            boolean isMale = male.isSelected();
            output.setText( new RailCard(isMale, name, age).toString());

        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Please enter an age",
                    "Error!", JOptionPane.ERROR_MESSAGE);
        }



    }
}