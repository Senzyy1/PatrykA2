public class zad9 {
    public static void main(String[] args) {
        String firstName ="Patryk", middleName ="Marian", lastName ="Adamek";
        char firstinitial,middleinitial,lastinitial;
        firstinitial= firstName.charAt(0);
        middleinitial = middleName.charAt(0);
        lastinitial = lastName.charAt(0);
        System.out.printf(firstinitial+"."+middleinitial+"."+lastinitial);
    }
}
