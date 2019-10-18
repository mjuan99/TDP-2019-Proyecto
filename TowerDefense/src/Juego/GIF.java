package Juego;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;

public class GIF extends ImageIcon{
	ImageReader reader;
	int frames,actual;
	
	public GIF(String rutaImagen) {
		super();
		actual=0;
		try {
		    reader = ImageIO.getImageReadersByFormatName("gif").next();
		    File input = new File("C:\\Users\\mati\\eclipse-workspace\\algo\\src\\sprites\\enemigo1.gif");
		    ImageInputStream stream = ImageIO.createImageInputStream(input);
		    reader.setInput(stream);
		    frames = reader.getNumImages(true);
	        BufferedImage frame = reader.read(0);
	        this.setImage(frame);
		
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
