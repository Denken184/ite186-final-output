
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
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
public class AppFrame extends JFrame {

    ImageIcon windowIcon = new ImageIcon("logo.jpeg");
        
    NavigationBar navigationBar = new NavigationBar();
    List list = new List();
    ButtonPanel buttonPanel = new ButtonPanel();
    
    JButton addTaskButton = buttonPanel.getAddTask();
    JButton clearTaskButton = buttonPanel.getClearTask();
    
    AppFrame() {
        
        this.setTitle("To Do List");
        this.setResizable(true);
        this.setSize(480, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.setIconImage(windowIcon.getImage());
        
        addListeners();
        
        this.add(navigationBar, BorderLayout.NORTH);
        this.add(list, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
        revalidate();
        repaint();
    }

    private void setIconImage(ImageIcon windowIcon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void addListeners() {
        addTaskButton.addMouseListener(new MouseAdapter() {
            
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task);

                revalidate();
                repaint();
            }
        });
        
        clearTaskButton.addMouseListener(new MouseAdapter() {
            
            public void mousePressed(MouseEvent e) {
                list.clearDoneTask();
                revalidate();
                repaint();
            }
        });
        
    }
}
