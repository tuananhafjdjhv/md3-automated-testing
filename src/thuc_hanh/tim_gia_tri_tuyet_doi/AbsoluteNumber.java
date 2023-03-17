package thuc_hanh.tim_gia_tri_tuyet_doi;

public class AbsoluteNumber {
    public static int findAbsolute(int number){
//        throw new UnsupportedOperationException();
        return Math.abs(number);
    }

    public static void main(String[] args) {
        System.out.println(findAbsolute(-223));
    }
}
