import java.util.Scanner;

public class Validasi2 {
    public static void main(String[] args){

        Stack<String> stack = new Stack<>(8);
        String input = "f(x)=x+3";
        Scanner n = new Scanner(input);  

        n.useDelimiter("");

        for (int i = 0; i < 8; i++){
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
