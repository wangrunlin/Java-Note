package list;

import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(2,3);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);

        list.set(2,list.get(2)*10);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}

