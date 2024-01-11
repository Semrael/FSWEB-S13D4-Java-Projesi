package com.workintech.encapsulation;

public class Point {
    private int x;
    private int y;

    public int getX(){

    }
    public void setX(int y){}
    public int getY(){}

    public void setY(){}

    //distance
    public double getDistance(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public double getDistance(Point p){
        if(p==null){
            System.out.println("p object cannot be null!");
            return 0;
        }
        //return Math.sqrt(Math.pow((x-p.x),2)+Math.pow((y-p.y),2));
         return getDistance(p.x,p.y);//yukarıdaki yerine distance aşağıda oluşturduğumuz metotla çağırabiliriz

    }

    public double getDistance(int a ,int b){
        return Math.sqrt(Math.pow(getX()-a,2)+Math.pow(getY()-b,2));
    }
}
