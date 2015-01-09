import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu1 extends Actor
{
    
    
    
    public void act() 
    {
        pilihM();
    }    
    
    public void pilihM()
    {
        if(Greenfoot.mouseClicked(this))
        {
            GreenfootImage HargaM = new GreenfootImage("harga1.png");          
            getWorld().getBackground().drawImage(HargaM,21,106);
        }
    }
}
