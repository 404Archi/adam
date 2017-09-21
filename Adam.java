import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Adam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adam extends Actor
{
     int koszyczek=0;
    public void kibel()
         {
         if(isTouching(Toaleta.class)) koszyczek=0;
         }
  
    public void jedzenie()
    {
        if(isTouching(Apple.class))
        removeTouching(Apple.class);
    }
        public void klawisze()
    {
        if(Greenfoot.isKeyDown("d"))move (5);
        if(Greenfoot.isKeyDown("a"))move (-5);
        if(Greenfoot.isKeyDown("w"))
        {
            turn(-90);
            move (5);
            turn(90);
        }
         if(Greenfoot.isKeyDown("s"))
        {
            turn(90);
            move (5);
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
