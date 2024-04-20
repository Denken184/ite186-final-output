
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sisyphus
 */
public class Task extends JPanel{
    
    
    private JTextField taskTitle;
    private JCheckBox done;

    
    Task() {
        
        taskTitle = new JTextField("Your task here");
        done = new JCheckBox();
        
        this.setLayout(new BorderLayout(0, 20));
        this.setBackground(Color.yellow);
       
        taskTitle.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        done.setText("Done");

        this.add(taskTitle, BorderLayout.CENTER);
        this.add(done, BorderLayout.EAST);
        
    }
    
    public boolean getIsChecked() {
        return done.isSelected();
    }
    
}
