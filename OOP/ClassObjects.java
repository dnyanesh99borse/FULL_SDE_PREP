public class ClassObjects{
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(10);
        System.out.println(p1.tip);
        p1.color = "yellow";
        System.out.println(p1.color);
    }
}

class Pen{
    String color; 
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip  = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage; //cgpa

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}
