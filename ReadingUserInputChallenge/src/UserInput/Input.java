package UserInput;

public class Input {

    public static int sumOfTen(int[] usersNumbers){

        int sum = 0;

        for (int i = 0; i < 10; i++){
            int temp = usersNumbers[i];
                sum += temp;
        }
            return sum;
    }

}
