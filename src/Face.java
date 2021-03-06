import processing.core.PApplet;

public class Face {
	public Vector3 v0, v1, v2, n;
	
	// face colors
	public float[] col = {.4f, .5f, .45f, 1};
	
	public Face(){
		v0 = new Vector3();
		v1 = new Vector3();
		v2 = new Vector3();
		n = getNormal();
	}
	
	public Face(Vector3 v0, Vector3 v1, Vector3 v2) {
		this.v0 = v0;
		this.v1 = v1;
		this.v2 = v2;
		n = getNormal();
	}
	
	public Vector3 getNormal(){
		Vector3 temp1 = new Vector3();
		temp1.setTo(v1);
		
		Vector3 temp2 = new Vector3();
		temp2.setTo(v2);
				
		temp1.sub(v0);
		temp2.sub(v0);

		return temp1.cross(temp2);
	}
	
	
	// deep copy
	public void setTo(Face f){
		v0.setTo(f.v0);
		v1.setTo(f.v1);
		v2.setTo(f.v2);
		n = getNormal();
	}
	
	public void display(PApplet p){
		p.beginShape();		
		p.vertex(v0.x, v0.y);
		p.vertex(v1.x, v1.y);
		p.vertex(v2.x, v2.y);
		p.endShape(p.CLOSE);
	}
	
	public void display(PApplet p, float[] col){
		p.colorMode(p.RGB, 1.0f);
		p.fill(col[0], col[1], col[2], col[3]);
		p.beginShape();		
		p.vertex(v0.x, v0.y);
		p.vertex(v1.x, v1.y);
		p.vertex(v2.x, v2.y);
		p.endShape(p.CLOSE);
	}
	
}
