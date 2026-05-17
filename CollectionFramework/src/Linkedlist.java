import java.util.*;


//all the methods of the arraylist or the collection interface can used in this also
public class Linkedlist {
    static void main(String[] args) {
        LinkedList<Integer> linkedlist= new LinkedList<>();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        System.out.println(linkedlist);
        linkedlist.add(40); //adds element to the end
        System.out.println(linkedlist);

        //remove() -> removes last element from the linkedlist at a particular index
        linkedlist.remove(0);
        System.out.println(linkedlist);

        //addAll()-> adding element if list2 into linkedlist
        List<Integer> list2 = new LinkedList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);
        linkedlist.addAll(list2);  // linkedlist = linkedlist + list2 all elements
        System.out.println(linkedlist);

        //removeAll -> removes all elements of list2 from linkedlist
        linkedlist.removeAll(list2);
        System.out.println(linkedlist);
        //size()
        System.out.println(linkedlist.size());

        System.out.println("printing list2:"+list2);
        //clear()
        list2.clear();
        System.out.println(list2.size());

        //i want to traverse linkedlist using iterator()
        //hasnext()-> returns true if element exist further and moves to it
        //next()-> moves to the next element
        Iterator<Integer> iterator = linkedlist.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element in list1:"+iterator.next());
        }

        //get()-> gets element at a particular index and set()->updates the value at a particular index with new element

        List<Integer> list3 = new LinkedList<>();
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


        linkedlist.add(12);



        //sort()-> sorts arraylist in a particular order
        //Collection.sort(linkedlist), Collection.sort(linkedlist,Collection.reverseOrder)
        linkedlist.add(60);
        System.out.println("After adding 60 to linkedlist:"+linkedlist);
        linkedlist.add(12);
        linkedlist.add(5);
        //Collection ka reference use kar k sort karna hai
        Collections.sort(linkedlist);
        System.out.println("linkedlist after sort() :"+linkedlist);
        Collections.sort(linkedlist, Collections.reverseOrder());
        System.out.println("linkedlist after sort() but Collection.reverseOrder or Descending :"+linkedlist);


        //clone()-> creating another linkedlist of one linkedlist and all elements
        //only SHALLOW COPY CREATE

        //LinkedList<Integer> newlist = (LinkedList<Integer>) linkedlist.clone();
       // System.out.println("Clone newlist of linkedlist:"+newlist);

        //ensureCapacity()-> we can ensure the capacity of array linkedlist early so that the performance does not get affected
        LinkedList<Integer> marks = new LinkedList<>();
        //marks.ensureCapacity(100); // minimum capacity of 100 elements


        //isEmpty()-> returns if the collection is empty
        System.out.println("marks empty:"+marks.isEmpty());

        //indexOf()-> returns the index of any particular element
        System.out.println("index of 12 in linkedlist:"+ linkedlist.indexOf(12));


        //lastindexOf()-> returns the last index of any particular element of linkedlist or last occurence of the element
        System.out.println("Last index of 12 or last occurence:"+linkedlist.lastIndexOf(12));


        //addFirst() and addLast()  adds the elements to the first and last of linked list respectively
        list3.addFirst(10101);
        list3.addLast(20202);
        System.out.println("after adding 10101 to first and 20202 to last linkedlist:"+list3);

        //removeFirst() and removeLast() removes the first and last element of the linked list respectively
        list3.removeFirst();
        list3.removeLast();
        System.out.println("After removing 10101 from first and 20202 from last linkedlist:"+list3);

        //getFirst() and getLast() returns the first and last elements of the linkedlist
        System.out.println("first element:"+ list3.getFirst());
        System.out.println("last element:"+ list3.getLast());

        //peek()-> returns the head or the first element of the linkedlist
        System.out.println("HEAD of linked list:"+ ((LinkedList<Integer>) list3).peek());


        //poll()-> returns the first element and also removes the element
        // simillarly pollFirst() and pollLast() does the same for linkedlist
        System.out.println("before poll():"+list3);
        ((LinkedList<Integer>) list3).poll();
        System.out.println("after poll():"+ list3);
    }

}
