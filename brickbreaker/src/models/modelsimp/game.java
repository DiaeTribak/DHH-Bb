package models.modelsimp;

public class game {

        private bricks[][] brick;
        private int size = 8;
    public game() {
        this.brick= new bricks[this.size][this.size];

        for (int i=0 ; i< this.size; i++) {
            for (int j=0 ; j<this.size ;j++){
                this.brick[i][j] = new bricks("");
            }

        }
    }
    public bricks getbrick(int i, int j){
        return this.brick[i][j];

    }
    public String toString (){
        String result = "________________________________";
        result += "|";
        return result;
    }

}