package LinkedList;

public class LinkedList {
    //create a Node;
    static class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    // LinkedList all element print
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    //LinkedList two type of add Node 1. addLast 2. addFast
    //addLast
    public void addLast(int item){
        Node n=new Node(); //create a node;
        n.data=item;

        //attach
        if(this.size>=1){
            this.tail.next=n;
        }

        //summery object
        if(this.size==0){
            this.head=n;
            this.tail=n;
            this.size++;
        }else{
            this.tail=n;
            this.size++;
        }
    }
    //addFast
    public void addFast(int item){
        Node n=new Node(); //create a node;
        n.data=item;

        //attach
        if(this.size>=1){
            n.next=head;
        }
        //summery object
        if(this.size==0){
            this.head=n;
            this.tail=n;
            this.size++;
        }else{
            this.head=n;
            this.size++;
        }
    }
    //add node in the index-> addAt
    public void addAt(int index, int item){
        if(index < 0 || index > size){
            System.out.println("Invalid Index");
        }
        
        if(index ==0){
            addFast(item);
        }else if(index==this.size){
            addLast(item);
        }else{
            Node n=new Node();
            n.data=item;
            n.next=null;
        }
    }













































    public static void main(String[] ages){
        LinkedList l=new LinkedList();
        l.addLast(5);
        l.addLast(6);
        l.addLast(7);
        l.addLast(8);
        l.addFast(4);
        l.display();
    }
}
