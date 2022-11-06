package advance.tasks.grocery;

import javax.swing.*;

public class Nordin extends JFrame{

    private JPanel mainPanel;

    public Nordin(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

    }

    public static void main(String[] args) {


        JFrame jFrame = new Nordin("Glocery List");
        jFrame.setVisible(true);

    }

}
