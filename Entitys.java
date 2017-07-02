package Entity;

import java.awt.Graphics;
import java.awt.Rectangle;



public abstract class Entitys {
	
	public int x,y,rotx,roty;
	public ID id;
	
	public Entitys(int x, int y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();

	public abstract void render(Graphics g);

	public abstract Rectangle GetBounds();
	


}
