import java.util.Random;

public class RandomNumberSumThreads {
    public static void main(String[] args) {
        int numIterations = 100; // Number of iterations

        for (int i = 1; i <= numIterations; i++) {
            // Create an instance of the RandomNumberGeneratorThread
            RandomNumberGeneratorThread randomNumberGeneratorThread = new RandomNumberGeneratorThread();

            // Create an instance of the NumberSumThread and pass the
            // RandomNumberGeneratorThread
            NumberSumThread numberSumThread = new NumberSumThread(randomNumberGeneratorThread);

            // Start both threads
            randomNumberGeneratorThread.start();
            numberSumThread.start();

            try {
                // Wait for the NumberSumThread to finish
                numberSumThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class RandomNumberGeneratorThread extends Thread {
    private int[] numbers;

    @Override
    public void run() {
        // Generate ten random numbers
        numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(101);
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }

    public int[] getNumbers() {
        return numbers;
    }
}

class NumberSumThread extends Thread {
    private RandomNumberGeneratorThread randomNumberGeneratorThread;

    public NumberSumThread(RandomNumberGeneratorThread randomNumberGeneratorThread) {
        this.randomNumberGeneratorThread = randomNumberGeneratorThread;
    }

    @Override
    public void run() {
        try {
            // Wait for the RandomNumberGeneratorThread to finish
            randomNumberGeneratorThread.join();

            // Compute the sum of the numbers
            int[] numbers = randomNumberGeneratorThread.getNumbers();
            int sum = 0;

            for (int number : numbers) {
                sum += number;
            }

            // Display the sum
            System.out.println("Sum: " + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
