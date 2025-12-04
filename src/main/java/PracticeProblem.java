public class PracticeProblem {

    public static void main(String[] args) {
        sum2D();
        sumRow(1);
        sumColumn(2);
    }

    public static int sum2D(){
        int[][] array2D = {
            { 1, 3, 5 },
            { 2, 4, 7 },
            { 3, 5, 6 }
        };

        int sum = 0;

        for(int i=0; i<array2D.length; i++){
            for(int j=0; j<array2D.length; j++){
                sum = sum+array2D[i][j];
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static int sumRow(int row){
        int[][] array2D = {
            { 1, 3, 5 },
            { 2, 4, 7 },
            { 3, 5, 6 }
        };
        
        int sum1 = 0;

        for(int j=0; j<array2D[row].length; j++){
            sum1 = array2D[row][j];   
        }

        System.out.println(sum1);
        return sum1;
    }

    public static int sumColumn(int column){
        int[][] array2D = {
            { 1, 3, 5 },
            { 2, 4, 7 },
            { 3, 5, 6 }
        };
        
        int sum2 = 0;

        for(int i=0; i<array2D[column].length; i++){
            sum2 = array2D[i][column];   
        }

        System.out.println(sum2);
        return sum2;
    }
}