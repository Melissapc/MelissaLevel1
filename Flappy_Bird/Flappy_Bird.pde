int x = 120;
int y = 180;
int width = 20;
int height = 30;
double gravity = 0.2;
double flap=-30*gravity;
double birdyVelocity = 5 ;
void setup() { 
  size(500, 500);
}

void draw() {
   birdyVelocity+=gravity;
  y+=birdyVelocity;

  background(204, 034, 119);
  fill(220, 120, 420);
  ellipse(x, y, 55, 55); 

  y=y+(int)birdyVelocity ;
  fill(153, 89, 48);
rect(100, 100, 50, 200);
}
void mousePressed() {
  birdyVelocity+=flap;
}

