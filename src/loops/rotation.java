
package loops;

class rotation{
    public static void main(String[] args){
        int n=12345;
        int r=2;
        //left and right part
        int pow=(int)Math.pow(10,r);
        int left = n/pow;
        int right = n%pow;
        System.err.println(right+""+left);
        //count digit
        int copy=n;
        int count = 0;
        while(copy!=0){
            copy=copy/10;
            count++;
        }
        int num= right*(int)Math.pow(10,count-r)+left;
        System.out.println(num);
    }
}