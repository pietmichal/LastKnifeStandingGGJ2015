package com.ggj2015.model;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class Knife {

	private Sprite sprite;
	
	private float x, y;
	private float velX, velY;
	
	private float velAtStart;
	
	private Player owner;
	
	public Knife(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	public void throwIt(){
		if(owner != null){
			int dir = owner.dir;
			
			
			if(dir == 0){
				velX = -(float) (velAtStart / Math.sqrt(2));
				velY = -(float) (velAtStart / Math.sqrt(2));
			}else if(dir == 1){
				velX = 0;
				velY = velAtStart;
			}else if(dir == 2){
				velX = (float) (velAtStart / Math.sqrt(2));
				velY = -(float) (velAtStart / Math.sqrt(2));
			}else if(dir == 3){
				velX = -velAtStart;
				velY = 0;
			}else if(dir == 4){
				// CENTER
			}else if(dir == 5){
				velX = velAtStart;
				velY = 0;
			}else if(dir == 6){
				velX = -(float) (velAtStart / Math.sqrt(2));
				velY = (float) (velAtStart / Math.sqrt(2));
			}else if(dir == 7){
				velX = 0;
				velY = velAtStart;
			}else if(dir == 8){
				velX = (float) (velAtStart / Math.sqrt(2));
				velY = (float) (velAtStart / Math.sqrt(2));
			}
		}
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getVelX() {
		return velX;
	}

	public void setVelX(float velX) {
		this.velX = velX;
	}

	public float getVelY() {
		return velY;
	}

	public void setVelY(float velY) {
		this.velY = velY;
	}

	
	
	
}