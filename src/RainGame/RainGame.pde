//int score

void setup(){
size(500,screenheight);
  
  
  
}
int x=55;
int y=65;

int screenheight=500;
void draw(){
  y+=7;
background(000,119, 221);
fill(70,90);
  ellipse(x,y,20,43);
  
  stroke(120,60,100);
  if(y>screenheight){
    y=0;
    x=(int)random(500);
  }
  fill(100,50,100);
rect(mouseX, 480,  50, 50);
 
}


