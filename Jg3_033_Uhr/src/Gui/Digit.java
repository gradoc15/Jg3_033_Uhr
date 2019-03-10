/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class Digit extends JLabel
{
    private String icon = "";
    private int number = -1;
    
    private int max;

    public Digit(int max)
    {
        this.max = max;
        // icon = this.getClass().getResource("img/0.png").getPath();
         number = 0;
         this.setIcon(new ImageIcon("img/0.png"));
         this.setOpaque(true);
         this.setBackground(Color.black);
         
    }
    
    public void setIcon(int z) throws Exception
    {
        if(z > 9 || z < 0)
            throw new Exception("Invalid number");
        //icon = this.getClass().getResource("img/"+z+".png").getPath();
        this.setIcon(new ImageIcon("img/"+z+".png"));
        number = z;
    }
    
    public boolean addOne()
    {
        number++;
        
        if(number == max)
        {
            number = 0;
            update();
            
            return true;
        }
        
        update();
        
        return false;
    }
    
    public void update()
    {
        //icon = this.getClass().getResource("img/" + number + ".png").getPath();
        this.setIcon(new ImageIcon("img/"+number+".png"));
        repaint();
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public void setNumber(int number)
    {
        this.number = number;
        
        update();
        
        repaint();
    }
    
    
    
}
