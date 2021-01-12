import java.util.Base64;

class main {
    public static void main(String[] args) {
        // Base64 encoding
        String originalString = "This is a message";
                                
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println(encodedString);

        // Base64 decode
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString);

        // Bitvis logisk operation
        // xor
        byte letter = (byte)'A';
        byte key = (byte)'K';
        int cipher = letter ^ key;
        System.out.println(cipher);
        int clear_letter = cipher ^ key;
        System.out.println((char)clear_letter);

        // bitwise and
        int andValue = 197;
        int result128 = andValue & 128;
        int result64 = andValue & 64;
        int result32 = andValue & 32;
        int result16 = andValue & 16;
        int result8 = andValue & 8;
        int result4 = andValue & 4;
        int result2 = andValue & 2;
        int result1 = andValue & 1;
        System.out.println(result128);
        System.out.println(result64);
        System.out.println(result32);
        System.out.println(result16);
        System.out.println(result8);
        System.out.println(result4);
        System.out.println(result2);
        System.out.println(result1);

        // bitwise shift
        for(int i = 7; i >= 0; i--) {
            int bit = andValue >> i; 
            System.out.printf("%d", bit & 1);
        }
        System.out.println();

        byte[] values = {68, 4, 72};
        String result = bytesToHex("Hej hopp i Lingonskogen".getBytes());
        System.out.println(result);
        byte[] byteResult = hexStringToByteArray(result);
        System.out.println(new String(byteResult));
    }

    
    public static String bytesToHex(byte[] bytes) {
        char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
        char[] hexChars = new char[bytes.length * 2];
        for(int i = 0; i < bytes.length; i++) {
            int value = bytes[i] & 0xFF;
            hexChars[i * 2] = HEX_ARRAY[value >>> 4];
            hexChars[i * 2 + 1] = HEX_ARRAY[value & 0x0F];
        }
        return new String(hexChars);
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        
        // This only works with an even number of characters.
        // If len is odd, append a 0 at the start of number
        if(len % 2 != 0) {
            s = "0" + s;
            len++;
        }

        byte[] data = new byte[len / 2];
        for(int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                                + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
}