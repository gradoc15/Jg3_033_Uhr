
package Gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.time.LocalTime;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Clock extends JPanel implements Runnable
{
    private Digit secL;
    private Digit secR;
    
    private Digit minL;
    private Digit minR;
    
    private Digit hourL;
    private Digit hourR;
    
    private LocalTime time;
    
    public Clock(LocalTime time)
    {
        this.setLayout(new GridLayout(1, 8));
        this.time = time;
        ini();
        
        secR.setNumber(time.getSecond()%10);
        secL.setNumber(time.getSecond()/10);
        
        minR.setNumber(time.getMinute()%10);
        minL.setNumber(time.getMinute()/10);
        
        hourR.setNumber(time.getHour()%10);
        hourL.setNumber(time.getHour()/10);
    }
    
    public Clock()
    {
        this.setLayout(new GridLayout(1, 8));
        
        ini();
       
    }
    
    
    
    public void ini()
    {
        String icon = this.getClass().getResource("/img/blank.png").getPath();
        JLabel blank1 = new JLabel();
        JLabel blank2 = new JLabel();
        blank1.setIcon(new ImageIcon(icon));
        blank2.setIcon(new ImageIcon(icon));
        blank1.setOpaque(true);
        blank2.setOpaque(true);
        blank1.setBackground(Color.black);
        blank2.setBackground(Color.black);
        this.setOpaque(true);
        this.setBackground(Color.black);
        
        secL = new Digit(6);       
        secR = new Digit(10);     
        
        minL = new Digit(6);
        minR = new Digit(10);
        
        hourL = new Digit(3);
        hourR = new Digit(10);
        
        this.add(hourL);
        this.add(hourR);

        this.add(blank1);
        
        this.add(minL);
        this.add(minR);
        
        this.add(blank2);
        
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
                
                time.plusSeconds(1);
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
    
    public LocalTime getTime()
    {
        return time;
    }
    
}
