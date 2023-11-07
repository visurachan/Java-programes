import java.util.Random;

public class Array {
    int[] scoreList;

    int size;
    int minimum;
    int index = 0;

    public void userInput() {
        size = new Random().nextInt(5, 10);
        scoreList = new int[size];
        for (int i = 0; i < size; i++) {
            scoreList[i] = new Random().nextInt(1, 100);
        }

    }

    public void display(int[] list) {
        System.out.print("Score List : ");
        System.out.print("{");
        for (int j = 0; j < size - 1; j++) {
            System.out.print(list[j] + ",");
        }
        System.out.println(list[size - 1] + "}");
    }

    public void listSorting() {
        //sortedList = new int[size];
        for (int i = 0; i < size-1; i++) {
            int placecounter=i;

            minimum = scoreList[i];
            int tempory= scoreList[i];


            for (int j = i + 1; j < size; j++) {
                if (scoreList[j]<minimum){
                    minimum = scoreList[j];
                    placecounter =j;
                }


            }
        scoreList[i]=minimum;
        scoreList[placecounter]=tempory;




        }



    }
}