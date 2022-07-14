public class CelebrityProblem {

    //celeb problem
    public static int celebrity(int [][] arr, int n){

        // get two pointers to revolve
        int i= 0;
        int j=n-1;
        // if one knows other then move forward
        while(i<j){
            if(arr[i][j] == 1){
                i++;
            }else{
                j--;
            }
        }

        // when i find celeb
        int celeb =i;
        for(i=0; i<n; i++){
            // celeb cannot know itself
            if(i!= celeb){

                // if someone does not know celeb and the celeb knows someone then its not celeb
                if(arr[i][celeb]==0 || arr[celeb][i] ==1){
                    return -1;
                }
            }
        }return celeb;
    }



    public static void main(String[] args) {

    }
}
