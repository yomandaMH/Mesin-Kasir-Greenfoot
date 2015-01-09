import greenfoot.*; 
import java.awt.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 

        isiMenu();
    }

    private void isiMenu()
    {
        keKasir kekasir = new keKasir() ;
        addObject(kekasir, 783, 552);
        
        Reset reset = new Reset() ;
        addObject(reset, 680, 553);
        
        Judul judul = new Judul() ;
        addObject(judul, 500, 50);
        
        GreenfootImage image = getBackground();
        Color color = new Color (200, 150, 200, 70);
        image.setColor(java.awt.Color.WHITE);
        image.drawRect(20,105,600,150);
        image.drawRect(19,104,602,152);
        image.setColor(color);
        image.fillRect(20, 105, 600, 150);
        
        GreenfootImage images = getBackground();
        Color colors = new Color (150, 250, 255, 50);
        image.setColor(java.awt.Color.WHITE);
        image.drawRect(630, 104, 360, 400);
        images.setColor(colors);
        images.fillRect(630, 104, 360, 400);
        
        Menu1 menu1 = new Menu1();
        addObject(menu1, 120, 350);
        Menu2 menu2 = new Menu2();
        addObject(menu2, 320, 350);
        Menu3 menu3 = new Menu3();
        addObject(menu3, 520, 350);
        Menu4 menu4 = new Menu4();
        addObject(menu4, 120, 500);
        Menu5 menu5 = new Menu5();
        addObject(menu5, 320, 500);
        Menu6 menu6 = new Menu6();
        addObject(menu6, 520, 500);
    }
    
    
}
