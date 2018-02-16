import java.io.IOException;

class Main {
    public static void main(String[] args){
        AnalysisInternalCode Code = new AnalysisInternalCode();
        try {
            System.out.println(Code.loadInterCode(args[0]));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
