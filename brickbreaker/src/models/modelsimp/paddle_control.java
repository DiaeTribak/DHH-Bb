package models.modelsimp;

public class paddle_control {
    private int pos_x;
    private int pos_y;
    private int height;
    private int width;

    public paddle_control(int pos_y , int pos_x, int height, int width) {
        this.pos_x = pos_x;
        this.height= height;
        this.width = width;
        this.pos_y = pos_y;
    }

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }
}