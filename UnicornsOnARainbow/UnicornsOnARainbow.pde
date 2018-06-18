PImage rainbow;
  PImage unicorn;
void setup() {
  rainbow = loadImage ("rainbow.jpg");
    size (800, 600);
    rainbow.resize (width, height);
  unicorn = loadImage ("unicorn.png");
    unicorn.resize (100, 100);
}

void draw () {
  background (rainbow);
  image (unicorn, mouseX - 50, mouseY - 50);
}