package models.modelsimp;

public class bricks {
    private int height;
    private int width;
    private double pos_x;
    private double pos_y;

    public bricks(int length, int width , double pos_x , double pos_y) {
        this.height = height;
        this.width = width;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getPosition() {
        return pos_x;
    }

    public void setPosition(double position) {
        this.pos_x = position;
    }

    public double getPos_y() {
        return pos_y;
    }

    public void setPos_y(double pos_y) {
        this.pos_y = pos_y;
    }
}