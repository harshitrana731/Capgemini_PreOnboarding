public class H1 {

        public static void pattern4(int n) {

            int i=n;
            while(i>=1){
                int j=1;
                while(j<=i){
                    System.out.print("*");
                    j=j+1;
                }
                System.out.println();
                i=i-1;

            }

        }

    public static void main(String[] args) {
        int n=5;
        pattern4(n);
    }
    }

