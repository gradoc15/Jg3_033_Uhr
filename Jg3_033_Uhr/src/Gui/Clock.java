/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.GridLayout;
import java.time.LocalTime;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Clock extends JPanel implements Runnable
{
    private Digit secL;
    private Digit secR;
    
    private Digit minL;
    private Digit minR;
    
    private Digit hourL;
    private Digit hourR;
    
    public Clock(LocalTime time)
    {
        ini();
    }
    
    public Clock()
    {
        this.setLayout(new GridLayout(1, 8));

        ini();
    }
    
    public void ini()
    {
        secL = new Digit(6);
        secR = new Digit(10);     
        
        minL = new Digit(6);
        minR = new Digit(10);
        
        hourL = new Digit(3);
        hourR = new Digit(10);
        
        this.add(hourL);
        this.add(hourR);
        
        this.add(new JLabel(":"));
        
        this.add(minL);
        this.add(minR);
        
        this.add(new JLabel(":"));
        
        this.add(secL);
        this.add(secR);
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            try
            {
                Thread.sleep(1000);
                
                if(hourL.getNumber() == 2 && hourR.getNumber() == 4)
                {
                    hourL.setNumber(0);
                    hourR.setNumber(0);
                }
                
                System.out.println(hourL.getNumber());
                if(secR.addOne())
                {
                    if(secL.addOne())
                        if(minR.addOne())
                            if(minL.addOne())
                             if(hourR.addOne())
                                 hourL.addOne();
                }
  
                repaint();
            } catch (InterruptedException ex)
            {
                //min1.addOne();
               
                ex.printStackTrace();

            }
    }
        
        
    }
    
}
