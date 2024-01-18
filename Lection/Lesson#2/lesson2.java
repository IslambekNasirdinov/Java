class lesson2 {
    public static void main(String[] args) {
       // System.out.println(Example_1());
        Example_1();
    }

    static void Example_1() {
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }
    }
}