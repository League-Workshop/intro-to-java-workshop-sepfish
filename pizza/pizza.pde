void setup() {
  size (800, 800);
  noStroke();
  fill(#F2DA95);
  ellipse (400, 400, 400, 400);
  fill(#BC490F);
  ellipse (400, 400, 350, 350);
  fill(#F7EE98);
  ellipse (400, 400, 340, 340);
}

void draw() {
  PImage pepperoni = loadImage ("pizza.gif");
  pepperoni.resize (10, 10);
  if (mousePressed && mouseX < 575 && mouseX > 175 && mouseY < 575 && mouseY > 175) {
    image (pepperoni, mouseX, mouseY);
  }
  
}