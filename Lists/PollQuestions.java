package Lists;

public class PollQuestions {
    public static void main(String[] args) {
        Walrus a = new Walrus(1000,3);
        Walrus b;
        b = a;
        b.weight = 5;
        System.out.println(a);
        System.out.println(b);

        int x = 5;
        int y;
        y = x;
        x = 2;
        System.out.println("x is :"+ x );
        System.out.println("y is :"+ y );
    }
    public static class Walrus{
        public int weight;
        public double tuckSize;

        public Walrus(int w , double ts){
            weight = w;
            tuckSize = ts;
        }

    }
}
