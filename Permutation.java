import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {
    public static void main(String[] args) {
        if (args.length == 1) {
            int k = Integer.parseInt(args[0]);
            RandomizedQueue<String> rq = new RandomizedQueue<>();
            while (!StdIn.isEmpty()) {
                rq.enqueue(StdIn.readString());
            }
            for (int i = 0; i < k; i++) {
                StdOut.print(rq.dequeue() + "\n");
            }
        }
    }
}
