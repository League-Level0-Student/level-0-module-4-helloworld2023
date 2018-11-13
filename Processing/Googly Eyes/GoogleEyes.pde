PImage face;
void setup(){
  face = loadImage("download.jpg");
  size(792,573);
  face.resize(792,573);
  background(face);
}
void draw(){
  background(face);
  fill(255,255,255);
  ellipse(342,250,20,20);
  fill(255,255,255);
  ellipse(467,248,20,20);
  if(mouseX<338){
    mouseX=338;
  }
  if(mouseX>348){
    mouseX=348;
  }
  if(mouseY<248){
    mouseY=248;
  }
  if(mouseY>255){
    mouseY=255;
}
fill(0,0,0);
  ellipse(mouseX, mouseY,10,10);
  fill(0,0,0);
  ellipse(mouseX+125,mouseY-2,10,10);
}