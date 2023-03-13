package Wk1;

public class Sort {

    public static void main(String[] args){
        Sort s1 = new Sort();
        int[] arr = {2, 1, 5, 7 ,3};
        int[] arr2 = {8, 5, 6, 1 , 2};
//        swapWithPlusOne(arr, 3);
//        s1.SelectionSort(arr);
//        s1.InsertionSort(arr); 
        s1.BubbleSort(arr);
        System.out.println("test case 2: ");
//        s1.SelectionSort(arr2);
//        s1.InsertionSort(arr2);
        s1.BubbleSort(arr2);
    }

    public static void swapWith(int[] arr, int index1, int index2){
        int temp;
        if(index1 > arr.length - 1 || index2 > arr.length - 1){
            System.out.println("out of bounds, exit early");
        }else{
            temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
        //print out swapped results
        for(int num: arr){
            System.out.print(num);
        }
        System.out.println();
    }
    public static void swapWithPlusOne(int[] arr, int index){
        int temp;
        if(index + 1 >= arr.length){
            System.out.println("j + 1 out of bounds, did not swap");
        }else{
            temp = arr[index + 1];
            arr[index + 1] = arr[index];
            arr[index] = temp;
        }
        //print out swapped results
        for(int num: arr){
            System.out.print(num);
        }
        System.out.println();
    }

    public void SelectionSort(int[] arr){
        //用一個變數儲存，從前面開始往後跑，抓取最大的數字的index, 後將最大的數字與最後尾巴的index的數字互換，
        for(int k = arr.length; k > 0; k--){
            int a = 0;
            for(int i = 1; i < k; i++){
                if(arr[i] > arr[a]){
                    a = i;
                }else{

                }
            }
            swapWith(arr, k - 1, a);
        }

    }

    //第一跟第二筆 比較小則往前差，後面往前比，比到比自己更小的停，插下去，跑一圈就插完
    public void InsertionSort(int[] arr){
        int temp;
        for(int k = 1; k < arr.length; k++){
            int j = k - 1;
            while(j >= 0){
                if(arr[j] > arr[j + 1]) {
                    swapWith(arr, j , j + 1);
                    j--;
                }else{
                    //break 因為前面都一定比較小 不用繼續比
                    break;
                }
            }
        }
    }

    //從最前面比到後面，兩個兩個比，比較大的繼續往後比，比到最後，最大的會在最後面，像是個泡泡一樣浮起來
    //big O 是 array length (n) ，跑 n 次 一定可以排完
    public void BubbleSort(int[] arr){
        for(int k = 0; k < arr.length; k++){
            for(int i = 1; i < arr.length; i++){
                //compare two int, swap if larger
                if(arr[i - 1] > arr[i]){
                    swapWith(arr, i, i - 1);
                }
            }
        }

    }


}
