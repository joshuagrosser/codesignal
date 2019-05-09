package com.grosser.codesignal.playground;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodedMessageTest {

    private EncodedMessage message;

    @Test
    public void test(){
        System.out.println(EncodedMessage.encode("joshua"));
    }

    @Test
    public void testDecode() {
        System.out.println(EncodedMessage.decode("ÇîÓèßÔ"));
    }


}