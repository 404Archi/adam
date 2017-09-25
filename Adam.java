import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Adam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adam extends Actor
{
    int x=5;
    int koszyczek=0;
    
    public void kibel()
    {
        if(isTouching(Toaleta.class)) koszyczek=0;
    }

    public void jedzenie()
    {
        if (isTouching (Apple.class))
            if (koszyczek < 5)
            {
                removeTouching (Apple.class);
                koszyczek++;
            }
    }

    public void klawisze()
    {
        if(Greenfoot.isKeyDown("z"))x=x+5;
        if(Greenfoot.isKeyDown("x"))x=5;
        if(Greenfoot.isKeyDown("c"))x=x-5;
        if(Greenfoot.isKeyDown("d"))move (x);
        if(Greenfoot.isKeyDown("a"))move (-x);
        if(Greenfoot.isKeyDown("w"))
        {
            turn(-90);
            move (x);
            turn(90);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            turn(90);
            move (x);
            turn(-90);
        }
    }

    /**
     * Act - do whatever the Adam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        klawisze();
        jedzenie();
        kibel();
        

    }    
}
