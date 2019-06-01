import java.util.stream.IntStream;

public class Modifier {
    public String invertString(String string){
        StringBuilder stringBuilder = new StringBuilder();

        IntStream.range(0,string.length()).forEach(index->stringBuilder.append(string.charAt(string.length()-index-1)));
        return stringBuilder.toString();
    }
}
