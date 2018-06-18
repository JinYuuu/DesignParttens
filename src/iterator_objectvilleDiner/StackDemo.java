package iterator_objectvilleDiner;

import java.util.*;

public class StackDemo {
   public static void main(String args[]) {

      // creating stack
      Stack st = new Stack();

      // populating stack
      st.push("Java");
      st.push("Source");
      st.push("code");

      // checking the top object
      System.out.println("Top object is: "+st.peek());
   }     
}
