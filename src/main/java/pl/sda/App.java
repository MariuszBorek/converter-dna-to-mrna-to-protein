package pl.sda;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Translator translator = new Translator();

        System.out.println("|     INPUT STRANDS    |" +
                "\n|DNA >> mRNA >> Protein|" +
                "\n|       Converter      |" +
                "\n| D - DNA  |  R - mRNA |");
        System.out.println("Enter the letter: ");
        String codeType = scanner.next();
        String codeTypeUpperCase = codeType.toUpperCase();

        if (codeTypeUpperCase.equals("D")) {
            System.out.println("Enter DNA:");
            scanner.nextLine();
            String dna = scanner.nextLine();
            String rna = translator.translateDnaToRNA(dna);
            System.out.println("\n|    OUTPUT STRANDS    |");
            System.out.println("DNA >>> mRNA:\n" +
                    "[" + rna + "]");
            System.out.println("\n(3 letters)Protein:");
            String Letters = translator.translateRnaToAminoAcid(rna);
            System.out.println(Letters);
            System.out.println("\n(1 letter)Protein:");
            System.out.println(translator.aminoAcidOneLetter(Letters));
        } else if (codeTypeUpperCase.equals("R")) {
            System.out.println("Enter mRNA:");
            scanner.nextLine();
            String rna = scanner.nextLine().toUpperCase();
            System.out.println("\n|    OUTPUT STRANDS    |");
            System.out.println("mRNA:");
            System.out.println(rna);
            System.out.println("\n(3 letters)Protein:");
            String Letters = translator.translateRnaToAminoAcid(rna);
            System.out.println(Letters);
            System.out.println("\n(1 letter)Protein:");
            System.out.println(translator.aminoAcidOneLetter(Letters));
        } else {
            System.out.println("Wrong letter");
        }
        scanner.close();
    }
}