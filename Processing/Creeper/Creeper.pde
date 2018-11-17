PImage creeper;
int creeperX = 500;
int creeperY = 350;
void setup(){
  size(500,500);
  PImage greenbackground = loadImage("greenbackground.jpg");
  greenbackground.resize(500,500);
  background(greenbackground);
  creeper = loadImage("creeper.png");
  creeper.resize(20,20);
}
void draw(){
  image(creeper, creeperX, creeperY);
  if(mousePressed){
    if(isNear(creeperX, creeperY)){
      ellipse(mouseX, mouseY, 10,10);
      fill(255,0,0);
    }
    else{
      ellipse(mouseX, mouseY, 10, 10);
      fill(0,0,255);
  }
  if(mouseX==0&mouseY==0){
    ellipse(mouseX, mouseY, 10,10);
    fill(0,255,0);
  }
}
boolean isNear(creeperX,creeperY){
if (abs(creeperX - creeperY) < 10)
     return true;
else
     return false;
}
