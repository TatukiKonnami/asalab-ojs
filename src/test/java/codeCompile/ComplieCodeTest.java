package codeCompile;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ComplieCodeTest {
    String path = "/User/aika/asalab-ojs/src/test/resources/d.c";
    @Test
    public void chageInterCode() throws IOException {
        ComplieCode a = new ComplieCode();
        boolean b = a.chageInterCode(path);
        assertTrue("ちゃんと中間コードに変換される", b);
    }

}