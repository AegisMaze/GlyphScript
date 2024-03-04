package com.aegismaze.glyphscript;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GlyphScript {

    public static void main(String[] args) throws IOException {
        if (args.length != 1)
            System.out.println("Please include one filename as argument");
        else {
            String script = Files.readString(Paths.get(args[0]));
            System.out.println(script);
        }
    }
}
