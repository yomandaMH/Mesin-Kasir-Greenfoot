import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu3 extends Actor
{

    public void act() 
    {
        pilihM();
    }    
    
    public void pilihM(){
        if(Greenfoot.mouseClicked(this)){
            GreenfootImage HargaM = new GreenfootImage("harga3.png");          
            getWorld().getBackground().drawImage(HargaM,21,106);
        }
    }       
}
