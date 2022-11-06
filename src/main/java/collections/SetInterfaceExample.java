package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {

        //HashSet
        HashSet<String> names = new HashSet<>();
        //Add Elements
        names.add("John");
        names.add("Bob");
        names.add("Mike");
        names.add("Anna");

        names.add("Anna");

        //Printout of elements
        System.out.println(names);

        //Remove element
        names.remove("Anna");
        System.out.println(names);

        //Size
        System.out.println(names.size());

        //Contains
        System.out.println(names.contains("Mike"));
        System.out.println(names.contains("Anna"));

        //Iterate
        for (String name:names) {
            System.out.println(name);
        }

        System.out.println();
        Iterator<String> i = names.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        //Examole2
        HashSet<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);
        System.out.println("intSet1: "+ intSet1);

        HashSet<Integer> intSet2= new HashSet<>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);
        System.out.println("intSet2: "+intSet2);

        // Find union
        HashSet<Integer> union = new HashSet<>(intSet1);
        System.out.println("Union before: " + union);
        union.addAll(intSet2);
        System.out.println("Union after: " + union);

        //Find intersection
        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("Intersection: " + intersection);

        //Find difference for intSet1
        HashSet<Integer> difference = new HashSet<>(intSet1);
        difference.removeAll(intSet2);
        System.out.println("Difference for intSet1: " + difference);

        //Find difference for intSet2
        HashSet<Integer> difference1 = new HashSet<>(intSet2);
        difference1.removeAll(intSet1);
        System.out.println("Difference for intSet2: " + difference1);

        //All differences
        HashSet<Integer> diffAll = new HashSet<>(difference);
        diffAll.addAll(difference1);
        System.out.println("All differences: "+ diffAll);

        //LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Estonia");
        linkedHashSet.add("Latvia");
        linkedHashSet.add("Italy");
        linkedHashSet.add("Sweden");

        System.out.println(linkedHashSet);

        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);







    }
}
