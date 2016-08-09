int YPos=40;
int XPos=(int)random(475);
void setup(){  
size(500, 500);

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
}


