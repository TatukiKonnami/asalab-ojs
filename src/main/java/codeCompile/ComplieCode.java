package codeCompile;

import java.io.IOException;

public class ComplieCode {
    public static boolean chageInterCode(String path) {
        String[] command = {"clang", path, "-S", "-emit-llvm", "-o",  path + ".ll"}; // 起動コマンドを指定する
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
