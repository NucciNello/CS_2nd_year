public class ArrQueue{
    int front;
    int rear;
    int counter;
    int maxSize;
    int [] values;
    // public ArrayQueue(int size);

    //constructor
    public ArrQueue(int size){
        values  = new int[size];
        maxSize = size;
        front = 0;
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
            //calculate the new rear position for circular
            rear = (rear + 1) % maxSize;
            values[rear] = x;
            //update the counter too
            counter++;
            rear++;
        }
    }

    //dequeue function
    //i.e., remove at the front
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Error: the queue is empty");
            return 0;
        }else{
            int x = values[front];
            //move the front index
            front = (front + 1) % maxSize;
            counter--;
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

    //displaying all elements
    public void displayQueue(){
        System.out.println("front-->");
        for(int i=0;i < counter; i++){
            if(i == 0){
                System.out.println("\t");
            }else{
                System.out.println("\t\t");
            }
            System.out.println(values[(front + 1) % maxSize]);
            if(i != counter -1){
                System.out.println("");
            }else{
                System.out.println("<--rear");
            }
        }
    }




    //Using the queue
    public static void main(String[] args){
        ArrQueue myqueue = new ArrQueue(5);
        for(int y=0; y<5; y++){
            myqueue.enqueue(y);
            System.out.println("Enqueued the element "+y);
        }
        myqueue.enqueue(5);
        myqueue.displayQueue();
        
        int value = myqueue.dequeue();
        System.out.println("Retrieved element is "+value);
        myqueue.displayQueue();
        myqueue.enqueue(7);
        myqueue.displayQueue();
    }

}