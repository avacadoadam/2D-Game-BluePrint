package Engine;

import java.awt.Canvas;

import Graphics.Render;

public class Engine extends Canvas implements Runnable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public boolean running = true;
	Thread thread;
	Render render = new Render();
	int frames;
	
	
	public enum GameState {
		//Place game states such as pause death screen, start screen etc
	}
	
	public Engine(){
	
		start();
		
	}
	
	public synchronized void start() {
		
		thread = new Thread(this);
		thread.start();
		running = true;
	}

	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	
	
	
	public void run(){
		
		long lastTime = System.nanoTime();
		double amountofTicks = 60.0;
		double ns = 1000000000 / amountofTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		frames = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				update();
				delta--;
				System.out.println("asda");
			}
			if (running) {
				render();
				frames++;
			}
			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				//System.out.println("FPS: " + frames);
				frames = 0;

			}

		}
		
	}

	private void update() {
		//logic
	}

	private void render() {
		//graphics 
	}

}
