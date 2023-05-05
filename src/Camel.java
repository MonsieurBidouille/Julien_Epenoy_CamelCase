public class Camel {



    public static String to_Camel(String txt){
         String[] txtarr = txt.split(" ");
            for (int i = 0; i < txtarr.length;i++) {
                txtarr[i] = txtarr[i].toLowerCase();
                String[] charto = txtarr[i].split("");
                charto[0] = charto[0].toUpperCase();
                String tempstr = "";
                for (int j = 0;j<charto.length;j++) {
                    tempstr += charto[j];
                }
                txtarr[i] = tempstr;
            }
            String res = "";
            for (int i = 0;i<txtarr.length;i++){
                res += txtarr[i];
             }

            return res;
    }
}
