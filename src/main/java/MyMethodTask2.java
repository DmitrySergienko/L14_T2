public class MyMethodTask2 {

    static final int SIZE = 5;

    public static void main(String[] args) {
        int[] arr;
        arr = new int[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * SIZE);
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println(myMethod(arr));

    }

    public static boolean myMethod(int[] anyArray) {
        int countOne = 0;
        int countTwo = 0;

        for(int a = 0; a < anyArray.length; a++){
            if(anyArray[a] == 1 ){
                countOne++;
            }
        }
        for(int a = 0; a < anyArray.length; a++){
            if(anyArray[a] == 4 ){
                countTwo++;
            }
        }
        boolean temp = false;
        if(countOne > 0 && countTwo > 0){
            temp = true;
        }
        return temp;
    }
}
