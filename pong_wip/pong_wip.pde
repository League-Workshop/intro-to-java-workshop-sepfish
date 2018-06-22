int ballX = 0;
int ballY = 1;
int speed = 1;
void setup (){
  size(800, 800);
  background(#E2FFB9);
}
void draw () {
  fill(#1BF5C0);
  noStroke();
  ellipse(ballX, ballY, 50, 50);
  
  if (ballY < 0){
    speed = -speed;
  }
  if (ballY > height) {
    speed = -speed;
  }
  
  rect(mouseX, mouseY, 50, 200);
  
  xPosition = xPosition * speed;
  yPosition = yPosition * speed;
  
  boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}

}