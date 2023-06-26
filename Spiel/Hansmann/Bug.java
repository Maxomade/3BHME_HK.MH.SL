import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bug extends Actor
{
    /**
     * Act - do whatever the Bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-5);  
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(5);  
        }
        eatCherry();
    }
    public void eatCherry()
    {
        if (isTouching(Cherry.class))
            removeTouching(Cherry.class);
    }
}
