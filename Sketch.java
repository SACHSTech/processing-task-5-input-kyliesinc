import processing.core.PApplet;

public class Sketch extends PApplet {
  // flower variables
  public float petalSize = random(5, 25);
  public float petalDistance = petalSize / 1.5f;

  // cloud variables
  public int cloudX = 100;
  public int cloudY = 100;
  public int cloudW = 25;
  public int cloudH = 10;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(23, 184, 20);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    if (keyPressed){
      // change background when key pressed
      if(key == 'r'){
        background (156, 20, 20);
      }
      else if(key == 'g'){
        background (3, 255, 3);
      }
      else if(key == 'b'){
        background(2, 149, 240);
      }      
    } 
    
    // draw cloud
    stroke(0, 0, 0);
    fill(255, 255, 255);
    if (keyPressed){
      if (keyCode == UP){
        cloudY--;
      }
      else if (keyCode == DOWN){
        cloudY++;
      }
      else if (keyCode == LEFT){
        cloudX--;
      }
      else if(keyCode == RIGHT){
        cloudX++;
      }
    }
    ellipse(cloudX+cloudW, cloudY, cloudW, cloudH);
    ellipse(cloudX+(cloudW/2), cloudY-cloudH, cloudW, cloudH);
    ellipse(cloudX, cloudY, cloudW, cloudH);  
  }
 
  public void mouseClicked(){
    // make flower everytime the mouse is clicked
    stroke(0, 0, 0);
    fill(255, 255, 255);
    ellipse (mouseX + petalDistance, mouseY, petalSize, petalSize);  
    ellipse (mouseX - petalDistance, mouseY, petalSize, petalSize);  
    ellipse(mouseX, mouseY + petalDistance, petalSize, petalSize);
    ellipse(mouseX, mouseY - petalDistance, petalSize,petalSize);

    // yellow center of flower
    fill(255, 241, 51);
    ellipse (mouseX, mouseY, petalSize, petalSize);
}

  public void mouseDragged(){
    // make grass lines 
    stroke(1, 71, 20);
    fill(1, 71, 20);
    ellipse(mouseX, mouseY, 1, 10);
  }

  public void mouseWheel(){
    // draw tree
    stroke(61, 41, 0);
    fill(61, 41, 0);
    rect(mouseX, mouseY, 5, 40);
    
    stroke(1, 71, 20);
    fill(1, 71, 20);
    ellipse(mouseX, mouseY, 25, 25);

    stroke(1, 71, 20);
    fill(1, 71, 20);
    ellipse(mouseX - 7, mouseY +5, 25, 25);

    stroke(1, 71, 20);
    fill(1, 71, 20);
    ellipse(mouseX + 10, mouseY +5, 25, 25);
  }


  
  // define other methods down here.
}