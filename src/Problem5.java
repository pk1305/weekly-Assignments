public class Problem5 {

    static void linearSearch(String arr[],String target){

        int first=-1,last=-1;

        for(int i=0;i<arr.length;i++){

            if(arr[i].equals(target)){

                if(first==-1)
                    first=i;

                last=i;
            }
        }

        System.out.println(first+" "+last);
    }

    static int binarySearch(String arr[],String target){

        int low=0,high=arr.length-1;

        while(low<=high){

            int mid=(low+high)/2;

            if(arr[mid].equals(target))
                return mid;

            if(arr[mid].compareTo(target)<0)
                low=mid+1;

            else
                high=mid-1;
        }

        return -1;
    }

    public static void main(String args[]){

        String arr[]={"apple","banana","cherry","date","elderberry"};

        System.out.println("Linear Search for 'cherry':");
        linearSearch(arr,"cherry");

        System.out.println("Binary Search for 'date':");
        System.out.println(binarySearch(arr,"date"));
    }
}