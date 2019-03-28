package com.bolshak.lessons.lesson7;

import java.util.Objects;

public  class Device {
    private double cost;
    private String id;
    private String producer;

    public Device(double cost, String id, String producer) {
        this.cost = cost;
        this.id = id;
        this.producer = producer;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ": cost = " + cost +
                ", id = " + id +
                ", producer = " + producer;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj==null || !(obj instanceof Device) ){
            return false;
        }
        Device other =(Device) obj;
      if (Double.compare(this.cost, other.cost) !=0){
          return false;
      }
      return (this.producer.equalsIgnoreCase(other.producer) && (this.id.equalsIgnoreCase(other.id)));
    }

    @Override
    public int hashCode() {
        int res =17;
        res *= 31+Double.hashCode(cost);
        res *= 31+producer.hashCode();
        return (res*31 + id.hashCode());

    }


}
