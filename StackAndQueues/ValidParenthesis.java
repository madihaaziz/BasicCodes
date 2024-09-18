package com.StackAndQueues;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s="))())(";
        System.out.println(minInsertions(s));
    }

    public static int minInsertions(String s) {
        if(s.isEmpty()){
            return 0;
        }
        Stack<Character> stack=new Stack<>();
        int i=0;
        int c=0;
        char p1=' ';
        while(i<s.length()){
            if(!stack.isEmpty()){
                p1=stack.peek();
            }
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(ch);
                c++;
                i++;
            }
            else if((ch==')' && s.charAt(i+1)==')') && p1=='('){
                stack.pop();
                c--;
                i+=2;
            }
            else if((stack.isEmpty() && ch==')') || (!stack.isEmpty() && p1==')')){
                stack.push(ch);
                c++;
                i++;
            }
            else{
                i++;
            }
        }
        return c;
    }

    public static boolean isValid(String s) {
        if(s.length()==0)
            return true;
        if(s.length()==1 || s.length()%2!=0)
            return false;
        Stack<Character> stack=new Stack<>();
        stack.push(s.charAt(0));
        int i=1;

        while(i<s.length()){
            char p=' ';
            if(!stack.isEmpty())
                p=stack.peek();
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            if((ch==')' && p=='(') || (ch==']' && p=='[') || (ch=='{' && p=='}')){
                stack.pop();
            }
            i++;
        }
        return stack.isEmpty();
    }
}


