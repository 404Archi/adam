import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eva extends Actor
{
    int koszyczek = 5;
   
    public void pobierzJablka()
    {
        if(isTouching(Drzewo.class)) koszyczek = 5;
    }

    public void klawisze()
    {
        if(Greenfoot.isKeyDown("right"))move (5);
        if(Greenfoot.isKeyDown("left"))move (-5);
        if(Greenfoot.isKeyDown("up"))
        {
            turn(-90);
            move (5);
            turn(90);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            turn(90);
            move (5);
            turn(-90);
        }
    }

    public void stawiaj ()
    {
        if(Greenfoot.isKeyDown("0"))
        {
            if(!isTouching(Apple.class))
            {
                World swiat;
                swiat = getWorld();
                int x,y;
                x=getX();
                y=getY();
                if (koszyczek > 0 )swiat.addObject( new Apple(), x, y);
                koszyczek--;
            }
        }
    }

    /**
     * Act - do whatever the Eva wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        klawisze();
        stawiaj();
        pobierzJablka();
        // Add your action code here.
    }    
}
