package models.modelsimp;

public class rechtek {
    int position;
    int height;
    int width;

    public rechtek(int position, int height, int width) {
        this.position = position;
        this.height= height;
        this.width = width;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
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
}