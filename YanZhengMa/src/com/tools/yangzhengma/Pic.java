package com.tools.yangzhengma;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;

public class Pic {
	private char mapTable[]={'a','b','c','d','e','f',
			
							   'g','h','i','j','k','l',
							   'm','n','q','p','r','s','t',
							   'u','v','w','x','y','z','0','1',
							   '2','3','4','5','6','7','8','9'
							   };

   public String  getPic(int width,int height,OutputStream os) {
	   if (width<=0) {
		width=50;
	}
	   if (height<=0) {
		height=25;
	}
	   BufferedImage image=new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
	   Graphics graphics=image.getGraphics();
	   graphics.setColor(new Color(0xdcdcdc));
	   graphics.fillRect(0, 0, width, height);
	   String strEnsure="";
	   for (int i = 0; i <4; i++) {
		   strEnsure+=mapTable[(int) (mapTable.length*Math.random())];
	
	}
	   graphics.setColor(Color.black);
	   graphics.setFont(new Font("Atlantic Inline", Font.PLAIN, 18));
	   String string =strEnsure.substring(0, 4);
	   graphics.drawString(string,8,17);
	   Random random=new Random();
	   for (int i = 0; i < 150; i++) {
		int x=random.nextInt(width);
		int y=random.nextInt(height);
		graphics.drawOval(x, y, 1, 1);
	
	}
	   graphics.dispose();
	   try {
		ImageIO.write(image, "JPEG", os);
	} catch (IOException e) {
		return"";
	}
	return strEnsure;
}









}

