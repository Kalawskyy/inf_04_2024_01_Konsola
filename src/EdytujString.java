/*
************************************************
 klasa: EdytujString
 opis: Klasa z narzędziami dla zmienej string. Pierwsza metoda zlicza samogłoski, a druga usuwaa powtórzenia znaków występujące obok siebie:
 metody:
 zliczSamogloski - Zmienna typu int z liczbą samogłosek
 usunPowtorzenia - Zwraca łąńcuch znaków bez powtórzeń obok siebie
 autor: <0000000000000>
************************************************
*/
public class EdytujString {
    public static int zliczSamogloski(String wyraz){
        String samogloski=  "aąeęiouóyAĄEĘIOUÓY";
        int liczbaSamoglosek=0;
        if (wyraz == null || wyraz.isEmpty()) return 0;
        for (int i = 0; i <wyraz.length() ; i++) {
            for (int j = 0; j <samogloski.length() ; j++) {
                if (wyraz.charAt(i) == samogloski.charAt(j)){
                    liczbaSamoglosek++;
                    break;
                }
            }

        }
        return liczbaSamoglosek;
    }
    public static String usunPowtorzenia(String wyraz){
        int obecnyIndex=0;
        if (wyraz == null || wyraz.isEmpty()) return "";
        while (obecnyIndex<wyraz.length()-1){
            if (obecnyIndex+1<wyraz.length() &&wyraz.charAt(obecnyIndex)==wyraz.charAt(obecnyIndex+1)){
                wyraz=wyraz.substring(0,obecnyIndex).concat(wyraz.substring(obecnyIndex+1));
            }else{
            obecnyIndex++;
            }
        }
        return wyraz;
    }
}
