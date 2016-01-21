package p1;

public class Main {

    public static void main(String[] args) {
        String [] names = {"John ", "Jill ", "Jane ", "Jorge "};
        String [] tests = {"Names ", "Test 1 ", "Test 2 ", "Test 3 ", "Average"};
        double [][] grades = {
                {85, 90, 80},
                {86, 95, 82},
                {80, 90, 89},
                {88, 97, 90}};

        for(String info : tests)
            System.out.print(info + "\t");
        System.out.println();
        for(String name : names)
            System.out.println(name);
        for(int r = 0; r < 4; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("\t" + grades[r][c]);
            }
            System.out.print("\t" + ((grades[r][0] + grades[r][1]
                    + grades[r][2]) / 3));
            System.out.println();
        }
        System.out.print("Average");
        for(int r = 0; r < 4; r++)
            for(int c = 0; c < 3; c++){
                System.out.print("\t" + (grades[r][c] + grades[r + 1][c]
                        + grades[r + 2][c] + grades[r + 3][c])/4);
            }

    }
}
