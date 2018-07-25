public class Main {

    public static void main(String[] args) {
        int lastNumber = 100;
        System.out.println("Starting count to:" + lastNumber);
        countTheNumbers(lastNumber);

    }
    public static void countTheNumbers(int finalNum){
        for(finalNum = 0; finalNum <101; finalNum++){
            System.out.println(finalNum);
        }
    }
}
