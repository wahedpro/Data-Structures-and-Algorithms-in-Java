/*
 Stack 4 type of operation
    1. push;
    2. pop;
    3. peek;
    4. isEmpty;
 */
package Stack;
import java.util.ArrayList;

public class Stack_implementation_arraylist {
    public static void main(String[] ages){
        stack st=new stack();
        st.push(5);
        st.push(10);
        System.out.println(s);
    }
}

static class Stack{

    ArrayList<Integer> list=new ArrayList<>();

        //push operation
        public static void push(int item){
            list.add(item);
        }

        //pop operation
        public static int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek operation
        public static int peek(){
            return list.get(list.size()-1);
        }

        //isEmpty operation
        public static boolean isEmpty(){
            return list.size()==0;
        }

}
