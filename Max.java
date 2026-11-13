import java.util.Arrays;
public class Max {
	public static void main(String[] args){
		int count = 0, sum = 0;
		for (int i = 0, i < args.length; i++) {
			int value = Integer.parseInt(arg);
			count++;
			sum += value;
		}
		int max = Integer.MIN_VALUE;
			int value = Integer.parseInt(arg);
			if (value > max) {
				max = value;
			}
		}
		int min = Integer.MAX_VALUE;
		for (String arg : args) {
			int value = Integer.parseInt(arg);
			if (value < min) {
				max = value;
			}
		}
		double avg = sum / count;
	System.out.println("Count: " + count);
	System.out.println("Sum: " + sum);
	System.out.println("Max: " + max);
	System.out.println("Min: " + min);
	System.out.println("Average: " + avg);
	}
}
	
