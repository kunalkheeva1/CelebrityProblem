public class CelebrityProblem {

    public static int celebrity(int [][] arr, int n){
        int i= 0;
        int j=n-1;
        while(i<j){
            if(arr[i][j] == 1){
                i++;
            }else{
                j--;
            }
        }
        int celeb =i;
        for(i=0; i<n)
    }



    public static void main(String[] args) {

    }
}
