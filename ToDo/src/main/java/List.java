
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sisyphus
 */
public class List extends JPanel {
    
    private GridLayout layout = new GridLayout(10, 1);
    
    List () {
        this.setBackground(Color.red);
        
        
        // gap between components inside the grid
        layout.setVgap(5);

        this.setBackground(Color.gray);
        this.setLayout(layout);
        
    }
    
    public void clearDoneTask() {
        Component[] listItems = this.getComponents();
		
        for (int i = 0; i < listItems.length; i++) {

            if (listItems[i] instanceof Task) {
                if (((Task)listItems[i]).getIsChecked() == true) {
                        this.remove(listItems[i]);
                        
                }
            }
        }
    }
}
