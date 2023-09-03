public class SoalEksplorasi {
    private static String encrypt(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                // shift the character by 10 positions
                char shiftedChar = (char) ('A' + (c - 'A' + 10) % 26);
                result.append(shiftedChar);
            } else if (c >= 'a' && c <= 'z') {
                // shift the character by 10 positions
                char shiftedChar = (char) ('a' + (c - 'a' + 10) % 26);
                result.append(shiftedChar);
            } else {
                // append the character as is if it's not alphabet
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(encrypt("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(encrypt("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println(encrypt("INDONESIA")); // SXNYXOCSK
        System.out.println(encrypt("GOLANG")); // QYVKXQ
        System.out.println(encrypt("PROGRAMMER")); // ZBYQBKWWOB
    }
}
