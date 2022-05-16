import java.util.Random;

public class TestDemo {
     int addPositive(int num1, int num2) {

        if (num1 > 0 && num2 > 0) {
            return num1 + num2;
        } else {
            throw new IllegalArgumentException("Both parameters must be positive!");
        }
    }
     int randomNumberSquared()
    {
        int i = getRandomInt();
        return i*i;
    }
    int getRandomInt() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }



}
