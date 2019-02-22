
package Clases;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.HashMap;
import javax.imageio.ImageIO;

public class Dibuja extends Canvas {
BufferedImage imagen; 
HashMap listaimagenes = new HashMap();
    public void paint(Graphics grafico)
    {
      
        imagen = RetornarImagen("../Fondo.png");
        
        grafico.drawImage(imagen,0,0,this);
    }
   public BufferedImage cargarimagen(String imagen)
   {
        try
        {
            URL ruta = getClass().getResource(imagen);
            BufferedImage temp_image = ImageIO.read(ruta);
            return temp_image;
        }catch(Exception e)
        {
            System.out.println("No se pudo cargar la imagen"); 
            return null;
        }
   }
   public BufferedImage RetornarImagen(String imagen_buscar)
   {
       BufferedImage imagen_retornar = (BufferedImage)listaimagenes.get(imagen_buscar);
       if (imagen_retornar == null)
       {
           imagen_retornar = cargarimagen(imagen_buscar);
           listaimagenes.put (imagen_buscar,imagen_retornar);
       }
       return imagen_retornar;
   }
}
