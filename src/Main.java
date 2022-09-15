public class Main {
    public static void main(String[] args) {

        String name = "";
        int name2 =10;
        var name3 = 15;
        var name4 = "Enes";
        double name5 = 15.565168;
        float name6 = (float) 15.6;
        boolean name7 = true;
        System.out.println(name7);
        double dolarBugun= 17.553;
        double dolarDun = 19.56;
        String okYonu = "";

        if (dolarDun<dolarBugun){
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else if (dolarDun<dolarBugun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);

        }

        String[] krediler = {"fsdfsd","sfgfgdgd","fdgdgdfg","gddfsggdf"};

        for (int i = 0; i< krediler.length; i++){
            System.out.printf(krediler[i]);
        }





    }
}