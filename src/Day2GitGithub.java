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
     */
    public static void main(String[] args) {
        System.out.println("Githhub'ida ogrendim'");
    }
}
