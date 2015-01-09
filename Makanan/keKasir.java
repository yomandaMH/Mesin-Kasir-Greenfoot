import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class keKasir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class keKasir extends Actor
{
   
    private int kasir;
    public void act() 
    {
        Kekasir();
    }
    
    private void Kekasir()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Kasir());
        }
    }
}
