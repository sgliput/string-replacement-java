public class StringReplacer {

    public String ReplaceString(String strOrig, String strFind, String strReplace){

        System.out.println();
        System.out.println("Original String: " + strOrig);
        System.out.println(); 
        String[] words=strOrig.split(strFind);//splits the string based on instances of strFind 
        // //using java foreach loop to print elements of string array  
        // System.out.println("Prints out string array of split words");
        // for(String w:words){  
        //     System.out.println(w);  
        // } 
        String newString = String.join(strReplace, words);
        System.out.println("New String: " + newString); 
        return newString;
        
    }

	public static void main(String[] args) {

        StringReplacer instance = new StringReplacer();
        //calling ReplaceString method using instance object
        instance.ReplaceString("The blue bluebird is blue.", "blue", "red");

	}
}
