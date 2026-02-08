import java.util.Arrays;
class comparearr{
public static void main(String[] args)
 {
  char anime[]={'N','A','R','U','T','O'};
  char copyofanime[]=Arrays.copyOf(anime,anime.length);
  System.out.println(Arrays.toString(anime));
  System.out.println(Arrays.toString(copyofanime));
  System.out.println(anime==copyofanime);//it will not work in arrays there is a another method to compare arrays 
  System.out.println(Arrays.equals(anime,copyofanime));
  }
}
