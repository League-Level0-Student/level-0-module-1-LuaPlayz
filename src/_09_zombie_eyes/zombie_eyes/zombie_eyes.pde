
void setup() {
  size(1200,600);
PImage face = loadImage("cat.png");
image(face, 0,0);
}
void draw() {
  fill(mouseX,mouseY,mouseX);
  ellipse(510,355,80,80);
  ellipse(700,300,80,80);
fill(#A20F0F);
ellipse(510,355,20,20);
ellipse(700,300,20,20);
}
