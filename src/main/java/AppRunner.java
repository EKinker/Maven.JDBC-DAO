import daos.YarnStuff;
import models.Yarn;

public class AppRunner {

    public static void main(String[] args){
        YarnStuff yarnStuff = new YarnStuff();
        System.out.println(yarnStuff.getAllYarn());
        Yarn yarn = new Yarn(0, "Lion Brand", "Multi","Cotton", "Aran", 250, 10.99, 2);
        yarnStuff.addYarn(yarn);
        System.out.println(yarnStuff.getAllYarn());
//        yarnStuff.deleteYarn(6);
//        yarnStuff.deleteYarn(7);
//        System.out.println(yarnStuff.getAllYarn());
    }
}
