public class CommandLineParameters{
	public static void main(String[] args){
		System.out.println("You gave " + args.length + " command line parameters.");
		System.out.println("Below are the given parameters: ");
		for(int i=0; i<args.length; i++){
			System.out.println((i+1) + ". parameter: " + args[i]);
		}
	}
}