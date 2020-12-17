package seleniumInterViewPreparation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.poi.ooxml.POIXMLProperties.CoreProperties;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFTextShape;

public class VerifyPPT_Text {
	public static void main(String[] args) {
	 String fileName="C:\\Users\\SENTHIL\\Desktop\\ppt.pptx";
	   FileInputStream inputStream;
	   try {
	      inputStream = new FileInputStream(fileName);
	   } 
	   catch (FileNotFoundException e)
	   {
	      e.printStackTrace();
	      return;
	   }
	   XMLSlideShow ppt;
	   try 
	   {
	      ppt = new XMLSlideShow(inputStream);
	   }
	   catch (IOException e) 
	   {
	      e.printStackTrace();
	      return;
	   }
	   readPPT(ppt);
	}
	public static void readPPT(XMLSlideShow ppt)
	{
	   CoreProperties props = ppt.getProperties().getCoreProperties();
	   String title = props.getTitle();
	   System.out.println("Title: " + title);
	   for (XSLFSlide slide: ppt.getSlides())
	   {
	      System.out.println("Starting slide...");
	      List<XSLFShape> shapes = slide.getShapes();
	      for (XSLFShape shape: shapes) {
	         if (shape instanceof XSLFTextShape)
	         {
	            XSLFTextShape textShape = (XSLFTextShape)shape;
	            String text = textShape.getText();
	            System.out.println("Text: " + text);
	         }
	      }
	   }    
	}   

}


