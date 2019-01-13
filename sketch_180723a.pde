PImage img;
int mosaWid = 30;
int mosaHei = 10;

void setup() {
  size(343, 500);
  img = loadImage("monariza.jpg");
  noStroke();
}

void draw() {


  image(img,0 ,0);
  loadPixels();

  for (int i = 0; i < width; i += mosaWid) {
    for (int j = 0; j < height; j += mosaHei) {
      color c = pixels[j * width + i];
      // println(c);
      fill(c);
      rect(i, j, mosaWid, mosaHei);
    }
  }
}
