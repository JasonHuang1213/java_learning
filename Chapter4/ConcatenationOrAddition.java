public class ConcatenationOrAddition {
   public static void main(String[] args) {
       String cs1 = "or", cs2 = "an", cs3 = "ge";
       String fruit;
       // divide the word orange
       //fruit = cs1 + "-" + cs2 + "-" + cs3; // value is or-an-ge"
       // and without dashes
       fruit = cs1 + cs2 + cs3; // value is orange"
       // concatenations
       System.out.println(3 + " " + fruit + "s in basket");
       // concatenations
       System.out.println("Basket has " + 2 + 1 + " " + fruit + "s");
       // concatenations and additions
       System.out.println("Basket has " + (2 + 1) + " " + fruit + "s");
       // concatenations and additions
       System.out.println(1 + 2 + " " + fruit + "s in basket");
   }
}
