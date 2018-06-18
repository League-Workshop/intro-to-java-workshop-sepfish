PImage mustache;
  PImage friend;
void setup() {
  friend = loadImage ("person.jpg");
    size (800, 600);
    friend.resize (width, height);
   mustache = loadImage ("mustache.png");
    mustache.resize (250, 100);
  
}

void draw() { 
  background (friend);
  
  if (mousePressed) {
    image(mustache, mouseX - 125, mouseY - 50);
  }else{
    background (friend);
    
  }
}