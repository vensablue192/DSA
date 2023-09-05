public class RichestCustomerWealth{
    public static void main(String[] args){
        int[][] wealthInBanks = {{4,5} , {45,43} , {2,5} , {10,12}};
        int wealth = maximumWealth(wealthInBanks);
        System.out.println("max welth - " + wealth );
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] cashInBank: accounts){
            int totalCustCash=0;
            for (int cashInEachBank: cashInBank) {
                totalCustCash += cashInEachBank; 
            }
            maxWealth = Math.max(maxWealth,totalCustCash);
        }
        //check
        
        return maxWealth;
    }
}