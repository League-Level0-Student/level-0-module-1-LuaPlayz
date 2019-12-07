
void setup() {
  size(500,500); 
  background(#FFFCFF);
    fill(#E8C98F);
ellipse(250,250,150,145);
fill(#E81A1A);
ellipse(250,250, 130, 125);
fill(#FFD500);
ellipse(250,250, 127,122);
}
void draw() {
 
PImage pepperoni = loadImage("pepperoni.png");
pepperoni.resize(17,17);
if (mousePressed){
  image(pepperoni, mouseX, mouseY);
}
}
