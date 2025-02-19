public class RFunction {
    static int [][] Stock = new int[][] {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    public static void main(String[] args) {    
        System.out.println("=========================  PROFIT  =========================");
        untung();
        System.out.println("=======================  FLOWER DATA  ======================");
        stockall();
        System.out.println("=============  NEW ROYAL GARDEN 4 FLOWER DATA  =============");
        garden4();
    }

    static void untung () {
        for (int i = 0; i < Stock.length; i++) {
            int provit = (Stock [i][0] * 75000) + (Stock [i][1] * 50000) + (Stock [i][2] * 60000) + (Stock [i][3] * 10000);
            
            System.out.println("RoyalGarden " + (i+1) +" = " + provit);
        }
        System.out.println();
    }
    
    static void stockall () {
        for (int i = 0; i < Stock.length; i++) {

            System.out.println("RoyalGarden " + (i+1) +" => " + "Aglonema = " + Stock [i][0] + ", Keladi = " + Stock [i][1] + ", Alocasia = " + Stock [i][2] + ", Mawar = " + Stock [i][3]);

        }
        System.out.println();
    }

    static void garden4 () {
            System.out.println("RoyalGarden " + (4) +" => " + "Aglonema = " + (Stock [3][0] - 1) + ", Keladi = " + (Stock [3][1] - 2) + ", Alocasia = " + (Stock [3][2] - 0) + ", Mawar = " + (Stock [3][3] - 5));
        System.out.println();     
    }    
}
