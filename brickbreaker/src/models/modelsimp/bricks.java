package models.modelsimp;

public class bricks {
    int height;
    int width;
    double position;

    public bricks(int height, int width , double position) {
        this.height = height;
        this.width = width;
        this.position = position;
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
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }
}