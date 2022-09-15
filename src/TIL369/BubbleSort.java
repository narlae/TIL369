package TIL369;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    Integer tmp = null;
    public ArrayList<Integer> sort(ArrayList<Integer> testData){
        for(int i=0; i<testData.size()-1; i++){
            boolean swap = false;

            for(int j=0; j<testData.size()-1-i;j++){
                if(testData.get(j)>testData.get(j+1)){
                    Collections.swap(testData,j,j+1);
                    swap = true;
                }
            }
            if(swap==false){
                break;
            }
        }
        return testData;
    }


    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            testData.add((int)(Math.random() * 100));
        }
        BubbleSort bSort = new BubbleSort();
        bSort.sort(testData);
        System.out.println(testData);
    }

}
