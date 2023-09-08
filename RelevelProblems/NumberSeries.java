package RelevelProblems;

public class NumberSeries {
    int missing(int ...args){
        int total=0;
        int actualTotal=0;
        int len=args.length;
        int n=args[len-1];
        for (int ints:
             args) {
            actualTotal+=ints;
        }
        for(int i=args[0];i<=n;i++){
            total+=i;
        }
        System.out.println(args[0]);
        return total-actualTotal;
    }
}
