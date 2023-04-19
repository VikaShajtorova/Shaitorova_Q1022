package homeWork3;

public class CreateClassWithOverloadedMethods {

    public String book(String name, String author) {
        return name;
    }
    public int book(int page){
        return page;
    }
    public short book(short year){
        return  year;
    }
    public void book(String author,short year,int page){

    }


}
