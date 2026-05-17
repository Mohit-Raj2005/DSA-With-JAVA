
import java.util.*;

// All the methods of collection and list interface can be called in this vector as in linkedlist and arraylist
// similar to array list as size can be increased dynamically but Vectors are SYNCHRONISED
public class VectorImplementation {
    static void main(String[] args) {
        List<Integer> vectorlist = new Vector<>();
        vectorlist.add(10);
        vectorlist.add(20);
        vectorlist.add(30);
        System.out.println(vectorlist);
        vectorlist.add(40); //adds element to the end
        System.out.println(vectorlist);

        //remove() -> removes last element from the vectorlist at a particular index
        vectorlist.remove(0);
        System.out.println(vectorlist);

        //addAll()-> adding element if list2 into vectorlist
        List<Integer> list2 = new Vector<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);
        vectorlist.addAll(list2);  // vectorlist = vectorlist + list2 all elements
        System.out.println(vectorlist);

        //removeAll -> removes all elements of list2 from vectorlist
        vectorlist.removeAll(list2);
        System.out.println(vectorlist);
        //size()
        System.out.println(vectorlist.size());

        System.out.println("printing list2:" + list2);
        //clear()
        list2.clear();
        System.out.println(list2.size());

        //i want to traverse vectorlist using iterator()
        //hasnext()-> returns true if element exist further and moves to it
        //next()-> moves to the next element
        Iterator<Integer> iterator = vectorlist.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element in list1:" + iterator.next());
        }

        //get()-> gets element at a particular index and set()->updates the value at a particular index with new element

        List<Integer> list3 = new Vector<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
        list3.add(14);
        System.out.println("Element at 0 index in list3:" + list3.get(0));
        System.out.println("Before set List3:" + list3);
        list3.set(0, 1001);
        System.out.println("After set List3:" + list3);

        //contains()->checks if a particular element is present or not
        System.out.println("List3 contains 12:" + list3.contains(12));

        //toArray()-> returs an array of the pbject it arraylist, vectorlist, stack or vectors
        Object[] array = list3.toArray();
        for (Object obj : array) {   // for each loop means for each obj present in array
            System.out.println(obj);
        }


        vectorlist.add(12);


        //sort()-> sorts arraylist in a particular order
        //Collection.sort(vectorlist), Collection.sort(vectorlist,Collection.reverseOrder)
        vectorlist.add(60);
        System.out.println("After adding 60 to vectorlist:" + vectorlist);
        vectorlist.add(12);
        vectorlist.add(5);
        //Collection ka reference use kar k sort karna hai
        Collections.sort(vectorlist);
        System.out.println("vectorlist after sort() :" + vectorlist);
        Collections.sort(vectorlist, Collections.reverseOrder());
        System.out.println("vectorlist after sort() but Collection.reverseOrder or Descending :" + vectorlist);


        //clone()-> creating another vectorlist of one vectorlist and all elements
        //only SHALLOW COPY CREATE

        //Vector<Integer> newlist = (Vector<Integer>) vectorlist.clone();
        // System.out.println("Clone newlist of vectorlist:"+newlist);

        //ensureCapacity()-> we can ensure the capacity of array vectorlist early so that the performance does not get affected
        Vector<Integer> marks = new Vector<>();
        //marks.ensureCapacity(100); // minimum capacity of 100 elements


        //isEmpty()-> returns if the collection is empty
        System.out.println("marks empty:" + marks.isEmpty());

        //indexOf()-> returns the index of any particular element
        System.out.println("index of 12 in vectorlist:" + vectorlist.indexOf(12));


        //lastindexOf()-> returns the last index of any particular element of vectorlist or last occurence of the element
        System.out.println("Last index of 12 or last occurence:" + vectorlist.lastIndexOf(12));


        //addFirst() and addLast()  adds the elements to the first and last of linked list respectively
        list3.addFirst(10101);
        list3.addLast(20202);
        System.out.println("after adding 10101 to first and 20202 to last vectorlist:" + list3);

        //removeFirst() and removeLast() removes the first and last element of the linked list respectively
        list3.removeFirst();
        list3.removeLast();
        System.out.println("After removing 10101 from first and 20202 from last vectorlist:" + list3);

        //getFirst() and getLast() returns the first and last elements of the vectorlist
        System.out.println("first element:" + list3.getFirst());
        System.out.println("last element:" + list3.getLast());


    }
}
