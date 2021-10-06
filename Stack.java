public class Stack<T>{
   public T[] data;
   public int top = 0;

   public Stack(int n){
       data =  (T[])new Object[n];
   }

   public boolean isEmpty(){
       return top == 0;
   }

   public boolean isFull(){
       return top == data.length;
   }

   public void push(T nilai){
       if ( !isFull() ){
           data[top] = nilai;
           top = top + 1;
       }else {
           System.out.println("Stack penuh!");
       }
   }

   public T pop(){
       if ( !isEmpty() ){
           top = top - 1;
           T a = data[top];
           return a;
       }else {
           return null;
       }
   }

   public T peek(){
       if ( !isEmpty() ){
           return data[top -1];
       }else {
           return null;
       }
   }
}