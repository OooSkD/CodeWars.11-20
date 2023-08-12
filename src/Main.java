import task11.FindOutlier;
import task12.Banjo;
import task13.Paper;
import task14.Kata;
import task15.FakeBinary;
import task16.СountBy;
import task17.BooleanToString;
import task18.Bio;
import task19.AbbreviateTwoWords;
import task20.DuplicateEncoder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(FindOutlier.find(new int[]{2,2,2,2,1}));
        System.out.println(Banjo.areYouPlayingBanjo("Ban"));
        System.out.println(Paper.paperWork(5,5));
        System.out.println(Arrays.toString(Kata.invert(new int[]{1,-2,3,-4,5})));
        System.out.println(FakeBinary.fakeBin("45385593107843568"));
        System.out.println(Arrays.toString(СountBy.countBy(2,5)));
        System.out.println(BooleanToString.convert(false)+" "+ BooleanToString.convert(false).getClass().getName());
        System.out.println(Bio.dnaToRna("UUUU"));
        System.out.println(AbbreviateTwoWords.abbrevName("Sam Harris"));
        System.out.println(DuplicateEncoder.encode("Prespecialized"));
    }
}
