public class Day2GitGithub {

    /*
    1-) git init--> lokal repo olusturmak için  yani .git  ile klasorumuzun
        icindek dosyalari iliskilendirmek icin kullanilir.

    2-) git add --> Working space ' den (yani yerel ) dosyalarini staging area'ya
        (yani commitlemek icin beklenen yer) gonderir

    3-) git status --> Working space ve Staging area daki durumu gosterir

    4-) git commit -m "mesaj" --> Staging area'dan commit stora dosyalarimi gondermek
        icin kullanilir

    5-) git push --> Uzak repo'ya (yani remote-Github) gondermek icin kullandigimiz
        kod Yalniz git push komutunu direk kullanmak istersek bir kereye maahsus

            git remote add origin adres ve
            git push -u origin master

        Not: Bu iki komutu tek seferde kullandiktan sonra ikinci commit'lerim
        icin sadece git push kullaniriz

        not: git log -- online --> Commitlerimdeki yani
             versiyonlarimdaki durumu gosterir
             
             NOT : Github ogrendim
             
             NOT : github cok eglenceli
     */
    public static void main(String[] args) {
        System.out.println("Githhub'ida ogrendim'");

    /*
        İlk defa PUSH yapacaksanız bir projeyi ;

        1 - Önce GitHub a gidip New Repository i oluşturun
        2- Oluşturduğunuz repository de size verilen https://github.com/.............git   adresini kopyalayın


        Şimdi IntelliJ ye gelip TERMINAL ı açın;

        3- git init yazın
        4- git add . yazın
        5- git commit -m"first commit"  (first commit yerine  ilke versiyon, ilk ders veya istediğiniz bir şeyi yazın)
        6- git branch -M main
        7- git remote add origin https://github.com/.............git (yukarıda2. satırda kopyalağınız adresi buraya yapıştırın)
        8- git push -u origin main


        SONRASINDA Aynı PROJE için ;

        her yeni eklediğiniz şeyden sonra GitHub'a yüklemek için

        9- git add .
        10 - git commit -m"YENI NUMARA VEYA YAZI YAZ"
        11 - git push


        hepsi bu kadar

     */
    }
}
