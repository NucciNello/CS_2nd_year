class ListStack {
    public ListStack next;
    static int value;

    //CONSTRUCTORS
    //Constructor of the 1st Node
    public ListStack(int x, ListStack n){
        value = x;
        next = n;
    }
    //Constructor of the linked 2nd Node
    public ListStack(int y){
        value = y;
        next = null;
    }


    //FUNCTIONS TO MANIPULATE
    //setValue() method
    //sets the value or element stored in this Node/ListStack
    public void setValue(int element){
        value = element;
        //data = element;
    }

    //getValue() method
    //returns the value or element stored in a Node/ListStack 
    public int getValue(){
        return value;
    }

    //setNext() Node method
    //sets the Node/ListStack that follows this one
    public void setNext(ListStack nextNode){
        next = nextNode;
    }

    //getNext() Node method
    //returns the Node/ListStack that follows this one
    public ListStack getNext(){
        return next;
    }

    //SUBCLASS THATA INHERITS FROM THE PARENT CLASS ListStack
    static class StackRefBased{
        static ListStack top;

        public StackRefBased(){
            top = null;
        }

        static Boolean isEmpty(){
            return top == null;
        }
    
        static int pop(){
            if (!isEmpty()){
                ListStack temp = top;
                top = top.getNext();
                value--;
                return temp.getValue();
            }else{
                System.out.println("Error: the stack is empty!");
                return -1;
            }
        }
    
        static int peek(){
            if (!isEmpty()){
                return top.getValue();
            }else{
                System.out.println("Error: the stack is empty!");
                return -1;
            }
        }
    
        //Adds the specified element to the top of this stack
        static void push(int element){
            ListStack temp = new ListStack(element);
            temp.setNext(top);
            top = temp;
            // value++;
        }
    }


    //USING THE STACK CLASS or IMPLEMENTATION
    public static void main(String[] args) {
        StackRefBased stack = new StackRefBased();

        StackRefBased.push(1);
        StackRefBased.push(2);
        StackRefBased.push(3);
        StackRefBased.push(4);
        StackRefBased.push(5);
        StackRefBased.pop();
        StackRefBased.pop();

        System.out.println("Top element of stack is: " + StackRefBased.peek());

     }
}

