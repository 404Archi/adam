import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    public boolean dotykaAdama()
    {
        return isTouching(Adam.class);
    }

    public boolean dotykaEwe()
    {
        return isTouching(Eva.class);
    }

    public void act() 
    {
        // Add your action code here.
    }    
}
