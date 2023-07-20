public class Method {
    public int countTheResult(int range){
        int result =0;
        for(int i=0; i<range; i++){
            result = result + i;
        }
        return result;
    }

    public int add(int firstNumber, int secondNumber, String word) {
        System.out.println(word);
        return firstNumber + secondNumber;
    }
}
