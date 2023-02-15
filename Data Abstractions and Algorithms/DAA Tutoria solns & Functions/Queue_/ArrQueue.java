public class ArrQueue{
    int front;
    int temporary;
    int rear;
    int counter;
    int maxSize;
    static int [] values;
    // public ArrayQueue(int size);

    //constructor
    public ArrQueue(int size){
        values  = new int[size];
        maxSize = size;
        front = (size - 1);
        temporary = front;
        rear = -1;
        counter = 0;
    }

    //isEmpty method
    public boolean isEmpty(){
        if(counter == 0){
            return true;
        }else
        return false;
    }

    //isFull method
    public boolean isFull(){
        if(counter == maxSize){
            return true;
        }else
        return false;
    }

    //enqueue function
    //i.e., insert at the back or at the rear
    public void enqueue(int x){
        if (isFull()){
            System.out.println("Error: the queue is full!");
        }else{
            // //calculate the new rear position for circular
            // // temporary = (temporary + 1) % maxSize;
            // values[temporary] = x;
            // // int temporary = front;
            // //decrement temporary so that the next element comes to front-1 index;
            // temporary--;

            // //update the rear element index so that it matches to the index of
            // //the last element enqueued!!!
            // rear = temporary;
            // if(temporary == -1){
            // rear = 0;
            // }

            // //update the counter too
            // counter++;
            rear = (rear +1)%maxSize;
            values[rear] = x;
            counter++;
        }
    }

    //dequeue function
    //i.e., remove at the front
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Error: the queue is empty");
            return 0;
        }else{
            int x = values[maxSize -1];
            counter--;
            front = counter;
            return x;
        }
    }

    //Deleting all Elements
    //it's an constructor but, areverse one
    public void dequeueAll(){
        values = new int[maxSize];
        front = 0;
        rear = -1;
        counter = 0;
    }

    //Required to fix printing methodology i.e., doesn't print the last element after dequeue
    //or after decrementing the counter
    //displaying all elements
    public void displayQueue(){
        int i;
        int temp = front;
            for(i=0; i<(counter) ; i++){
                if(i==0){
                    System.out.print("front-->");
                }
                if(i== (counter-1)){
                    System.out.println(values[front]+"<--rear"); 
                }
                else{
                System.out.println(values[front]);
                front--;
                }
            }
            front = temp;
    }






    //Using the queue
    public static void main(String[] args){
        ArrQueue myqueue = new ArrQueue(5);
        
        // myqueue.enqueue(15);
        // myqueue.enqueue(12);
        // myqueue.enqueue(9);
        // myqueue.enqueue(6);
        // myqueue.enqueue(3);
        
        
        for(int y=5; y>0; y--){
            myqueue.enqueue(y);
            System.out.println("Enqueued the element "+y);
        }
        
        myqueue.displayQueue();
        System.out.println("rear index = "+myqueue.rear);
        System.out.println("front index = "+myqueue.front);
        System.out.println("Counter = "+myqueue.counter);

        System.out.println("");
        System.out.println("Now, after dequeue:");
        myqueue.dequeue();
        System.out.println("Counter = "+myqueue.counter);
        int value =  myqueue.dequeue();
        System.out.println("Retrieved element is "+value);
        System.out.println("New front index = "+myqueue.front);
        System.out.println("Counter = "+myqueue.counter);
        myqueue.displayQueue();
        System.out.println("rear element = "+values[myqueue.rear]);
    }

}
public static void(Strings[] args){
    Queue queue = new Queue(5);
    for(int i=0; i<5; i++)
        queue.enqueue(i);
    System.out.println("Now attempting to enqueue again");
    queue.enqueue(5);
    int value = queue.dequeue();
    System.out.println("the retrieve element ="+ value);
    queue.enqueue(6);
    for(i=0;i<5;i++)
        System.out.println("Item "+i+"="+queue.dequeue());
}