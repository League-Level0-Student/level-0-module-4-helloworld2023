PImage donkey;
PImage tail;
void setup(){
 size(188,414);
donkey = loadImage("download.jpg");
tail = loadImage("donkeytail.png");
tail.resize(100,119);
}
void draw(){
  background(donkey);
  image(tail, mouseX, mouseY);
  rect(0,0,30,30);
  rect(70,200,30,30);
}