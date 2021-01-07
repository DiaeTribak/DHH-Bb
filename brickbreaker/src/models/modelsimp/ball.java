package models.modelsimp;

public class ball  {
    int positionX ;
    int positionY;
    int width;
    int height;


    public ball(int positionX,int positionY, int height , int width) {
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

///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    //////////////////////////////////////////////////////////////////////////////////////////

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}

