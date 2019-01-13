import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_180723a extends PApplet {

PImage img;
int mosaWid = 30;
int mosaHei = 10;

public void setup() {
  
  img = loadImage("monariza.jpg");
  noStroke();
}

public void draw() {


  image(img,0 ,0);
  loadPixels();

  for (int i = 0; i < width; i += mosaWid) {
    for (int j = 0; j < height; j += mosaHei) {
      int c = pixels[j * width + i];
      // println(c);
      fill(c);
      rect(i, j, mosaWid, mosaHei);
    }
  }
}
  public void settings() {  size(343, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_180723a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
