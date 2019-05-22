/*
       Finding a Gene - Using the Simplified Algorithm
 */

public class Part1 {
    public String findSimpleGene(String dna) {

        //Creating the return variable that will store the result
        String result = "";

        //Finding the index position of the first start Codon "ATG"
        int startCodon = dna.indexOf("ATG");

        //If there is no "ATG" then we return an empty string
        if (startCodon == -1) {
            return "";
        }

        //Finding the index position of the first stop Codon "TAA"
        //that appears after the "ATG" that we found

        int stopCodon = dna.indexOf("TAA", startCodon + 3);

        //If there is no "TAA" then we return an empty string
        if (stopCodon == -1) {
            return "";
        }

        //checking if the length of the substring between the "ATG" and
        //"TAA" is a multiple of 3, if yes then
        //we will return the substring that starts with "ATG" and end with "TAA"

        if ((stopCodon - startCodon) % 3 == 0) {
            result = dna.substring(startCodon, stopCodon + 3);
        }

        return result;
    }

}
