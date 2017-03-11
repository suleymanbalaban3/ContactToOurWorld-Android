package com.example.slymn54.contacttoourworld;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class siir extends AppCompatActivity {
    TextView tv;
    private int year,month,day;
    private Calendar calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siir);

        Intent intent=getIntent();

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        tv=(TextView)findViewById(R.id.textView2);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        String twelve="Bug�n tan��ma g�n�m�z :) :) <3 \n\nS\ne\nn\ni\n" +
                "\nH\ne\ne\ne\ne\n\np\n�\no\no\no\nk\n\nSeviyorum\n";
        String one="Bug�n baslang�� g�n�m�z :) :) <3 \n\nS\ne\n n\ni\n" +
                "\nH\ne\ne\ne\np\n\n�\no\no\nk\n\nSeviyorum\n\n" +
                "�yi Ki Varsin\n";
        String[] rows = new String[20];
        rows[0]="Seni ,yaln�zca seni seviyorum ben\n" +
                "Bir nisan r�zgar�nda seni buluyorum \n" +
                "Sesin kula��ma a�k� fis�ld�yor\n" +
                "Seni i�ime �ekip sarho� oluyorum\n" +
                "G�zlerine bak�p bo�lukta kayboluyorum \n" +
                "Ellerini tutup k�sa bir gezintiye ��k�yorum\n" +
                "Ve ben r�zgar�nda savruluyorum\n";
        rows[1]="G�zel  g�nler bizi soruyor    \n" +
                "G�zlerimizi kapat�p y�r�yelim korkmadan \n" +
                "Bilmesinler nereye gitti�imizi\n" +
                "Ellerin ellerimde \n" +
                "G�r�nmez olal�m\n" +
                "Birbirimizin g�lgesinde soluklanal�m\n" +
                "Her h�cremizde mutlulu�u hissedelim\n" +
                "Herkes sussun kalplerimiz konu�sun\n" +
                "Ku�lar�n dans�na ruhumuz e�lik etsin\n" +
                "Biz y�r�yelim\n";
        rows[2]="A�k�n eli de�di de�eli     \n" +
                "��ime d��t� hi� s�nmeyen bir k�z\n" +
                "�ekti kurtard� beni bu garip d�nyadan  \n" +
                "G�nl�m�n kap�s�n� a�t� o bir �ift g�z\n" +
                "Ruh kalpte saklan�rm��,sen varana dek\n" +
                "�lsem bile dilimde hep ayn� s�z\n" +
                "Seni seviyorum\n" +
                "A�klar�n en durusu, en g�zelisin sevgilim\n";
        rows[3]="Sevgilim nolursun dar�lma, k�r�lma bana\n" +
                "Senin bu �zg�n halin beni yaral�yor\n" +
                "Mutsuzluk hi� yak��m�yor sana\n" +
                "Kendini bilmezim ama kalbim senin i�in at�yor\n" +
                "\n" +
                "Seni hi� �zmek istemem asl�nda\n" +
                "Cezay� bize de�il bana keselim\n" +
                "Sevgimiz benim taraf�mdan hep korumada\n" +
                "Her �eye inat y�lmay�p devam edelim\n";
        rows[4]="�kimizi biraraya getiren kader bizi ke�fetti  \n" +
                "Beni sana,seni bana  yazd�\nBize kendi cumhuriyetimizi bah�etti\n" +
                "Kalbime senin sevgini s��d�rd�\n";
        rows[5]="Seni sakl�yorum,    \n" +
                "Avu�lar�mda ya�muru biriktirdi�im gibi\n" +
                "D�meni olmayan bir gemiyim\n" +
                "Rotam hep seni g�steriyor\n" +
                "Bat�p ��k�yorum \n" +
                "Denizinde bo�uluyorum\n" +
                "Dalgalar k�y�daki yosunlar� d�verken\n" +
                "Beni de sana g�t�r�yor    \n" +
                "Elimi tuttun ve beni ��kard�n\n" +
                "G�zlerimizin olu�turdu�u yakamoz\n" +
                "Y�llar sonras�na ���k tutuyor   \n" +
                "�kimize bir ayd�nl�k bir yol �iziyor\n" +
                "Ruhunu ruhuma kat ki yorulmadan y�r�yelim\n" +
                "Kalbimizin besteledi�i �ark�y�\n" +
                "R�zgara b�rakal�m ki\n" +
                "A�k� herkese ��retelim\n" +
                "G�zlerimiz kapansa da  umudu hi� kaybetmeyelim\n";
        rows[6]="Ah be Sevdi�im,\n" +
                "Bir bilsen\n" +
                "�imdi bo� bir kasabay� and�r�yorum   \n" +
                "Nefesini yan�mda hissedemedi�imden\n" +
                "Kula��m� her �eye t�k�yorum  \n" +
                "Sadece senin sesini duymak i�in\n" +
                "Oturmu� balkonumda denizi izliyorum\n" +
                "R�zgar�nda seni koklamak i�in\n" +
                "Kendimi d��ar� at�yorum\n" +
                "Att���m�z ad�mlar� bulmak i�in\n" +
                "G�zlerimi karanl��a b�rak�yorum\n" +
                "S�rf seni g�rs�nler diye\n" +
                "Uykuya bel ba�l�yorum\n" +
                "Zaman seni bana getirsin diye\n" +
                "Resimlere, �iirlere sar�l�yorum\n" +
                "�zlemine belki �are olurlar diye\n" +
                "Ellerimi yan�nda g�nderiyorum\n" +
                "B�yle ne kadar yaln�zlar,   \n" +
                "Bir bilsen\n";
        rows[7]="Kalbime dokunan sesin hep kula��mda\n" +
                "Sensiz gelecekse yar�n olmaz olsun\n" +
                "G�z�m� kapayacaksam da bir sen olacaks�n yan�mda\n" +
                "Benim nazl� sevdice�imin �mr� uzun olsun\n\n" +
                "Bana �iiri ��reten k�z seni �oooooook seviyorum Birtanem\n" +
                "�yi ki vars�n Tebrikler bana iyi ki seni sevmi�im\n";
        rows[8]="Sensiz ya�mas�n ya�mur,\n" +
                "A�mas�n �i�ekler.\n" +
                "�lk defa �zlemle yanan bu kalp;\n" +
                "Atmas�n i�inde sen olmad�k�a\n" +
                "Her�ey anlaml� �imdi g�z�mde\n" +
                "Sende ki ben her g�l���ne muhta�     \n" +
                "Herkes benden bir �m�r uzakta \n" +
                "Ama sen hep solumda...\n" +
                "\n                            �znem...\n";
        rows[9]="Ge�en g�n senin yan�nda akl�ma �l�m�m geldi\n" +
                "Sensizlik bir m�zrak gibi sapland� kalbime\n" +
                "O son an� hat�rlad�m, o seni koyup gidi�imi \n" +
                "�lk defa bu kadar �z�ld�m d�nyaya geldi�ime\n";
        rows[10]="Bir yol d���n ki hep ayd�nl�k\n" +
                "Bir yar�n d��le ki hi� d�nde kalmayacak\n" +
                "Bir d�nya hat�rla ki g�zlerimizi ilk a����m�z\n" +
                "Bir kitap oku ki sonu bizle biten\n";
        rows[11]="Sarmaksa g�zlerini �ocuksu g�l���nden,\n" +
                "Can�m� can�na kat derecesine.\n" +
                "Ba�tan yazmaksa hayat� sa��n�n bir telinden,\n" +
                "Sonuma yan�mda seni g�t�r�rcesine\n";
        rows[12]="G�nl�m pe�inden ko�ar durmaks�z�n\n" +
                "Bir an olsun kokunu duymak\n" +
                "S�zlerini yakalamak suskun bak��lar�ndan\n" +
                "M�sralar halinde kalbime kaz�mak i�in\n\n" +
                "Her ya�tan umut ta��yan g�zlerin hi� yenik d��mesin,\n" +
                "e�er g�remezsem seni hayallerime emanet ediyorum ellerini.\n" +
                "can tanem,can�m�n canan�,kalbimin sultan�,tatl� belam, " +
                "doyamad���m,ba� tac�m,bahar kokulum,a�k mele�im,cennet,\n " +
                "mekan�m,k�r �i�e�im,�m�r g�zl�m\n";
        if(day==3)
            tv.setText(one);
        else if(day==12)
            tv.setText(twelve);
        else
            tv.setText(rows[day%13]);


    }
}
