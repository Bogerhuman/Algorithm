package Algorithm;

public class Search {
    //寻找第一个值等于给定值的数
    public static int B_search(int[] array,int size,int value){
        int low = 0;
        int high = size-1;
        while(low<=high){
            int mid = low+((high-low)>>1);
            if(array[mid]>value){
                high = mid - 1;
            }
            else if(array[mid]<value){
                low = mid + 1;
            }
            else{
                if((mid==0)||array[mid-1]!=value) return mid;
                else high = mid -1;
            }
        }
        return -1;
    }

    //寻找最后一个值等于给定值的数
    public static int B_search_last(int[] array,int size,int value){
        int low = 0;
        int high = size-1;
        while(low<=high){
            int mid = low+((high-low)>>1);
            if(array[mid]>value){
                high = mid - 1;
            }
            else if(array[mid]<value){
                low = mid + 1;
            }
            else{
                if((mid==size-1)||array[mid+1]!=value) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }

    //查找第一个值大于等于给定值的数
    public static int B_search_morethan_first(int[] array,int size, int value){
        int low = 0;
        int high = size -1;
        while(low<=high){
            int mid = low + ((high-low)>>1);
            if(array[mid]>=value){
                if((mid==0)||array[mid-1]<value) return mid;
                else{
                    high = mid-1;
                }
            }
            else{
                low = mid +1 ;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] array = {3,4,6,7,8,10};
        int b = B_search_morethan_first(array,6,5);
        System.out.println(b);
    }
}
