package models.modelsimp;

public class bricks { ;
    private String value;
;

    public bricks(String value) {

        this.value = value;
    }
    public boolean isSet() {
        return this.value.length()>0;
    }
    public String toString() {
        if(isSet()){
            return this.value;

        }else {
            return "___";
        }
    }
    public String getValue() {
        return value;
    }
}

