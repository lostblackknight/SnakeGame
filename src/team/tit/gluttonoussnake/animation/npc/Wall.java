package team.tit.gluttonoussnake.animation.npc;

import static team.tit.gluttonoussnake.constant.Constant.GRID_H;
import static team.tit.gluttonoussnake.constant.Constant.GRID_SIZE;
import static team.tit.gluttonoussnake.constant.Constant.GRID_W;
import static team.tit.gluttonoussnake.constant.Constant.WALL_H;
import static team.tit.gluttonoussnake.constant.Constant.WALL_W;

import java.awt.Point;
import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import team.tit.gluttonoussnake.animation.BaseObject;
import team.tit.gluttonoussnake.util.MyUtils;

public class Wall extends BaseObject {

	public Color color;
	ArrayList<Point> points = new ArrayList<Point>();

	public Wall() {
		init();
	}

	public Wall(int id) {
		this.id = id;

	}

	public Wall(int id, ArrayList<Point> points) {
		this.id = id;
		this.points = points;
	}

	@Override
	public void init() {
		super.init();
		setX(MyUtils.getRandomNumber(0, GRID_W) * GRID_SIZE);
		setY(MyUtils.getRandomNumber(0, GRID_H) * GRID_SIZE);
		setWidth(WALL_W);
		setHeight(WALL_H);
		setColor(Color.web("#999999"));
	}

	@Override
	public void draw(GraphicsContext gc) {

		if (points != null) {
			for (int i = 0; i < points.size(); i++) {
				gc.setFill(color);
				gc.fillRect(points.get(i).getX(), points.get(i).getY(), GRID_SIZE, GRID_SIZE);
			}
		}

	}

	@Override
	public void update() {

	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public ArrayList<Point> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}
}
