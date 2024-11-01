class A3 {
    public static void main(String[] args) {
        double an = 800;
        boolean bissextile = an % 4 == 0 && an % 100 != 0 || an % 400 == 0;
        System.out.print(bissextile);
    }
}
