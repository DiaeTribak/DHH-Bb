package models.modelsimp;

public class bouncing_ball {
    private int positionX ;
    private int positionY;
    private int width;
    private int height;


    public bouncing_ball(int positionX, int positionY, int height , int width) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width =width;
        this.height =height;
    }

    public int getPositionX() { return positionX; }
    public void setPositionX(int positionX) { this.positionX = positionX; }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getPositionY() { return positionY; }
    public void setPositionY(int positionY) { this.positionY = positionY; }

}

