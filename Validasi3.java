import java.util.Scanner;

public class Validasi3 {
    public static void main(String[] args){

        Stack<String> stack = new Stack<>(15);
        String input = "f(x)=(x-3)(x+9)";
        Scanner n = new Scanner(input);  

        n.useDelimiter("");

        for (int i = 0; i < 15; i++){
            String Karakter = n.next();
            if(Karakter.equals("(")){
                stack.push("(");
            } else if (Karakter.equals(")")){
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            System.out.println("valid");
        }else {
            System.out.println("tidak valid");
        }
        
    }
}
