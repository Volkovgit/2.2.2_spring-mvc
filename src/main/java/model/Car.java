package model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private int id;
    private String mark;
    private String model;

    public Car(){

    }

    public Car(String mark,String model){
        this.mark=mark;
        this.model=model;
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString(){
        return "{model = "+this.model+",mark = "+this.mark+"}";
    }

    public static List<Car> getCars(Integer carCount){
        List<Car> carArray = new ArrayList<>();
        for(int i =0; i<10;i++){
            carArray.add(new Car("Mark-"+i,"Model-"+i));
        }
        if(carCount!=null && carCount < 5 && carCount > 0) carArray = carArray.subList(0,carCount);
        return carArray;
    }
}
