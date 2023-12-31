public class Challenge {
    static void bottleChallenge() {
        int bottlesNum = 10;
        String word = "bottles";
        while(bottlesNum > 0) {

            System.out.println(bottlesNum + " green "+ word + " hanging on the wall" );
            System.out.println(bottlesNum + " green "+ word + " hanging on the wall" );
            System.out.println("And if one green bottle should accidentally fall, ");

            bottlesNum = bottlesNum - 1;

            if(bottlesNum == 1) {
                word = "bottle";
            }

            if(bottlesNum > 0){
                System.out.println("There will be "+bottlesNum+" green "+word+" hanging on the wall");
            } else {
                System.out.println("There will be no green bottles, hanging on the wall");
            }
        }
    }

    static Integer recursiveFibonacci(Integer n) {
        if(n <= 1) {
            return n;
        }
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }
}
