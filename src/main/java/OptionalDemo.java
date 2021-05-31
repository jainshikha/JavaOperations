import java.util.Optional;

public class OptionalDemo{
    public static void main(String[] args) {   
        String[] words = new String[10];
        words[4]="shikha";
        Optional<String> checkNull =
                      Optional.ofNullable(words[5]);

        if (checkNull.isPresent()) {   
            String word = words[4].toLowerCase();
            System.out.print(word);   
        } else  
            System.out.println("word is null");   
    }   
}   