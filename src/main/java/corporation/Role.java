package corporation;

public enum Role {
    WORKER(1, "WORKER"),
    MANAGER(2, "MANAGER"),
    DIRECTOR(3, "DIRECTOR");

    private int number;
    private String position;

    Role(int number, String position){
        this.number = number;
        this.position = position;
    }

    public int getNumber(){
        return number;
    }

    public String getPosition(){
        return position;
    }

    @Override
    public String toString(){
        return getNumber() + getPosition();
    }




}

