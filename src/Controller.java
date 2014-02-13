

import processing.core.PApplet;

import java.util.Arrays;

public class Controller extends PApplet {


	Shape cube, cube2;
	Light light0;
	Renderer renderer;

	public void setup() {
		size(800, 600);
		smooth(8);
		noStroke();
		fill(.5f, 1);
		cube = new Cube(this, new float[]{.4f, .4f, .4f});
		cube2 = new Cube(this, new float[]{.4f, .4f, .4f});
		light0 = new Light(new Vector3(-5, 0, 100), new float[]{.6f, .6f, .6f});
		renderer = Renderer.getInstance(this);
		renderer.setAmbientLight(new float[]{0, 0, 0});
	}

	public void draw(){
		background(0);
		renderer.translate(new Vector3(2, 3, -40));
		renderer.rotate(new Vector3(0, -frameCount*PI/180, -frameCount*PI/360));
		renderer.scale(new Vector3(5, 5, 5));
		renderer.display(cube2);
		
		renderer.add(light0); // no implemented
		renderer.translate(new Vector3(2, 3, 40));
		renderer.rotate(new Vector3(0, frameCount*PI/180, -frameCount*PI/360));
		renderer.scale(new Vector3(10, 10, 20));
		renderer.display(cube);
		
		
	}

	public static void main(String args[]) {
		PApplet.main(new String[] {"Controller" });

	}


}
