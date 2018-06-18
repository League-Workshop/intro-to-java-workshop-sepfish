void setup(){
  size(800, 800);
}

void draw(){
  if(mousePressed){
    fill(205, 205, 245);
    ellipse(200, 200 , 100, 100);
    
  } else {
    fill(245, 145, 134);
    ellipse(100, 100, 100, 100);
  }
  ellipse(400, 400, 200, 200);

}