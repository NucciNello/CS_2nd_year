class Stack {
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
    private Boolean isFull(){
        if((values.length - 1) == -1 ){
            return isEmpty();
        }else{
            if((values.length - 1) == top ){
                return true;
            }else{
                return false;
            }
        }
    }
    
    //isEmpty() function
    public Boolean isEmpty(){
        if((values.length - 1) == -1 ){
            return true;
        }else{
            return false;
        }
    }

    //creation of the push() method
    public void push(int x){
        if (isFull()){
            System.out.println("Error:The stack is full");
        }else{
            values[++top] = x;
        }
    }

     //creation of the pop() method
     public int pop(){
        if (isEmpty()){
            System.out.println("Error:The stack is empty");
            return -1;
        }else{
            return values[top--];
        }
    }

    //creation of the peek/top() method
    public int peek(){
        if (isEmpty()){
            System.out.println("Error:The stack is empty");
            return -1;
        }else{
            return values[top];
        }
    }


    //creation of popAll() methods....i.e., method to delete all elements from the stack
    public void popAll(){
        values = new int[0];
        top = -1;
    } 


    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.stack(5);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(7);
        myStack.pop();
        myStack.pop();

        System.out.println("Top element of stack is: " + myStack.peek());

     }
}


