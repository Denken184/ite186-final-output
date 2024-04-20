
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sisyphus
 */
public class ButtonPanel extends JPanel{
    
    private JButton addTask;
    private JButton clearTask;
    
    ButtonPanel () {
        
        addTask = new JButton("Add task");
        clearTask = new JButton("Clear Done Task");
        
        this.setBackground(Color.green);
        
        this.add(addTask);
        this.add(clearTask);
    }
    
    public JButton getAddTask() {
        return addTask;
    }
    
    public JButton getClearTask() {
        return clearTask;
    }
}
