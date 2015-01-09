import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class keMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class keMenu extends Actor
{
    /**
     * Act - do whatever the keMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int menu;
    public void act() 
    {
        KeMenu();
    }
    
    private void KeMenu()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
        }
    }
}
