
//we will also have to implement the compareto() method
//we will have to implement the comparable interface to sort or perform specific action and methods of custom objects
public class Student2 implements Comparable<Student2>{
    public String name;
    public int age;
    public int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Student2(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    //this method is called for current object
    @Override
    public int compareTo(Student2 that) {
      //we will define our sorting logic
        //sort on the basis of age
        if (this.age == that.age){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;

    }


}
