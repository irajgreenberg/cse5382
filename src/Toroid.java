import processing.core.PApplet;


public class Toroid extends Shape{

	private int slices, stacks;
	private float thickness, radius;
	
	public Toroid(){
	}

	public Toroid(PApplet p,  float[] col, int slices, int stacks, float thickness, float radius){
		super(p, col);
		this.slices = slices;
		this.stacks = stacks;
		this.thickness = thickness;
		this.radius = radius;
		init();
	}
	public void init(){
		vecs = new Vector3[8];
		vecs_orig = new Vector3[8];
		
		
		
		for(int i=0; i<vecs.length; ++i){
			vecs_orig[i] = new Vector3();
			// for resetting transformation state
			vecs_orig[i].setTo(vecs[i]);
		}
		
		indices = new Tuple[12];
		// front left
	    indices[0] = new Tuple(7, 3, 6);
	    // front right
	    indices[1] = new Tuple(6, 3, 2);
	    // right left
	    indices[2] = new Tuple(5, 6, 2);
	    // right right
	    indices[3] = new Tuple(5, 2, 1);
	    // back left
	    indices[4] = new Tuple(4, 5, 1);
	    // back right
	    indices[5] = new Tuple(4, 1, 0);
	    // left left
	    indices[6] = new Tuple(7, 4, 0);
	    // left right
	    indices[7] = new Tuple(7, 0, 3);
	    // top left
	    indices[8] = new Tuple(4, 7, 5);
	    // top right
	    indices[9] = new Tuple(5, 7, 6);
	    // bottom left
	    indices[10] = new Tuple(2, 3, 0);
	    // bottom right
	    indices[11] = new Tuple(0, 1, 2);

	    faces = new Face[12];
	    for (int i=0; i<faces.length; i++) {
	      faces[i] = new Face(vecs[indices[i].elem0], vecs[indices[i].elem1], vecs[indices[i].elem2]);
	    }
	}

}
