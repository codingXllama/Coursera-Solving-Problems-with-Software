public class Part2 {
    public String findSimpleGene(String dna, int startCodon, int stopCodon) {

        //Creating the return variable that will store the result
        String result = "";

        //Finding the index position of the first start Codon "ATG"
        //startCodon = dna.indexOf("ATG");

        //If there is no "ATG" then we return an empty string
        if (startCodon == -1) {
            return "";
        }

        //Finding the index position of the first stop Codon "TAA"
        //that appears after the "ATG" that we found

        //stopCodon = dna.indexOf("TAA", startCodon + 3);

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

        if (dna.toLowerCase().equals()) {
            System.out.println("we will print in lower case");
            return result.toLowerCase();
        } else {
            System.out.println("we will print in upper case");
            return result.toUpperCase();
        }


    }
}
