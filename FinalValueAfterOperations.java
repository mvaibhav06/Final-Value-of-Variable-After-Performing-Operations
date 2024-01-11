public class FinalValueAfterOperations {

    public static int valueAfterPerformingOperations(String[] operations){
        int out = 0;

        for (int i=0; i<operations.length; i++){
            if (operations[i].equals("++X") || operations[i].equals("X++")){
                out++;
            }else {
                out--;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(valueAfterPerformingOperations(operations));
    }
}
