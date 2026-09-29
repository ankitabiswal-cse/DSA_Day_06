public class SearchAnElement {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,8,9,10,25,35,45,55};

        int target = 10;
        int index = -1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("Element found At Index"+index);
        }else{
            System.out.println("Element Not Found");
        }
    }
}
