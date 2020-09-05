package com.sda.jt10.advancedtesting.homework;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class StringReverseTest {

    @Test
    public void reverseTest() {
        List<String> str = Arrays.asList("popodom");

        //assertThat(str).contains("popodom");//success
        //assertThat("popodom").startsWith("p");//success
        //assertThat("popodom").endsWith("m");//success
        //assertThat("popodom").isNotEmpty();//success
    }

    @Test
    public void ExpectedException(){//success
        List<String> str = Arrays.asList("popodom");

        try {
            assertThat(str).contains("popodom");
        }catch (Exception ex){
            System.out.println("Exception occurred");
        }
    }
}
