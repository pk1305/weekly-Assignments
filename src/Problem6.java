public class Problem6 {

    static void floorCeiling(int arr[],int target){

        int floor=-1,ceil=-1;

        for(int x:arr){

            if(x<=target)
                floor=x;

            if(x>=target){

                ceil=x;
                break;
            }
        }

        System.out.println("Floor="+floor);
        System.out.println("Ceiling="+ceil);
    }

    public static void main(String args[]){

        int arr[]={10,25,50,100};

        floorCeiling(arr,30);
    }
}
