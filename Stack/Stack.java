package Stack;

public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size){
        this.maxSize=size;
        this.stackArray=new char[maxSize];
        this.top=-1;
    }
    public void push (char j) {
        try{
        top++;
        stackArray[top]=j;
        }catch (Exception e){
            top--;
            System.out.println("Stack is full");
        }
    }
    public char pop(){
        try {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }catch (Exception e){
            System.out.println("Stack is empty");
            return '0';
        }
    }
    public char peak(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (maxSize-1 == top);
    }
}
