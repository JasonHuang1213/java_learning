public class Thing {
   private static int things = 0;		// class(static) variable
   private static final String ID_START = "no";		// class(static) variable
   private String id;		// instance variable

   public static int manyThings() {
       return things;
   }

   public Thing() {
      things++;
      id = ID_START + things;
   }

   public String giveId() {
      return id;
   }
}