public class SearchElementInArray {
    //searching for a particular element in an array
    //linear search
    static int searchElement(int[] arr,int key){
        for(int i=0;i<arr.length;i++){  //accessing each element of the array
            if(arr[i]==key){  //comparing each element with the key
                System.out.println(key+" Key Found at index:"+i);
                return 1;  //returns 1 if the key found
            }
        }
        System.out.println(key+" Not Found");
        return 0; // returns 0 if the key not found
    }
    static void main(String[] args) {
        int[] arr={1,2,3,4,45,32,89,100,55,5};
        searchElement(arr,89);  //finds 89 at the 6th index of the array
        searchElement(arr,20);  // could not find key 20 in the array


    }
}

