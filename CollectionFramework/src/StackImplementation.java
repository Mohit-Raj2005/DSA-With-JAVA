import java.util.*;

//stack can also call methods that are inherited from parent Collection and List interfaces
//push(), pop(),empty(), peek() and search() methods are stack specific methods that can also be used in stacks
public class StackImplementation {
    static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();


        //add()
        stack.add(10);
        stack.add(20);
        stack.add(30);
        System.out.println(stack);
        stack.add(40); //adds element to the end
        System.out.println(stack);

        //remove() -> removes last element from the stack at a particular index
        stack.remove(0);
        System.out.println(stack);

        //addAll()-> adding element if list2 into stack
        List<Integer> list2 = new Stack<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);
        stack.addAll(list2);  // stack = stack + list2 all elements
        System.out.println(stack);

        //removeAll -> removes all elements of list2 from stack
        stack.removeAll(list2);
        System.out.println(stack);
        //size()
        System.out.println(stack.size());

        System.out.println("printing list2:" + list2);
        //clear()
        list2.clear();
        System.out.println(list2.size());

        //i want to traverse stack using iterator()
        //hasnext()-> returns true if element exist further and moves to it
        //next()-> moves to the next element
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element in list1:" + iterator.next());
        }

        //get()-> gets element at a particular index and set()->updates the value at a particular index with new element
        System.out.println("Stack get(0):"+stack.get(0));
        System.out.println("Stack set(0,4000):"+stack.set(0,4000));
        System.out.println("Stack after set(0):"+stack);



        stack.add(12);


        //sort()-> sorts arraylist in a particular order
        //Collection.sort(stack), Collection.sort(stack,Collection.reverseOrder)
        stack.add(60);
        System.out.println("After adding 60 to stack:" + stack);
        stack.add(12);
        stack.add(5);
        //Collection ka reference use kar k sort karna hai
        Collections.sort(stack);
        System.out.println("stack after sort() :" + stack);
        Collections.sort(stack, Collections.reverseOrder());
        System.out.println("stack after sort() but Collection.reverseOrder or Descending :" + stack);




        //indexOf()-> returns the index of any particular element
        System.out.println("index of 12 in stack:" + stack.indexOf(12));


        //lastindexOf()-> returns the last index of any particular element of stack or last occurence of the element
        System.out.println("Last index of 12 or last occurence:" + stack.lastIndexOf(12));


        Stack<Integer> stack2 = new Stack<>();

        //push()-> adds element to the top or push to the top
        stack2.push(10);
        System.out.println(stack2);
        stack2.push(20);
        stack2.push(30);
        System.out.println(stack2);

        //pop()-> pops element from the top
        stack2.pop();
        System.out.println("Stack after pop() :" + stack2);

        //peek()-> returns the top element
        System.out.println("PEEK:"+stack.peek());

        //search()-> searches for any particular element in the stack returns -1 if not found and 1 based indexing if found
        System.out.println("Search 30:"+stack2.search(20));

        //empty()-> true if stack is empty else false
        System.out.println("stack2 empty:"+stack2.empty());

    }
}
