public class FirstOccurrence {
    public static void main(String[] args){

        int[] arr = {4,7,2,7,9,7};

        int target = 7;
        int index = -1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("First Occurence At Index "+index);
        }else{
            System.out.println("Element Not Found");
        }
    }
}
