package analaysis;

public class DefineTypes {
    public enum Types{
        INT("i32"),
        DOUBLE("double"),
        VOID("void"),
        CHAR("i8"),
        FLOAT("float"),
        LONG("i64");

        private String label;

        Types(String label) {
            this.label = label;
        }

        public String getlabel(){
            return this.label;
        }

        public Types checkTypes(){
            return Types.INT;
        }


    }
}
