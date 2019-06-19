public class MultidimensionalArrays {
    public static void main(String[] args) {

        // Multidimensional Arrays
        String[][] MultiArrays = new String[10][5];

        /*Create a multidimensional array in IntelliJ that prints ten rows numbered 1-10
            and five columns numbered 1-5.
         */
        //solution 1
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                //System.out.println(MultiArrays[i][j]);
                //System.out.println("row[i] col[j]");
                //System.out.println("arr[" + i + "][" + j + "]");
                System.out.print("row[" + i + "]" +" "+ "col[" + j + "]");
            }
            System.out.println();
        }

        //solution 2
        System.out.println();
        System.out.println();
        int i = 0;
        while (i < 10) {
            for (int j = 0; j < 5; j++) {
                //System.out.println(MultiArrays[i][j]);
                //System.out.println("row[i] col[j]");
                //System.out.println("arr[" + i + "][" + j + "]");
                System.out.print("row[" + i + "]" +" "+ "col[" + j + "]");
            }
            i++;
            System.out.println();
        }


        //Create an array to display the multiplication tables for the values 1-12.
        //solution 1
        for (int x = 1; x <= 12; x++) {
            for (int y = 1; y <= 12; y++) {

                System.out.print(x*y);
                System.out.print('\t');
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        //solution 2
        int x = 1;
        do {
            for (int y = 1; y <= 12; y++) {

                System.out.print(x*y);
                System.out.print('\t');
            }
            x++;
            System.out.println();
        } while (x <= 12);
    }

}
