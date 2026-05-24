public class FirstUnsortedElement {
    //finding the first unsorted element in the array assuming the unsorted element exists in the array
    static int getUnsortedElem(int[] arr){
        for(int i=0;i<arr.length;i++){
         if(arr[i+1]<arr[i]){
             return arr[i+1];
         }

        }
        System.out.println("Sorted Array");
            return 0;
    }

    static void main(String[] args) {
    int[] arr={1,2,5,4,9};//in increasing partially sorted

        System.out.println(getUnsortedElem(arr));

    }
}
