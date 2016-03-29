import ddf.minim.*;  
void setup() {
  size(width, height);
  minim = new Minim (this);
  sound = minim.loadSample("melizz.wav", 128); 
  backgroundImage = loadImage("lbb.jpg");
}
PImage backgroundImage;     
AudioSample sound;  
Minim minim;
int x =40;
int y =40;
int speedx=10;
int speedy = 15;
int width = 800;
int height = 800;
int pwidth = 200;
Ball ball = new Ball();
Paddle paddle = new Paddle();
Ball ball2 = new Ball();




void draw() {
  image(backgroundImage, 0, 0); 
  paddle.update(width, mouseX);
  ball.move(width, height, paddle);
  ellipse( ball.x, ball.y, 60, 70 );

  ellipse( ball2.x, ball2.y, 60, 70 );
  fill(051, 255, 238);
  stroke(85, 119, 255);
}

class Ball {
  int x = 50;
  int y= 60;
  int speedX = 20;
  int speedY=16;



  Ball() {
    x=(int)random(800);
    y=(int)random(800);
  } 


  void  move(int height, int width, Paddle paddle) {
    x=x+speedx;
    y=y+speedy;
    if (x>width) {
      speedx=-speedx;
      sound.trigger();
    }


    if (x<0) {
      speedx=-speedx;
      sound.trigger();
    }
    if (y>height) {
      speedy=-speedy;
      sound.trigger();
    }
    if (y<0) {
      speedy=-speedy;
      sound.trigger();
    }
  }
}

class Paddle {
  int x=150;
  int y=200;
  int xposition=x;
  int yposition=y;
  int paddlewidth=60;

  void update(int width, int mouseX) {

    rect(width-paddle.paddlewidth, 750, paddle.paddlewidth, 40);

    if (mouseX>width-pwidth) {

      rect(width-pwidth, 750, pwidth, 40);
    } else
      rect(mouseX, 750, pwidth, 40);


    if (x + 65/2>mouseX && x + 65/2 < mouseX + pwidth && y + 65/2 > y && y + 65/2 < 750+pwidth) {
    }
  }
}

