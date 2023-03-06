package Review4;

public class RemoveSpecChar {


        public static void main(String[] args) {
            String input = "Hello @world!";
            String output = input.replaceAll("[^a-zA-Z0-9]", "");
            System.out.println(output);
        }
    }

