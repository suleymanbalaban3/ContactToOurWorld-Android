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

        String twelve="Bugün tanýþma günümüz :) :) <3 \n\nS\ne\nn\ni\n" +
                "\nH\ne\ne\ne\ne\n\np\nç\no\no\no\nk\n\nSeviyorum\n";
        String one="Bugün baslangýç günümüz :) :) <3 \n\nS\ne\n n\ni\n" +
                "\nH\ne\ne\ne\np\n\nç\no\no\nk\n\nSeviyorum\n\n" +
                "Ýyi Ki Varsin\n";
        String[] rows = new String[20];
        rows[0]="Seni ,yalnýzca seni seviyorum ben\n" +
                "Bir nisan rüzgarýnda seni buluyorum \n" +
                "Sesin kulaðýma aþký fisýldýyor\n" +
                "Seni içime çekip sarhoþ oluyorum\n" +
                "Gözlerine bakýp boþlukta kayboluyorum \n" +
                "Ellerini tutup kýsa bir gezintiye çýkýyorum\n" +
                "Ve ben rüzgarýnda savruluyorum\n";
        rows[1]="Güzel  günler bizi soruyor    \n" +
                "Gözlerimizi kapatýp yürüyelim korkmadan \n" +
                "Bilmesinler nereye gittiðimizi\n" +
                "Ellerin ellerimde \n" +
                "Görünmez olalým\n" +
                "Birbirimizin gölgesinde soluklanalým\n" +
                "Her hücremizde mutluluðu hissedelim\n" +
                "Herkes sussun kalplerimiz konuþsun\n" +
                "Kuþlarýn dansýna ruhumuz eþlik etsin\n" +
                "Biz yürüyelim\n";
        rows[2]="Aþkýn eli deðdi deðeli     \n" +
                "Ýçime düþtü hiç sönmeyen bir köz\n" +
                "Çekti kurtardý beni bu garip dünyadan  \n" +
                "Gönlümün kapýsýný açtý o bir çift göz\n" +
                "Ruh kalpte saklanýrmýþ,sen varana dek\n" +
                "Ölsem bile dilimde hep ayný söz\n" +
                "Seni seviyorum\n" +
                "Aþklarýn en durusu, en güzelisin sevgilim\n";
        rows[3]="Sevgilim nolursun darýlma, kýrýlma bana\n" +
                "Senin bu üzgün halin beni yaralýyor\n" +
                "Mutsuzluk hiç yakýþmýyor sana\n" +
                "Kendini bilmezim ama kalbim senin için atýyor\n" +
                "\n" +
                "Seni hiç üzmek istemem aslýnda\n" +
                "Cezayý bize deðil bana keselim\n" +
                "Sevgimiz benim tarafýmdan hep korumada\n" +
                "Her þeye inat yýlmayýp devam edelim\n";
        rows[4]="Ýkimizi biraraya getiren kader bizi keþfetti  \n" +
                "Beni sana,seni bana  yazdý\nBize kendi cumhuriyetimizi bahþetti\n" +
                "Kalbime senin sevgini sýðdýrdý\n";
        rows[5]="Seni saklýyorum,    \n" +
                "Avuçlarýmda yaðmuru biriktirdiðim gibi\n" +
                "Dümeni olmayan bir gemiyim\n" +
                "Rotam hep seni gösteriyor\n" +
                "Batýp çýkýyorum \n" +
                "Denizinde boðuluyorum\n" +
                "Dalgalar kýyýdaki yosunlarý döverken\n" +
                "Beni de sana götürüyor    \n" +
                "Elimi tuttun ve beni çýkardýn\n" +
                "Gözlerimizin oluþturduðu yakamoz\n" +
                "Yýllar sonrasýna ýþýk tutuyor   \n" +
                "Ýkimize bir aydýnlýk bir yol çiziyor\n" +
                "Ruhunu ruhuma kat ki yorulmadan yürüyelim\n" +
                "Kalbimizin bestelediði þarkýyý\n" +
                "Rüzgara býrakalým ki\n" +
                "Aþký herkese öðretelim\n" +
                "Gözlerimiz kapansa da  umudu hiç kaybetmeyelim\n";
        rows[6]="Ah be Sevdiðim,\n" +
                "Bir bilsen\n" +
                "Þimdi boþ bir kasabayý andýrýyorum   \n" +
                "Nefesini yanýmda hissedemediðimden\n" +
                "Kulaðýmý her þeye týkýyorum  \n" +
                "Sadece senin sesini duymak için\n" +
                "Oturmuþ balkonumda denizi izliyorum\n" +
                "Rüzgarýnda seni koklamak için\n" +
                "Kendimi dýþarý atýyorum\n" +
                "Attýðýmýz adýmlarý bulmak için\n" +
                "Gözlerimi karanlýða býrakýyorum\n" +
                "Sýrf seni görsünler diye\n" +
                "Uykuya bel baðlýyorum\n" +
                "Zaman seni bana getirsin diye\n" +
                "Resimlere, þiirlere sarýlýyorum\n" +
                "Özlemine belki çare olurlar diye\n" +
                "Ellerimi yanýnda gönderiyorum\n" +
                "Böyle ne kadar yalnýzlar,   \n" +
                "Bir bilsen\n";
        rows[7]="Kalbime dokunan sesin hep kulaðýmda\n" +
                "Sensiz gelecekse yarýn olmaz olsun\n" +
                "Gözümü kapayacaksam da bir sen olacaksýn yanýmda\n" +
                "Benim nazlý sevdiceðimin ömrü uzun olsun\n\n" +
                "Bana þiiri öðreten kýz seni çoooooook seviyorum Birtanem\n" +
                "Ýyi ki varsýn Tebrikler bana iyi ki seni sevmiþim\n";
        rows[8]="Sensiz yaðmasýn yaðmur,\n" +
                "Açmasýn çiçekler.\n" +
                "Ýlk defa özlemle yanan bu kalp;\n" +
                "Atmasýn içinde sen olmadýkça\n" +
                "Herþey anlamlý þimdi gözümde\n" +
                "Sende ki ben her gülüþüne muhtaç     \n" +
                "Herkes benden bir ömür uzakta \n" +
                "Ama sen hep solumda...\n" +
                "\n                            Öznem...\n";
        rows[9]="Geçen gün senin yanýnda aklýma ölümüm geldi\n" +
                "Sensizlik bir mýzrak gibi saplandý kalbime\n" +
                "O son aný hatýrladým, o seni koyup gidiþimi \n" +
                "Ýlk defa bu kadar üzüldüm dünyaya geldiðime\n";
        rows[10]="Bir yol düþün ki hep aydýnlýk\n" +
                "Bir yarýn düþle ki hiç dünde kalmayacak\n" +
                "Bir dünya hatýrla ki gözlerimizi ilk açýþýmýz\n" +
                "Bir kitap oku ki sonu bizle biten\n";
        rows[11]="Sarmaksa gözlerini çocuksu gülüþünden,\n" +
                "Canýmý canýna kat derecesine.\n" +
                "Baþtan yazmaksa hayatý saçýnýn bir telinden,\n" +
                "Sonuma yanýmda seni götürürcesine\n";
        rows[12]="Gönlüm peþinden koþar durmaksýzýn\n" +
                "Bir an olsun kokunu duymak\n" +
                "Sözlerini yakalamak suskun bakýþlarýndan\n" +
                "Mýsralar halinde kalbime kazýmak için\n\n" +
                "Her yaþtan umut taþýyan gözlerin hiç yenik düþmesin,\n" +
                "eðer göremezsem seni hayallerime emanet ediyorum ellerini.\n" +
                "can tanem,canýmýn cananý,kalbimin sultaný,tatlý belam, " +
                "doyamadýðým,baþ tacým,bahar kokulum,aþk meleðim,cennet,\n " +
                "mekaným,kýr çiçeðim,ömür gözlüm\n";
        if(day==3)
            tv.setText(one);
        else if(day==12)
            tv.setText(twelve);
        else
            tv.setText(rows[day%13]);


    }
}
