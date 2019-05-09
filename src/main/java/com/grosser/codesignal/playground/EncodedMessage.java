package com.grosser.codesignal.playground;

public class EncodedMessage {

    public static String encode(String text) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            c = (char)(c + c + i);
            System.out.println(c);
            b.append(c);
            System.out.println(b.toString());
        }
        return b.reverse().toString();
    }

    static String decode(String encodedMessage) {
        StringBuilder builder = new StringBuilder();
        for(int i = encodedMessage.length() - 1; i >= 0; i--){
            char c = encodedMessage.charAt(i);
            int val = encodedMessage.length() - 1 - i;
            c = (char)((c - val) / 2);
            builder.append(c);
        }
        return builder.toString();
    }
}
