
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sisyphus
 */
public class NavigationBar extends JPanel implements ActionListener{
    
    private JLabel title = new JLabel("TO DO");
    private JButton creditButton = new JButton("Credits");
    
    NavigationBar(){
        
        
        
        this.setLayout(new BorderLayout());
        
        creditButton.addActionListener(this);
        
        this.add(title, BorderLayout.WEST);
        this.add(creditButton, BorderLayout.EAST);
    }
   
    
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == creditButton){
            JOptionPane.showMessageDialog(
                    null,
                    "Ken\nJandra\nAxel\nDenielle\n",
                    "Credits",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }
    
}


