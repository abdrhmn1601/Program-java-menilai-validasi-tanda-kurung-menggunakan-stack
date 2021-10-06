import java.util.Scanner;

public class Validasi1 {
    public static void main(String[] args){

        Stack<String> stack = new Stack<>(25);
        String input = "f(x)=(2x+y)-(3+(2x-x)+20)";
        Scanner n = new Scanner(input);  

        n.useDelimiter("");

        for (int i = 0; i < 25; i++){
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
