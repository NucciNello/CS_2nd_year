import java.util.*;
public class Stack {
    int stackSize;
    int []values;
    int top;
    
    //initializing a stack
    public void stack(int size){
        stackSize = size;
        values = new int[stackSize];
        top = -1;
    }
    //isFull() function
    public Boolean isFull(int []values,int stackSize, int top){
        if((values.length - 1) == -1 ){
            return isEmpty(values, stackSize, top);
        }else{
            if((values.length - 1) == top ){
                return true;
            }else{
                return false;
            }
        }
    }
    
    //isEmpty() function
    public Boolean isEmpty(int []values, int stackSize, int top){
        if((values.length - 1) == -1 ){
            return true;
        }else{
            return false;
        }
    }

    //creation of the push() method
    public void push(int x, int []values,int top){
        if (isFull()){
            System.out.println("Error:The stack is full");
        }else{
            values[++top] = x;
        }
    }

     //creation of the pop() method
     public void pop(int x, int []values,int top){
        if (isEmpty()){
            System.out.println("Error:The stack is empty");
        }else{
            values[top--];
        }
    }

    //creation of the peek/top() method
    public int peek(int x, int []values,int top){
        if (isEmpty()){
            System.out.println("Error:The stack is empty");
            return -1;
        }else{
            return values[top];
        }
    }

    //creation of popAll() methods....i.e., method to delete all elements from the stack
    public void popAll(int []values,int top){
        values = new int[0];
        top = -1;
    } 
}
