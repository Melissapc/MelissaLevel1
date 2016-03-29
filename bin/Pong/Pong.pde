import ddf.minim.*;  

void setup() {
size(800, width);
minim = new Minim (this);
sound = minim.loadSample("melizz.wav", 128); 
backgroundImage = loadImage("lbb.jpg");

}

PImage backgroundImage;     
AudioSample sound;  
Minim minim;
int x =40;
int y =80;
int speedx=10;
int speedy = 15;
int width = 800;
  int pwidth = 200;

 

void draw() {
  image(backgroundImage, 0, 0);  

  ellipse(x,y,60, 70);
  fill(051, 255, 238);
  stroke(85,119,255);
  
  x=x+speedx;
  y=y+speedy;
  if(x>799){
  speedx=-speedx;
  sound.trigger();  
}
if(x<0){
  speedx=-speedx;
  sound.trigger();  
}
 if(y>799){
  speedy=-speedy;
  sound.trigger();  
}
if(y<0){
  speedy=-speedy;
  sound.trigger();  
}

if(mouseX>width-pwidth){
  
rect(width-pwidth,750,pwidth,40);


}
else
rect(mouseX,750,pwidth,40);

if(x + 65/2>mouseX && x + 65/2 < mouseX + pwidth && y + 65/2 > y && y + 65/2 < 750+pwidth) {

}
}



