import app.service.InfoService01;
import app.service.InfoService02;

public class Main {
    public static void main(String[] args) {

        InfoService01 infoService01 = new InfoService01();
        String DataInfo01 = infoService01.getData();
        System.out.println(DataInfo01);
        System.out.println();

        InfoService02 infoService02 = new InfoService02();
        String DataInfo02 = infoService02.getData();
        System.out.println(DataInfo02);

    }
}
