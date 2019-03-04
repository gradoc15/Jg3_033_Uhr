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
    private int number = 0;

    public Digit()
    {
         icon = this.getClass().getResource("/img/0.png").getPath();
         number = 0;
         this.setIcon(new ImageIcon(icon));
         
    }
    
    public void setIcon(int z) throws Exception
    {
        if(z > 9 || z < 0)
            throw new Exception("Invalid number");
        icon = this.getClass().getResource("/img/"+z+".png").getPath();
        number = z;
    }
    
    public void addOne()
    {
        number++;
        
        if(number == 10)
            number = 0;
        icon = this.getClass().getResource("/img/" + number + ".png").getPath();
    }
    
    
    
}
