package pl.sda;

import java.util.Arrays;

public class Translator {
    String dna;

    String translateDnaToRNA(String dna) {
        this.dna = dna;
        String dnaToUpperCase = dna.toUpperCase();
        String replacedLetters = dnaToUpperCase.replace("A", "U")
                .replace("C", "G")
                .replace("T", "A");
        char[] rna = new char[dna.length()];
        for (int i = 0; i < dna.length(); i++) {
            char isG = dnaToUpperCase.charAt(i);
            if (isG == 'G') {
                rna[i] = 'C';
            } else {
                rna[i] = replacedLetters.charAt(i);
            }
        }
        return String.valueOf(rna);
    }

    String translateRnaToAminoAcid(String rna) {
        String[] rnaSplitedForCodons = new String[rna.length() / 3];
        for (int i = 0, j = 0; i < rna.length() / 3; i++) {
            char nucleotide0 = rna.charAt(j);
            char nucleotide1 = rna.charAt(j + 1);
            char nucleotide2 = rna.charAt(j + 2);
            String codon = Character.toString(nucleotide0) + Character.toString(nucleotide1) + Character.toString(nucleotide2);
            rnaSplitedForCodons[i] = codon;
            j += 3;
        }
        String splitedCodons = Arrays.toString(rnaSplitedForCodons);

        String aminoAcidSeries = splitedCodons.replaceAll(", ", "-")
                .replaceAll("AUU", "Ile")
                .replaceAll("AUC", "Ile")
                .replaceAll("AUA", "Ile")
                .replaceAll("AUG", "Met(START)")
                .replaceAll("ACU", "Thr")
                .replaceAll("ACC", "Thr")
                .replaceAll("ACA", "Thr")
                .replaceAll("ACG", "Thr")
                .replaceAll("AAU", "Asn")
                .replaceAll("AAC", "Asn")
                .replaceAll("AAA", "Lys")
                .replaceAll("AAG", "Lys")
                .replaceAll("AGU", "Ser")
                .replaceAll("AGC", "Ser")
                .replaceAll("AGA", "Arg")
                .replaceAll("AGG", "Arg")
                .replaceAll("GUU", "Val")
                .replaceAll("GUC", "Val")
                .replaceAll("GUA", "Val")
                .replaceAll("GUG", "Val")
                .replaceAll("GCU", "Ala")
                .replaceAll("GCC", "Ala")
                .replaceAll("GCA", "Ala")
                .replaceAll("GCG", "Ala")
                .replaceAll("GAU", "Asp")
                .replaceAll("GAC", "Asp")
                .replaceAll("GAA", "Glu")
                .replaceAll("GAG", "Glu")
                .replaceAll("GGU", "Gly")
                .replaceAll("GGC", "Gly")
                .replaceAll("GGA", "Gly")
                .replaceAll("GGG", "Gly")
                .replaceAll("UUU", "Phe")
                .replaceAll("UUC", "Phe")
                .replaceAll("UUA", "Leu")
                .replaceAll("UUG", "Leu")
                .replaceAll("UCU", "Ser")
                .replaceAll("UCC", "Ser")
                .replaceAll("UCA", "Ser")
                .replaceAll("UCG", "Ser")
                .replaceAll("UAU", "Tyr")
                .replaceAll("UAC", "Tyr")
                .replaceAll("UAA", "STOP")
                .replaceAll("UAG", "STOP")
                .replaceAll("UGU", "Cys")
                .replaceAll("UGC", "Cys")
                .replaceAll("UGA", "STOP")
                .replaceAll("UGG", "Trp")
                .replaceAll("CUU", "Leu")
                .replaceAll("CUC", "Leu")
                .replaceAll("CUA", "Leu")
                .replaceAll("CUG", "Leu")
                .replaceAll("CCU", "Pro")
                .replaceAll("CCC", "Pro")
                .replaceAll("CCA", "Pro")
                .replaceAll("CCG", "Pro")
                .replaceAll("CAU", "His")
                .replaceAll("CAC", "His")
                .replaceAll("CAA", "Gln")
                .replaceAll("CAG", "Gln")
                .replaceAll("CGU", "Arg")
                .replaceAll("CGC", "Arg")
                .replaceAll("CGA", "Arg")
                .replaceAll("CGG", "Arg");
        return aminoAcidSeries;
    }

    String aminoAcidOneLetter(String aminoAcidOneLetter) {
        String oneLette = aminoAcidOneLetter.replaceAll("-", "")
                .replaceAll("Ile", "I")
                .replaceAll("Met\\(?START\\)?", "M")
                .replaceAll("Thr", "T")
                .replaceAll("Asn", "N")
                .replaceAll("Lys", "K")
                .replaceAll("Ser", "S")
                .replaceAll("Arg", "R")
                .replaceAll("Val", "V")
                .replaceAll("Ala", "A")
                .replaceAll("Asp", "D")
                .replaceAll("Glu", "E")
                .replaceAll("Gly", "G")
                .replaceAll("Phe", "F")
                .replaceAll("Leu", "L")
                .replaceAll("Tyr", "Y")
                .replaceAll("Cys", "C")
                .replaceAll("Pro", "P")
                .replaceAll("His", "H")
                .replaceAll("Gln", "Q")
                .replaceAll("STOP", "");
        return oneLette;
    }
}
