public class Main {
    public static void main(String[] args) {
        //Задача
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i == 3 - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }

        }

        System.out.println("");
        for (int i = 2; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);

            }
        }
            System.out.println("");


            //Задача
            double[] mass = {1.57, 9.986, 7.654};
            for (int i = 0; i < mass.length; i++) {
                if (i == mass.length - 1) {
                    System.out.print(mass[i]);
                } else {
                    System.out.print(mass[i] + ", ");
                }
            }
        System.out.println("");
            for (int i = mass.length -1; i>=0; i--) {
             if (i != 0 ) {
                 System.out.print(mass[i] + ", ");
             }else {
                 System.out.print(mass[i]);
             }
            }
            System.out.println("");

            //Задача
            int[] arbitrary = {15, 26, 65, 98};
            for (int i = 0; i < arbitrary.length; i++) {
                if (i == arbitrary.length - 1) {
                    System.out.print(arbitrary[i]);
                } else {
                    System.out.print(arbitrary[i] + ", ");
                }
            }
        System.out.println("");
        for (int i = arbitrary.length-1; i >= 0; i--) {
            if (i !=0) {
                System.out.print(arbitrary[i] + ", ");
            }else {
                System.out.print(arbitrary[i]);
            }
        }
            System.out.println("");

            double[] arbitrary2 = new double[6];
            arbitrary2[0] = 2.56;
            arbitrary2[1] = 15.562;
            arbitrary2[2] = 7.8547;
            arbitrary2[3] = 584.25;
            arbitrary2[4] = 21.254;
            arbitrary2[5] = 12.257;
            for (int i = 0; i < 6; i++) {
                if (i == 6 - 1) {
                    System.out.print(arbitrary2[i]);
                } else {
                    System.out.print(arbitrary2[i] + ", ");
                }
            }
        System.out.println("");
        for (int i = 5; i >=0 ; i--) {
          if(i!=0) {
              System.out.print(arbitrary2[i] + ", ");
          }else {
              System.out.print(arbitrary2[i]);
          }
        }
        System.out.println("");

        int [] even = {1,2,3};
        for (int i = 0; i < even.length; i++) {
            if (even[i] % 2 != 0){
                even[i]++;
                if (i == even.length - 1) {
                    System.out.print(even[i]);
                } else {
                    System.out.print(even[i] + ", ");
                }
            }
        }
        }
        }


