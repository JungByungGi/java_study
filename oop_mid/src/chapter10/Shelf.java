package chapter10;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf;

    public Shelf(){
        shelf = new ArrayList<String>(); // 생성자가 생성될 때 멤버변수를 생성하는 것이 좋다.
    }


    public int getCount(){
        return shelf.size();
    }
}
