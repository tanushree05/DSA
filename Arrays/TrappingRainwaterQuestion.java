package Arrays;
/* Question - Trapping Rainwater
  Given a non -negative integer representing an elevation(height) map where the width of each bar is 1 .
  Compute how much water it can trap after raining.
 height={4,2,0,6,3,2,5};
  Solution : 




 */

class TrappingRainwaterQuestion{
    public static void trappingWater(int num[]){
         //step 1- find maxleft array

         int maxleft[]=new int[num.length];
         maxleft[0]=num[0];
         for(int i=1;i<num.length;i++){
            maxleft[i]=Math.max(num[i],maxleft[i-1]);
         }

         //step 2- find maxright array

         int maxright[]=new int[num.length];
         maxright[num.length-1]=num[num.length-1];
         for(int j=num.length-2;j>=0;j--){
            maxright[j]=Math.max(num[j], maxright[j+1]);
         }
         //find water line and calculate trapped water 
         int tp=0;
        for(int i=0;i<num.length;i++){
         int waterline=Math.min(maxleft[i],maxright[i]);
         tp+=waterline-num[i];
         
        }
       System.out.print("Trap water after raining is :"+tp);

    }
    public static void main(String[] args) {
        int num[]={4,2,0,6,3,2,5};
        trappingWater(num);
    }
}