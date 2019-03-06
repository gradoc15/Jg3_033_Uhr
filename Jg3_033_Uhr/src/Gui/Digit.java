/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

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
         icon = this.getClass().getResource("/img/0.png").getPath();
         number = 0;
         this.setIcon(new ImageIcon(icon));
//         this.setText(""+number);
         
    }
    
    public void setIcon(int z) throws Exception
    {
        if(z > 9 || z < 0)
            throw new Exception("Invalid number");
        icon = this.getClass().getResource("/img/"+z+".png").getPath();
        this.setIcon(new ImageIcon(icon));
        number = z;
//        this.setText(""+number);
    }
    
    public boolean addOne()
    {
        number++;
        System.out.println("hereIN");
        
        if(number == max)
        {
            number = 0;
            icon = this.getClass().getResource("/img/" + number + ".png").getPath();
            this.setIcon(new ImageIcon(icon));
            repaint();
            return true;
        }
//        this.setText(""+number);
        icon = this.getClass().getResource("/img/" + number + ".png").getPath();
        this.setIcon(new ImageIcon(icon));
        repaint();
        
        
        
        
        return false;
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public void setNumber(int number)
    {
        this.number = number;
        
        icon = this.getClass().getResource("/img/" + number + ".png").getPath();
        this.setIcon(new ImageIcon(icon));
        repaint();
    }
    
    
    
}
