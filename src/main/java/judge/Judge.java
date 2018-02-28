package judge;

import java.io.IOException;

public class Judge {
    public static boolean complieCode(String path) {
        String[] command = {"clang", path, "-o", path + ".o"};
        ProcessBuilder pb = new ProcessBuilder(command);
        try {
            pb.start();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean execution(String path){
        String[] command = {"./" + path + ".o"};
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