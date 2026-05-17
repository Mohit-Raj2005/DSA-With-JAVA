import java.util.*;

public class Arraylist {
    static void main(String[] args) {
        //list arr collection -> interface
        //ArrayList-> concrete class... reference can be of any interface but the object will be of the concrete class
        ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> List = new ArrayList<>();
//        Collection<Integer> collection = new ArrayList<>();

         list.add(10);
         list.add(20);
         list.add(30);
        System.out.println(list);
        list.add(40); //adds element to the end
        System.out.println(list);

        //remove() -> removes last element from the list at a particular index
        list.remove(0);
        System.out.println(list);

        //addAll()-> adding element if list2 into list
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);
        list.addAll(list2);  // list = list + list2 all elements
        System.out.println(list);

        //removeAll -> removes all elements of list2 from list
        list.removeAll(list2);
        System.out.println(list);
        //size()
        System.out.println(list.size());

        System.out.println("printing list2:"+list2);
        //clear()
        list2.clear();
        System.out.println(list2.size());

        //i want to traverse list using iterator()
        //hasnext()-> returns true if element exist further and moves to it
        //next()-> moves to the next element
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element in list1:"+iterator.next());
        }

        //get()-> gets element at a particular index and set()->updates the value at a particular index with new element

        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
        list3.add(14);
        System.out.println("Element at 0 index in list3:"+list3.get(0));
        System.out.println("Before set List3:"+list3);
        list3.set(0, 1001);
        System.out.println("After set List3:"+list3);

        //contains()->checks if a particular element is present or not
        System.out.println("List3 contains 12:"+list3.contains(12));

        //toArray()-> returs an array of the pbject it arraylist, linkedlist, stack or vectors
        Object[] array = list3.toArray();
        for(Object obj:array){   // for each loop means for each obj present in array
            System.out.println(obj);
        }

        //sort()-> sorts arraylist in a particular order
        //Collection.sort(list), Collection.sort(list,Collection.reverseOrder)
        list.add(60);
        System.out.println("After adding 60 to list:"+list);
        list.add(12);
        list.add(5);
        //Collection ka reference use kar k sort karna hai
        Collections.sort(list);
        System.out.println("list after sort() :"+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("list after sort() but Collection.reverseOrder or Descending :"+list);


        //clone()-> creating another list of one list and all elements
        //only SHALLOW COPY CREATE

        ArrayList<Integer> newlist = (ArrayList<Integer>) list.clone();
        System.out.println("Clone newlist of list:"+newlist);

        //ensureCapacity()-> we can ensure the capacity of array list early so that the performance does not get affected
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100); // minimum capacity of 100 elements


        //isEmpty()-> returns if the collection is empty
        System.out.println("marks empty:"+marks.isEmpty());

        //indexOf()-> returns the index of any particular element
        System.out.println("index of 12 in list:"+ list.indexOf(12));

    }
}
