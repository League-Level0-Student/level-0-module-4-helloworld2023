import ddf.minim.*;          
AudioSample woohooSound;        
boolean playSound = true;         
PImage donkey;
PImage tail;
boolean game=true;
void setup(){
 size(188,414);
donkey = loadImage("download.jpg");
tail = loadImage("donkeytail.png");
tail.resize(100,119);
Minim minim = new Minim(this);    
woohooSound = minim.loadSample("homer-woohoo.wav");
}
void draw(){
  if(dist(70,200,mouseX,mouseY)<30&&game){
   background(donkey);
   image(tail, mouseX, mouseY);
  }
  rect(0,0,30,30);
  rect(70,200,30,30);
  if(mousePressed){
    game=false;
    if(mouseX>40&mouseX<100&mouseY>170&mouseY<230){
     if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
    }
  }
} 
