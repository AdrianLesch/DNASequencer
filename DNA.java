//This program determines whether there is a protein in a strand of DNA

public class DNA {

    public static void main(String[] args) {

      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";

      String dna = dna3;

      int length = dna.length();
      System.out.println("The lenght is: " + length);

      //Method
      System.out.println(dna.indexOf("ATG"));
      System.out.println(dna.indexOf("TGA"));

      if ((dna.indexOf("ATG")!=-1) && (dna.indexOf("TGA")!=-1) && ((dna.length()-6)%3==0)){
      System.out.println("This codon contains a protein!");
      System.out.println("The protein is: "+ dna.substring(3, 12));
      } else {
        System.out.println("No protein in here. :(");
      }
      

    }


}
