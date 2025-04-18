public class VarargExample {

    public int sumNumber(int ... args){
        System.out.println("Argument length : " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }

    public static void main( String[] args ) {
        VarargExample ex = new VarargExample();

        int sum1= ex.sumNumber(2, 4);
        System.out.println("Sum Of Values   : " + sum1);
    }
}