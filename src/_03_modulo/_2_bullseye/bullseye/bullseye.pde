
void setup() {
 
  // set the size of your sketch
size(600,600);  
}

void draw() {

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
 for (int i = 0; i<4; i++){
   noStroke();
   ellipse(250,250 , 250, 250);
 }
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
