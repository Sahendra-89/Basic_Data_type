public class stockspricesellingandbying {
    public static int byAndSellstocks(int price[]) {
        int byPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < price.length; i++) {
            if (byPrice < price[i]) {// profit

                int profit = price[i] - byPrice;// today profit
                maxProfit = Math.max(maxProfit, profit);

            } else {
                byPrice = price[i];

            }

        }
        return maxProfit;
    }

    public static void main(String args[]){
        int  prices[]={ 7,1,5,3,6,4};
        System.out.println(  byAndSellstocks(prices));
    }
}
