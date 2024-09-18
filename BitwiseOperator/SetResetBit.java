package com.BitwiseOperator;

public class SetResetBit {
    public static void main(String[] args) {
        int n=86;
        int bit=5;
        System.out.println(resetBit(n,bit));
    }
    static int setBit(int n,int bit){
        return n | (1<<(bit-1));
    }
    static int resetBit(int n,int bit){
        int mask=~(1<<(bit-1));
        return n & mask;
    }
}
