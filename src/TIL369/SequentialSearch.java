package TIL369;

import java.util.ArrayList;

public class SequentialSearch {
    public int searchFunc(ArrayList<Integer> dataList, Integer item) {
        for (int index = 0; index < dataList.size(); index++) {
            if(item==dataList.get(index))
                return index;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            testData.add((int)(Math.random() * 100));
        }
    }
}
