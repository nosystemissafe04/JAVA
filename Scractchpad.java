 class Scratchpad {

    public static void main(String[] args) {
        Scratchpad scratchpad = new Scratchpad();
        scratchpad.someMethod();
    }

    public Scratchpad() {
    }

    private void someMethod() {
        System.out.println("Non-static method prints");
    }
}
