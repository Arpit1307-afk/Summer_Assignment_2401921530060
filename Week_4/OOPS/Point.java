class Point{
    private int x;
    private int y;

    Point(){  //Default Constructor
        x=0;
        y=0;
    }

    Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x,int y) {
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println("("+x+","+y+")");
    }
}