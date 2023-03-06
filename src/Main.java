import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1(){
        System.out.println("Задача 1");
        int arrayOne[] = new int [3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;
        double arrayTwo[] = {1.57, 7.654, 9.986};
        int arrayThree[] = new int [] {95, 355, 498, 101, 1};
    }
    public static void task2(){
        System.out.println("Задача 2");
        int arrayOne[] = new int [3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;
        double arrayTwo[] = {1.57, 7.654, 9.986};
        int arrayThree[] = new int [] {95, 355, 498, 101, 1};

        for(int i = 0; i < arrayOne.length; i++){
            if (i == arrayOne.length - 1){
                System.out.println(arrayOne[i]);
                break;
            }
            System.out.print(arrayOne[i] + ", ");
        }

        for(int i = 0; i < arrayTwo.length; i++){
            if (i == arrayTwo.length - 1){
                System.out.println(arrayTwo[i]);
                break;
            }
            System.out.print(arrayTwo[i] + ", ");
        }

        for(int i = 0; i < arrayThree.length; i++){
            if (i == arrayThree.length - 1){
                System.out.println(arrayThree[i]);
                break;
            }
            System.out.print(arrayThree[i] + ", ");
        }
    }
    public static void task3(){
        System.out.println("Задача 3");
        int arrayOne[] = new int [3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;
        double arrayTwo[] = {1.57, 7.654, 9.986};
        int arrayThree[] = new int [] {95, 355, 498, 101, 1};

        for(int i = arrayOne.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.println(arrayOne[i]);
                break;
            }
            System.out.print(arrayOne[i] + ", ");
        }

        for(int i = arrayTwo.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.println(arrayTwo[i]);
                break;
            }
            System.out.print(arrayTwo[i] + ", ");
        }

        for(int i = arrayThree.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.println(arrayThree[i]);
                break;
            }
            System.out.print(arrayThree[i] + ", ");
        }
    }

    public static void task4(){
        System.out.println("Задача 4");
        int arrayOne[] = new int [3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i]++;
            }
        }
        System.out.println(Arrays.toString(arrayOne));
    }
}