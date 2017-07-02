package Engine;

import java.awt.Graphics;

import java.util.LinkedList;

import Entity.Entitys;

public class Handler {
	public LinkedList<Entitys> object = new LinkedList<Entitys>();

	public void tick() {
		for (int i = 0; i < object.size(); i++) {
			Entitys tempObject = object.get(i);

			tempObject.tick();
		}
	}

	public void render(Graphics g) {
		for (int i = 0; i < object.size(); i++) {
			Entitys tempObject = object.get(i);

			tempObject.render(g);

		}

	}

	public void addObject(Entitys object) {
		this.object.add(object);

	}

	public void removeObject(Entitys object) {
		this.object.remove(object);
	}

	public void removeEnemys() {

		this.object.clear();

	}
}
