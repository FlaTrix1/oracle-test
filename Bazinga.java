public class Bazinga{
  public static void main(String[] args){
    for(int i = 1; i < 100; i++){
      String output = "";

      if (i % 2 == 0){
        output += "Baz";
      }

      if (i % 5 == 0){
        output += "inga!";
      }

      System.out.println(output == "" ? i : output);
    }
  }
}
