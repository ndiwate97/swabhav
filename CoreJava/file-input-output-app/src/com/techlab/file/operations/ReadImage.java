package com.techlab.file.operations;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Base64;

import javax.imageio.ImageIO;

public class ReadImage {
	public static void main(String args[]) throws Exception{
		/*
		 * BufferedImage image1 = ImageIO.read(new
		 * File("C:\\swabhav\\CoreJava\\file-input-output-app\\sample.jpg"));
		 * ByteArrayOutputStream bos = new ByteArrayOutputStream();
		 * ImageIO.write(image1, "jpg", bos ); // byte [] data1 = bos.toByteArray();
		 * 
		 * String encodedImage = Base64.encode(bos.toByteArray());
		 * System.out.println(encodedImage);
		 */
	      
		BufferedImage image = ImageIO.read(new File("favicon.png"));
	     ByteArrayOutputStream baos = new ByteArrayOutputStream();
	     ImageIO.write(image, "png", baos);
	     String encodedImage = Base64.encode(baos.toByteArray());
	     System.out.println(encodedImage);
	   }
}
