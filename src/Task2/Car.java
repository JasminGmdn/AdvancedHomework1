package Task2;
public class Car implements Comparable <Car> {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }


    public int compareTo(Car o) {
        int temp = this.speed - (o.speed);
        int temp1 = 0;
        int temp2 = 0;
        if (temp == 0) {
            temp1 = this.price - (o.price);
            return temp1;
        } else if (temp1 == 0) {
            temp2 = this.model.compareTo(o.model);
            return temp2;
        } else if (temp2 == 0) {
            int temp3 = this.model.compareTo(o.color);
            return temp3;
        } else {
            return temp;
        }


        // public int compareTo(Car o){
        //int temp = this.color.compareTo(o.color);
        //if(temp == 0 ){
        // return this.model.compareTo(o.model);
        //} else {
        //  return temp;
        //}
        //}
        //return this.model.compareTo((Car)o).model;

    }
}
