public class digits {
    public static void main(String[]args){
        int nums = 451;
        int one = (nums%10);
        int ten = ((nums%100)-one)/10;
        int hundered = ((nums%1000)-ten-one)/100;
        System.out.println("The one's digit is "+hundered);
        System.out.println("The ten's digit is "+ten);
        System.out.println("The hundered's digit is "+one);
    }
    


}
