package Algorithm;

public class Sort {
    //Merge sort
    public static void merge_sort(int[] array, int size){
        merge_sort_c(array,0,size-1);
    }
    public static void merge_sort_c(int[] array, int left, int right){
        if (left>=right) return;
        int mid = (left+right)/2;
        merge_sort_c(array,left,mid);
        merge_sort_c(array,mid+1,right);
        merge(array,left,mid,right);

    }
    public static void merge(int[] array, int left, int mid, int right){
        int i = left;
        int j = mid+1;
        int k = 0;
        int[] tmp = new int[right-left+1];

        while((i<=mid) && (j<=right)){
            if(array[i]<=array[j]){
                tmp[k++] = array[i++];
            }else {
                tmp[k++] = array[j++];
            }
        }

        while(i<=mid) tmp[k++]=array[i++];
        while(j<=right) tmp[k++]=array[j++];

        for(int a=0; a<right-left+1 ; a++){
            array[left+a] = tmp[a];
        }
    }

    //Quick sort
    public static void quick_sort(int[] array,int size){
        quick_sort_c(array,0,size-1);
    }
    public static void quick_sort_c(int[] array, int left,int right){
        if(left>right) return;
        int tmp = array[right];
        int j = 0;
        for (int i = 0;i<right;i++){
            if(array[i]<tmp){
                int a1 = array[i];
                array[i] = array[j];
                array[j] = a1;
                j++;
            }
        }

        int a1 = array[j];
        array[j] = array[right];
        array[right] = a1;

        quick_sort_c(array,0,j-1);
        quick_sort_c(array,j+1,right);
    }


    public static void main(String args[]){
        int b[] = {11,44,23,67,88,65,34,48,9,12};
        quick_sort(b,b.length);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
