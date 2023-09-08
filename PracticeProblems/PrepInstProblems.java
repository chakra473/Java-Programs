package PracticeProblems;

public class PrepInstProblems {
    public boolean isPrime(int num,int i){
        if(num<i)
            return false;
        if(num==i)
            return true;
        if(num%i==0)
            return false;
        i=i+1;
        return isPrime(num,i);
    }
    public int palindrome(int num){
        int digit=0;
        int sum=0;
        while(num!=0){
            digit=num%10;
            sum=sum*10+digit;
            num=num/10;

        }
        return sum;
    }
    public void fibonocci_series(int num){
        int a=0,b=1;
        System.out.print(a+", "+b+", ");
        int nextNum;
        for(int i=2;i<num;i++){
            nextNum=a+b;
            a=b;
            b=nextNum;
            System.out.print(nextNum+", ");
        }
    }
    public int find_power(int base,int expo){
        int power=1;
        for(int i=0;i<expo;i++){
            power=power*base;
        }
        return power;
    }
    public double square_root(int num){
        double t;
        double sqrtroot=num/2;
        do
        {
            t=sqrtroot;
            sqrtroot=(t+(num/t))/2;
        }
        while((t-sqrtroot)!= 0);
        return sqrtroot;
    }
    public boolean perfect_square(int num){
        for(int i=1;i*i<=num;i++){
            if((num%i==0)&&(num/i==i))
                return true;
        }
        return false;
    }


    public int[] sort_array_ascending(int[] arr){
        int temp;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

}
