
class Lab24_1 {
    public static void main(String[] args) {
        GenericStack<String> gI = new GenericStack<String>();

        gI.push("George");
        gI.push("Tom");
        gI.push("Peter");
        gI.push("Pet");

        System.out.println(gI.toString());
        System.out.println("Size: " + gI.getSize());
        System.out.println(gI.peek());
        System.out.println(gI.pop());
        System.out.println(gI.peek());
    }
}