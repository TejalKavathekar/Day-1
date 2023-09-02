public class MultiArray{
    public static void main(String [] args){
       
        int [][] data = new int[4][3];

        data[0][0] = 21;
        data[1][0] = 22;
        data[2][0] = 23;
        data[3][0] = 24;


        data[0][1] = 25;
        data[1][1] = 26;
        data[2][1] = 27;
        data[3][1] = 28;



        data[0][2] = 29;
        data[1][2] = 30;
        data[2][2] = 31;
        data[3][2] = 32;

        for (int i = 0; i <4; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(" "+data[i][j]);
            }
            System.out.println();
        }



    }
}