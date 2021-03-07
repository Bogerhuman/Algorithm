package Algorithm;

public class StringMatch {
    public static int kmp(char[]a,int n,char[] b, int m){
        int[] next = getNexts(b,m);
        int j = 0;
        for(int i = 0;i<n;i++){
            while (j>0&& a[i]!=b[j]){
                j = next[j-1]+1;
            }

            if(a[i]==b[j]){
                ++j;
            }
            if(j==m){
                return i-m+1;
            }
        }

        return -1;
    }

    public static int[] getNexts(char[] string,int length){
        int[] next = new int[length];
        next[0] = -1;
        int k = -1;
        for(int i =1;i<length;++i){
            while (k!=-1 && string[k+1]!= string[i]){
                k = next[k];
            }

            if(string[k+1]==string[i]) ++k;
            next[i] = k;
        }

        return next;
    }
}
