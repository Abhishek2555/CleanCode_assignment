public class main {
    static class CheckClean {

        int Max; //initializing variable//
        int Min;
    }

    static CheckClean Max_Min(int GivenArray[], int SizeOfArray) {
        CheckClean objectOfCheck = new CheckClean();

        int i;

        if (SizeOfArray == 1) {
            objectOfCheck.Max = GivenArray[0];
            objectOfCheck.Min = GivenArray[0];
            return objectOfCheck;
        }

        if (GivenArray[0] > GivenArray[1]) {
            objectOfCheck.Max = GivenArray[0];
            objectOfCheck.Min = GivenArray[1];
        } else {
            objectOfCheck.Max = GivenArray[1];
            objectOfCheck.Min = GivenArray[0];
        }

        for (i = 2; i < SizeOfArray; i++) {
            if (GivenArray[i] > objectOfCheck.Max) {
                objectOfCheck.Max = GivenArray[i];
            } else if (GivenArray[i] < objectOfCheck.Min) {
                objectOfCheck.Min = GivenArray[i];
            }
        }

        return objectOfCheck;
    }

    public static void main(String args[]) {
        int GivenArray[] = {
            1000,
            11,
            445,
            1,
            330,
            3000
        }; //declaring Array//
        int SizeOfArray = 6;
        CheckClean objectOfCheck = Max_Min(GivenArray, SizeOfArray); // passing value of array according to size//
        System.out.printf("\n Maximum Number : %d", objectOfCheck.Max);
        System.out.printf("\n Minimum Number : %d", objectOfCheck.Min);
    }
}