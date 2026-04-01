class Asset{

    String name;
    int returnRate;

    Asset(String name,int returnRate){

        this.name=name;
        this.returnRate=returnRate;
    }
}

public class Problem4{

    static void quickSort(Asset arr[],int low,int high){

        if(low<high){

            int pi=partition(arr,low,high);

            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    static int partition(Asset arr[],int low,int high){

        int pivot=arr[high].returnRate;

        int i=low-1;

        for(int j=low;j<high;j++)
            if(arr[j].returnRate>pivot){

                i++;

                Asset temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        Asset temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    public static void main(String args[]){

        Asset arr[]={

            new Asset("Stock",15),
            new Asset("Bond",8),
            new Asset("Real Estate",12)

        };

        quickSort(arr,0,arr.length-1);

        System.out.println("Best Investment Return Rates:");

        for(Asset a:arr)
            System.out.println(a.name+": "+a.returnRate);
    }
}