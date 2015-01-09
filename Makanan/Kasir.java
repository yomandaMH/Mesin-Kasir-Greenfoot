import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class Kasir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kasir extends World
{
    public String[] kasirAngka = 
    {
        "9","8","7","/", "*", "+/-", "6", "5", "4", "-", "+", ".", "3", "2", "1", "0", "C", "="
    };
    
    public int x = 65;
    public int y = 260;
    public int z = 0;

    /**
     * Constructor for objects of class Kasir.
     * 
     */
    public Kasir()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        backMenu();

        screnKasir();
        
        inButton();
        ngecek();
        bayar();
        
    }
    
    private void backMenu()
    {
        keMenu kemenu = new keMenu();
        addObject(kemenu, 60, 550);
        keMenu kemenu1 = new keMenu();
        addObject(kemenu1, 160, 550);
    }

    
    public void screnKasir()
    {
        GreenfootImage image = getBackground();
        Color color = new Color (150, 150, 150, 255);
        image.setColor(color);
        image.fillRect(20, 50, 600, 150);
    }
    
    public void inButton()
    {
        for(int z = 0; z < kasirAngka.length; z++){
            if (x < 600){
                x = x;
                y = y;
            }
            else
            {
                x = 65;
                y = y + 100;
            }
            
            Actor button = new kasirButton();
            addObject(button, x, y);
            Actor textBox = new kasirLabel(kasirAngka[z]);
            addObject(textBox, x + 25,y);
            
            x = x + 100;
        }
    }
    
    private void ngecek()
    {
        kasirLabelCek labelcek = new kasirLabelCek();
        addObject(labelcek, 300, 130);
    }
    
    public void bayar()
    {
        Color color = new Color (50,100,100,200);
        GreenfootImage image = getBackground();
        image.setColor(java.awt.Color.WHITE);
        image.drawRect(650,100,340,490);image.drawRect(649,99,340,490);
        image.setColor(color);
        image.fillRect(650, 100, 340, 490);
        
        GreenfootImage Names = getBackground();
        Font font = getBackground().getFont(); 
        font = font.deriveFont(50.0f);
        getBackground().setFont(font);
        
        Names.setColor(java.awt.Color.WHITE);
        Names.drawString("", 660, 220);
        Names.drawString("", 670, 275);
        Names.drawString("", 660, 350);
        Names.drawString("", 670, 405);
        Names.drawString("", 660, 480);
        Names.drawString("", 670, 535);
    }
}
