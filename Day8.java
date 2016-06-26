import javax.xml.bind.SchemaOutputResolver;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Archit on 20-06-2016.
 */
public class DictionaryPractice {
    public static void main(String[] args) {

        Map<String, Integer> dict  =  new HashMap<>();

        Scanner s1 = new Scanner(System.in);
        int N =  s1.nextInt();
jython 
        for (int i =0 ; i<N ; i++ ){
            String name = s1.next();
            int number = s1.nextInt();
            dict.put(name, number);

        }
 
        for(int i = 0 ; i<N ; i++){
            String givenName = s1.next();
            if(dict.containsKey(givenName)){
                System.out.println(givenName+ "="+ dict.get(givenName));
            }else{
                System.out.println("Not found");
            }
        }

    }
}
