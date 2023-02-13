package arrays.stocksbuysell.anytimes;

import java.util.ArrayList;
import java.util.Arrays;

public class BuySell {
 class MinimaMaxima {  
    int minima;
    int maxima;
    MinimaMaxima(int min, int max) {
        minima = min;
        maxima = max;
     }
  }
  public int maximizeProfit(ArrayList<Integer> prices) {
    ArrayList<MinimaMaxima> buySellList = new ArrayList<MinimaMaxima>();
    int i = 0;
    int N = prices.size();
    while(i < prices.size()) {

       while(i < N - 1 && prices.get(i) > prices.get(i + 1)) {
                i++;
        }
        if(i == N - 1) {
              break;
        }
        int minima = prices.get(i);
        i++;
        while(i < N && prices.get(i) > prices.get(i - 1)) {
            i++;
        }
        int maxima = prices.get(i - 1);
        buySellList.add(new MinimaMaxima(minima, maxima));
  }
  if(buySellList.size() == 0) {
         return 0;
  }
  int maximumProfit = 0;
  for(MinimaMaxima buySellPair: buySellList) {
    maximumProfit += buySellPair.maxima - buySellPair.minima;
    }

       return maximumProfit;
};
public static void main(String[] args) {
       // TODO Auto-generated method stub
       BuySell bs = new BuySell();
       ArrayList<Integer> prices = new ArrayList<Integer>(Arrays.asList( 100, 180, 260, 310, 40, 535, 695));
       int maxProfit =  bs.maximizeProfit(prices);
       System.out.print("maximum profit ::" + maxProfit);
}

}