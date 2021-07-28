package list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

class Employee implements Comparable<Employee>, Iterable<String> {
    private  int id;
    private  String name;
    private  String[] favs;

    private  int bound=0;

    public Employee(int id, String name, String[] fav) {
        this.id = id;
        this.name = name;
        this.favs = fav;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getFavs() {
        return favs;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fav=" + Arrays.toString(favs) +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id,o.id);
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return bound < favs.length;
            }

            @Override
            public String next() {
                if (bound>=favs.length){
                    throw new NoSuchElementException("No more Element");
                }
                return favs[bound++];
            }
        };
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee(10001,"Zhang three",new String[]{"Run","Sleep"});
        for (String fav : e){
            System.out.println(fav);
        }
    }
}

