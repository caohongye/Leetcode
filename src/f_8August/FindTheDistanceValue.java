package f_8August;

public class FindTheDistanceValue {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        for(int i = 0 ; i < arr1.length; i++){
            boolean bol = true;
            for(int j = 0 ; j < arr2.length; j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    bol = false;
                    j=arr2.length;
                }
            }
            if(bol == true){
                res++;
            }
        }
        return res;
    }
}
