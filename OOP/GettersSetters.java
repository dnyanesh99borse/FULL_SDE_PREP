public class GettersSetters{

    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("Red");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        //here as we'll change anything then using 'this' keyword it will print of the current object.
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }

}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String color){
        this.color = color;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}