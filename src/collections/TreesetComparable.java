package collections;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class Data implements Comparable<Data>, Comparator<Data> {
    int number;

    public Data(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Data o) {
        return number - o.number;
    }

    @Override
    public String toString() {
        return "" + this.number;
    }

    @Override
    public int compare(Data o1, Data o2) {
        return o2.number - o1.number;
    }
}

public class TreesetComparable {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Data d1 = new Data(1);
        Data d2 = new Data(2);
        Data d3 = new Data(3);

        // TreeSet<Data> ts = new TreeSet<>(d1); //works when Data implements Comparator
        TreeSet<Data> ts = new TreeSet<>();
        // ts.add(d2);
        ts.addAll(List.of(d1, d2, d3));
        System.out.println("INPUT: sort by comparable asc" + ts.toString());
        // higher
        System.out.println("Least Higher than the given: " + d2 + " is: " + ts.higher(d2).number);

        Data dl = new Data(2);
        Data d12 = new Data(3);
        Data d13 = new Data(1);
        Data d0 = new Data(0);
        TreeSet<Data> set = new TreeSet<>(dl);
        set.addAll(List.of(dl, d12, d13, d0));
        System.out.println("INPUT: sort by comparator desc" + set.toString());
        System.out.println("Least Higher than the given: " + dl + " is: " + set.higher(dl).number);
        //passing d0 will thrown NPE

    }
}