

import processing.core.PApplet;

import java.util.Arrays;

public class Controller extends PApplet {


	Shape cube;
	Light light0;
	Renderer renderer;

	public void setup() {
		size(800, 600);
		smooth(8);
		fill(100, 255);
		cube = new Cube(this);
		light0 = new Light(new Vector3(0, 0, 200), new float[]{.7f, .5f, .4f});
		renderer = Renderer.getInstance(this);
	}

	public void draw(){
		background(255);
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
