public class Main {
    public static void main(String[] args) {
        Class cl = new Class(1,"Bir",new int[] {1,34,45,67,8});
        System.out.println("Number: " + cl.getNumber());
        System.out.println("Word: " + cl.getWord());

        for (int i = 0; i <cl.getMassive().length; i++) {
            System.out.print("Indeks " + i + " : " + cl.getMassive()[i]+ "  ");
        }

    }
}