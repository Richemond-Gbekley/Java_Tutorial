public class BMI {
     double weight;
     double height;

     double BMI;

    BMI(){
        weight = 50;
        height = 1.2;

    }
    public void setheight(double h){
      height = h;
    }
    public void setweight(double w){
      weight = w;

    }
    public double calBMI(){
       double BMI = weight/(height*height);
        return BMI;

    }
    public String remarks(){
        if(calBMI()<18.5)
            return "You are under weight";
        else if (calBMI()<25)
            return "You are normal";
        else if (calBMI()<30)
            return" You are over weight";
        else
            return "You are Obessed";

    }
}

