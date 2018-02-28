package codeCompile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ComplieCode {

    public static boolean chageInterCode(String path) {
        String[] command = {"clang", path, "-S", "-emit-llvm", "-o",  path + ".ll"};
        ProcessBuilder pb = new ProcessBuilder(command);
        try {
            pb.start();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // does not work well (current)
    public static boolean dumpAST(String path){
        String[] command = {"clang", "-cc1", "-ast-dump", "-fblocks",  path, ">>", "d" + ".ast"};
        ProcessBuilder pb = new ProcessBuilder(command);
        try {
            pb.start();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
