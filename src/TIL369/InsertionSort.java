package TIL369;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {
    public ArrayList<Integer> sort(ArrayList<Integer> datalist){
        for (int i = 0; i < datalist.size()-1; i++) {

            for (int j = i+1; j>0; j--) {

                if(datalist.get(j-1)>datalist.get(j)){
                    Collections.swap(datalist,j-1,j);
                }else{
                    break;
                }
            }
        }
        return datalist;
    }






    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int index = 0; index < 100; index++) {
            testData.add((int)(Math.random() * 100));
        }

        InsertionSort iSort = new InsertionSort();
        iSort.sort(testData);
        System.out.println(testData);
    }
}
