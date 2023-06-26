import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bug bug = new Bug();
        addObject(bug,144,202);

        Cherry cherry = new Cherry();
        addObject(cherry,156,65);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,398,72);
        Cherry cherry3 = new Cherry();
        addObject(cherry3,372,271);
        Cherry cherry4 = new Cherry();
        addObject(cherry4,231,308);
        Cherry cherry5 = new Cherry();
        addObject(cherry5,509,168);
        Spider spider = new Spider();
        addObject(spider,526,47);
        Spider spider2 = new Spider();
        addObject(spider2,516,341);
    }
}
