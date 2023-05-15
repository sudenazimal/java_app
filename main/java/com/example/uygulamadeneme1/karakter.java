package com.example.uygulamadeneme1;

import kotlin.text.UStringsKt;

public class karakter {
    int kilo;
    int hareketSayisi;
    int saldiricGucu;
    String isim="Karaktere isim verin.";
    public String yemek(){
        if(hareketSayisi>0) {
            kilo++;
            hareketSayisi--;
            return "Yemek yedi ve kilosu arttı";
        }
        else
        return "Yeterli hareket yok";
    }

    public String uyumak(){
        if(hareketSayisi>0){
            hareketSayisi--;
            return "karakterimiz uyudu";
        }
        else
        return "yeterli hareket yok";
    }

    public String savas(){
        if(hareketSayisi>0){
            hareketSayisi--;
            return "karakterimiz savaştı";
        }
        else
        return "yeterli hareket yok";
    }
    @Override
    public String toString(){
        return "Karakterin ismi : " + isim
                +" \n kilo: " + kilo
                +"\n hareket sayısı: "+hareketSayisi
                +"\n saldırı gücü: "+ saldiricGucu;
    }
}
