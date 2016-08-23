int YPos=40;
int XPos=(int)random(475);
int score=0;


void setup(){  
size(500, 500);

}


void checkCatch(int x){
if (x > mouseX && x < mouseX+100)
      score++;
   else if (score > 0)
     score--;
println("Your score is now: " + score);
}



void draw(){
background(102, 187, 221);
fill( 000,102, 051);
YPos+=5;
ellipse(XPos, YPos, 40, 40);
if(YPos>475){
YPos=40;
XPos=(int)random(475);

}
fill(0);
rect(mouseX,450,70,45);
checkCatch(XPos);
}


