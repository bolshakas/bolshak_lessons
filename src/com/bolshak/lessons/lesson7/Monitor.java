package com.bolshak.lessons.lesson7;

public class Monitor extends  Device {
    private int x;
    private int y;

    public Monitor(double cost, String id, String producer, int x, int y) {
        super(cost, id, producer);
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", x = " + x +
                ", y = " + y ;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        Monitor other = (Monitor)obj;
        return (this.x ==other.x) &&(this.y==other.y);
    }

    @Override
    public int hashCode() {
        int res = super.hashCode();
        res = res*31+x;
        res = res*31+y;
        return res;
    }
}
