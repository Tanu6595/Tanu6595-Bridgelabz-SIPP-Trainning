package level3;
 import java.util.Random;

public class FootballTeamHeight {
 
    public static int[] generateHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150;  
        }

        return heights;
    }
 
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            min = Math.min(min, height);
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            max = Math.max(max, height);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11); 
 
        System.out.println("Player Heights (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
 
        System.out.println("\n\nTotal Sum of Heights: " + findSum(heights) + " cm");
        System.out.println("Mean Height: " + findMean(heights) + " cm");
        System.out.println("Shortest Player: " + findShortest(heights) + " cm");
        System.out.println("Tallest Player: " + findTallest(heights) + " cm");
    }
}
 
