import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Button
{
    public PlayButton(){
        GreenfootImage imagen = getImage(); // Obtiene la imagen original
        int nuevoAncho = imagen.getWidth() / 5; // Doble del ancho original
        int nuevoAlto = imagen.getHeight() / 5; // Doble de la altura original
        imagen.scale(nuevoAncho, nuevoAlto); // Escala la imagen al nuevo tamaño
        setImage(imagen);    
    }
    public void act()
    {

    }
}