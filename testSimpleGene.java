import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class testSimpleGene {
    public static void main(String[] args) throws IOException {
        //Creating a reference to the Part1 class

        //Part1 myObject = new Part1();  <- uncomment this out if you want to test part2

        //Creating a reference to the Part2 class
        Part2 myObject = new Part2();


        //Creating a dna with not start codon "ATG"
        String dna1 = "ACGTAA".toLowerCase();

        //Creating dna with no Stop codon "TAA"
        String dna2 = "ACATGTCG";

        //Creating dna with Start and stop codon and the substring between them is divisible by 3
        String dna3 = "AGATGCGATACGCTTAATC";

        //Creating dna with Start and stop codon and the substring between them is not divisible by 3
        String dna4 = "AGATGGATACGCTTAATC".toLowerCase();

        //creating dna with no start or stop codon
        String dna5 = "TCATGACGA";

        //Passing in the test variables to the method of Part2 class
        String gene1 = myObject.findSimpleGene(dna1, dna1.indexOf("ATG") ,dna1.indexOf("TAA",dna1.indexOf("ATG")+3));
        String gene2 = myObject.findSimpleGene(dna2, dna2.indexOf("ATG") ,dna2.indexOf("TAA",dna2.indexOf("ATG")+3));
        String gene3 = myObject.findSimpleGene(dna3, dna3.indexOf("ATG") ,dna3.indexOf("TAA",dna3.indexOf("ATG")+3));
        String gene4 = myObject.findSimpleGene(dna4, dna4.indexOf("ATG") ,dna4.indexOf("TAA",dna4.indexOf("ATG")+3));
        String gene5 = myObject.findSimpleGene(dna5, dna5.indexOf("ATG") ,dna5.indexOf("TAA",dna5.indexOf("ATG")+3));
//        String gene2 = myObject.findSimpleGene(dna2);
//        String gene3 = myObject.findSimpleGene(dna3);
//        String gene4 = myObject.findSimpleGene(dna4);
//        String gene5 = myObject.findSimpleGene(dna5);

         // Displaying the results
//        System.out.println("DNA1 is: " + dna1);
//        System.out.println("DNA1 Gene is: " + gene1);
//        System.out.println("DNA2 is: " + dna2);
//        System.out.println("DNA2 Gene is: " + gene2);
//        System.out.println("DNA3 is: " + dna3);
//        System.out.println("DNA3 Gene is: " + gene3);
//        System.out.println("DNA4 is: " + dna4);
//        System.out.println("DNA4 Gene is: " + gene4);
//        System.out.println("DNA5 is: " + dna5);
//        System.out.println("DNA5 Gene is: " + gene5);

        //Displaying the output to the a text file using the FileWriter Class
        FileWriter fileWriterObject = new FileWriter("/home/x/Documents/Coursera/StringsFirstAssignments/src/part2.txt\n");

        PrintWriter printWriterObject = new PrintWriter(fileWriterObject);
        printWriterObject.write("DNA1 is: " + dna1);
        printWriterObject.write("\nGene1 is: " + gene1);
        printWriterObject.write("\nDNA2 is: " + dna2);
        printWriterObject.write("\nGene2 is: " + gene2);
        printWriterObject.write("\nDNA3 is: " + dna3);
        printWriterObject.write("\nGene3 is: " + gene3);
        printWriterObject.write("\nDNA4 is: " + dna4);
        printWriterObject.write("\nGene4 is: " + gene4);
        printWriterObject.write("\nDNA5 is: " + dna5);
        printWriterObject.write("\nGene5 is: " + gene5);
        fileWriterObject.close();




    }
}
