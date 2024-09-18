package com.StackAndQueues;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        //take care of isFull condition
        if(isFull()){
            int[] temp=new int[data.length*2];
            //copy the element in the new array of twice the size
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(item);
    }
}
