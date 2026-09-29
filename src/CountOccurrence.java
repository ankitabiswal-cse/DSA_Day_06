public class CountOccurrence {
    public static void main(String[] args){
        int[] arr = {3,4,5,6,7,8,9,10,9,78,9,89,9,90,9};

        int target = 9;
        int count = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println(target+" occurs "+count+ " times ");

    }
}
