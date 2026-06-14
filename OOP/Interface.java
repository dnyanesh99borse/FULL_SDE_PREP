
interface Father{
    void property();
}

interface Mother{
    void talent();
}

class Child implements Father, Mother{
    //implemented father's abstract method
    public void property(){
        System.out.println("Father's property");
    }

    //implemented mother's abstract method
    public void talent(){
        System.out.println("Mother's talent");
    }
}

class Interface{
    public static void main(String[] args){
        Child c = new Child();
        c.property(); //Father's property
        c.talent(); //Mother's talent
    }
}