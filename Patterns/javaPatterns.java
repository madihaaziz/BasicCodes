package com.Pattern;

public class javaPatterns {
    public static void main(String[] args){
        Diamond(5);
    }
    public static void Diamond(int n){
        for(int i=1;i<=n;i++){
            for(int sp=0;sp<n-i;sp++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int sp=0;sp<n-i;sp++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int sp=0;sp<2*(n-i);sp++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            for(int sp=0;sp<=(2*(i-1)+1);sp++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void NumberPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int sp=0;sp<n-i;sp++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void PalindromicPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int sp=0;sp<n-i;sp++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void floydTriangle(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void SolidRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int sp=0;sp<n-i;sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void ZeroOnePattern(int n){
        int k=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
//    public static void pattern14(int n){
//        for(int i=0;i<n;i++){
//            for(int sp=0;sp<i;sp++){
//                System.out.print(" ");
//            }
//            if(i==0){
//                for(int col=0;col<2*n-1;col++){
//                    System.out.print("*");
//                }
//                System.out.println();
//                break;
//            }
//            for(int col=0;col<2*n-1;col++){
//                if((i+col)%n==0)
//            }
//        }
//    }
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalCol=row>n?2*n-row:row;
            for(int col=0;col<totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int row = 1; row <=n ; row++) {
            for(int sp=1;sp<=n-row;sp++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i=1;i<=n;i++){
            for(int sp=0;sp<i-1;sp++){
                System.out.print(" ");
            }
            for(int col=n;col>=i;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int row=1;row<n;row++) {
            for(int spaces=0;spaces<n-row;spaces++){
                System.out.print("  ");
            }
            for (int col=row;col>=1;col--){
                System.out.print("* ");
            }
            for (int col=2;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern9(int n){
        for (int row=0;row<n;row++) {
            for(int spaces=0;spaces<row;spaces++){
                System.out.print("  ");
            }
            for (int col=row;col<n;col++){
                System.out.print("* ");
            }
            for (int col=n-1;col>row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for (int row = 1; row <=n ; row++) {
            for(int sp=0;sp<=n-row;sp++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for (int row = 0; row <n ; row++) {
            for(int sp=0;sp<row;sp++){
                System.out.print(" ");
            }
            for(int col=0;col<n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for(int row=0;row<2*n;row++){
            int totalSpace=row>=n?2*n-row:row+1;
            int totalCol=row>=n?row-n+1:n-row;
            for(int sp=0;sp<totalSpace;sp++){
                System.out.print(" ");
            }
            for(int col=0;col<totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern13(int n){
        for(int row=1;row<=n;row++){
            for(int sp=0;sp<n-row;sp++){
                System.out.print(" ");
            }
            if(row==n){
                for(int col=row;col>=1;col--) {
                    System.out.print("*");
                }
                for(int col=2;col<=row;col++){
                    System.out.print("*");
                }
                break;
            }
            for(int col=row;col>=1;col--){
                if(col==row){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            for(int col=2;col<=row;col++){
                if(col==row)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        int N=2*n-1;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int everyIndex=n-Math.min(Math.min(i,j),Math.min(N-i-1,N-j-1));
                System.out.print(everyIndex+" ");
            }
            System.out.println();
        }
    }
}
