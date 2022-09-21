package TIL369;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class GreedyAlgorithm {
    public void coinFunc(Integer price, ArrayList<Integer> coinList) {
        Integer totalCoinCnt = 0;
        Integer coinNum = 0;

        for (int index = 0; index < coinList.size(); index++) {
            coinNum = price / coinList.get(index);
            totalCoinCnt += coinNum;
            price -= coinNum * coinList.get(index);
            System.out.println(coinList.get(index)+"원: "+coinNum+"개");
        }
        System.out.println("총 동전 갯수"+totalCoinCnt);
    }

    public void knapsackFunc(Integer[][] objectList, double capacity) {
        double totalValue = 0.0;
        double fraction = 0.0;

        Arrays.sort(objectList, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return (o2[1]/o2[0])-(o1[1]/o1[0]);
            }
        });

        for (int index = 0; index < objectList.length; index++) {
            if ((capacity - (double) objectList[index][0]) > 0) {
                capacity -= (double) objectList[index][0];
                totalValue += (double) objectList[index][1];
                System.out.println("무게:" + objectList[index][0] + ", 가치:" + objectList[index][1]);
            }else{
                fraction = capacity / (double) objectList[index][0];
                totalValue += (double) objectList[index][1] * fraction;
                System.out.println("무게:" + objectList[index][0] + ", 가치:" + objectList[index][1]+",비율:" + fraction);
                break;
            }
        }
        System.out.println("총 담을 수 있는 가치:"+totalValue);
    }





    public static void main(String[] args) {
        GreedyAlgorithm gObject = new GreedyAlgorithm();
        ArrayList<Integer> coinList = new ArrayList<Integer>(Arrays.asList(500, 100, 50, 1));
        gObject.coinFunc(4720, coinList);

        Integer[][] objectList = { {10, 10}, {15, 12}, {20, 10}, {25, 8}, {30, 5} };
        gObject.knapsackFunc(objectList, 30.0);
    }
}
