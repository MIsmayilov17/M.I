package com.example.mi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int secilmis=0;
    int deneme_sayi =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();

        Button random = (Button) findViewById(R.id.Raandom);
        TextView random_soz = (TextView) findViewById(R.id.random_soz);
        Button goster = (Button) findViewById(R.id.gozster);
        TextView tercume = (TextView) findViewById(R.id.tercume);
        EditText baslangic = (EditText) findViewById(R.id.baslangic);
        EditText son = (EditText) findViewById(R.id.son);
        TextView dogru_cavab = (TextView) findViewById(R.id.dogru_cavab);
        TextView yalnis_cavab  =(TextView) findViewById(R.id.yalnis_cavab);
        ProgressBar bar = (ProgressBar) findViewById(R.id.progressBar);




        String hata = "lutfen buyuk rakam ve kucuk rakama dikkat ediniz";
        int hamisi = 0;
        int[] secilmis_regem = new int[500];
        ArrayList<Integer> arrayList = new ArrayList<>();

        int araliq = Integer.parseInt(son.getText().toString())-Integer.parseInt(baslangic.getText().toString());
        int deneme_sozsayi = araliq;
        int baslangic_soz = Integer.parseInt(baslangic.getText().toString());
        int son_soz = Integer.parseInt(son.getText().toString());


        String [] ingilis = new String[]{"good morning" , "good afternoon" , "good evening",
                "Goodnight "," Goodbye  ","Bye-Bye ", "Sleep well  ","Have a good / nice sleep!  "," Sweet dreams!",
                " So long! ","See you (later/soon/tomorrow)!  ","Till tomorrow!  ", "Be careful",".   Take care!  ","Look out!  ",
                "Watch out! ","Take care of yourself!  "," Good luck! ", "Have a good / nice time "," Have a good weekend","Have a good / nice journey / trip! ",
                "Bon voyage "," Have a good flight! ","Have a good holiday!  ", "Same to you!  "," Drop in anytime! "," Come to see us again!  ",
                "Cheers!-  ","Happy birthday "," Happy /Merry Christmas!- ", " Happy New Year! "," Congratulations! "," Congratulations! ",
                "Best wishes  ","Thanks "," Thanks a lot", " Thank you very (so / too) much! "," You’re welcome. ","Not at all ",
                "Don’t mention it","Please","Excuse me","Pardon me! ", "Excuse me, can you help me? ","Sorry! ","I am (really) sorry! ","Sorry? ",
                "Can (Could) you repeat that, please? ","(I’m) Nice/Glad/Pleased/Great to meet you! ","Keep in touch! ","How’re things ", "Everything is OK (Alright). ","Just the same. ","As usual / always ","Give my regards to your mother ",
                "What’s happened to you? ","actually","really","else", " around","about","approximately","approximately",
                "why not","it’s up to you","It depends on you"," I don’t mind", "It doesn’t matter ","What a pity","Hurry up! ","absolutely",
                "agree (with) ","disagree","argue (with) ","get on well (with)", "get by ","of course","confident (about) ","shy ",
                "embarrassed (about / by) ","excited (about","worried (about) ","relaxed", " comfortable ","uncomfortable ","full"," nervous ",
                "calm","patient","impatient","sad", "upset","fed up (with) ","sleepy","in pain ", "sick / ill ","hurt","hurt","hurt",
                "homesick","proud","confused ","in a good / bad ", "love","like","hate","prefer",
                "hope","want"," adore ","admire ", " can’t stand ","relative","close relative ","distant relative ",
                "distant relative ","parent","grandparent","niece", "niece","sweet daddy","an only child","in-laws ",
                "brother-in-law ","sister-in-law ","father-in-law ","mother-in-law ", "son-in-law ","daughter-in-law ","great-grandfather ","great-grandmother ",
                "twins","triplets ","maternity"," paternity ", "large family "," orphan child ","to adopt a child ","to raise a child ",
                "birth","to be born","call after","(on) birthday", "baby","toddler"," teenager","young- ",
                "adult","middle-aged","old- ","retired- ", "centenarian","be in love (with) ","fall in love (with) ","get engaged (to) ",
                "get married (to) ","get separated ","get divorced (from) "," single", "engaged (to) ","married (to) "," separated","divorced (from) ",
                "widowed","fiancé","fiancée"," marriage ", "wedding","bride"," groom","common-law couple ","(on) honeymoon"," death ","dead",
                "to die ","funeral" ,"height","How tall are you", "tall","short- ","medium height","How heavy are you?- ",
                "weight- "," thin","skinny","slim", "  fat","plump","stout ","overweight",
                "well built ","slender ","put on/gain weight ","lose weight ", "dark","blonde/ blond ","fair ","curly",
                "straight","wavy","spiky hair ","haircut ", "short hair ","long hair ","shoulder-length hair ","bald  ",
                "wig ","hairstyle ","fringe ","ponytail ", "braid ","French braid ","bun ","skin",
                "leather","moustache ","beard","nice", "pretty ","beautiful ","gorgeous","attractive ",
                "handsome ","good-looking ","average-looking","plain ", "ugly ","fine","feel","doctor",
                "patient","heart attack- ","sick","vomit", "temperature","take medicine","tablets","hab",
                "drug","liquid","flu","dentist", "toothache","headache","get a cold","sneeze",
                "bless you","cough","asthma","fever", "malaria","cholera","cancer","healthy",
                "relax","exercise","letter ","text ", "message ","call ","have a short call","deliver",
                "line is engaged","hung up","hold on","date", "address","envelope","stamp","letter box",
                "screen","keyboard","mouse","memory stick ", "email","send","get","save",
                "spam","voicemail","speak to","take message", "call back","journey","vacation","voyage ",
                "on business","trip","travel ","package ", "flight","include ","camp","tent",
                "coach","plane","car","bus", "ferry","train","passport ","visa ",
                "ticket ","cheque","currency ","camera ", "luggage ","suitcase ","rucksack","local ",

                "food","enjoy","nightlife ","move", "place","thing","lift","elevator ",
                "key","reception","luggage","form", "hairdryer ","single room","double room","reservation",
                "view","Here you are","over there","fill", "sign","signature","to be sure","correct", "check out","service","outside line ","breakfast ",
                "lunch ","dinner ","supper ","watch ", "programme ","listen ","play ","headphones ",
                "mp3 player ","download ","chat ","cooking ", "gardening ","grow ","flower ","vegetable ",
                "novel  ","different  ","same ","magazine  ", "have someone around ","come to stay ","on the phone ",

                "be , was  ,  been","beat   ,  beat    beaten ","become    became    become","begin    began    begun",
                "bite    bit     bitten","blow     blew      blown","break    broke      broken","bring    brought       brought", "buld    built    built","burn     burned      burned","buy    bought    bought",
                "catc    caught     caught","choose    chose     chosen","come     came   come","cost    cost     cost", "cut     cut      cut","deal     dealt     dealt","do   did   done","draw    drew    drawn ",
                "dream     dreamed       dreamed ","drink    dank     drunk ","drive     droe      driven","eat    ate      eaten", "fall       fell     fallen","feel     felt     felt","fight     fought     fought","find    found     found",
                "fiy      flew        flown","forget    forgot     forgotten","forive      forgave     forgiven","reeze    froze    frozen", "get    got     got","give   gave     given ","go   went    gone","grow    grew    grown",
                "hang     hung      hung","have     had     had","hear    heard    heard","hide    hid    hidden",
                "hit    hit     hit","hold      held     held","hurt     hurt     hurt","keep    kept   kept", "know    knew     known","learn    learned     leaned","leave   left   left","lend   lent   lent",
                "let    let   let","lie   lay     lain","lose    lost      lost","make    made    made",
                "mean     meant    meant","meet   met     met","pay     paid    paid","put   put    put", "read    read     read","ride     rode    ridden","ring    rang     rung","run   ran     run",
                "say     said     said","see       saw    seen","sell      sold     sold","send     sent    sent","se    set     set",
                "shake    shook      shaken","shine     shone     shone","show     showed    shown","shut   shut   shut", "sing   sang    sung","sit    sat    sat","sleep      slept       slept","smell     smelled    smelled",
                "speak     spoke     spoken","spend     spent   spent","spell    spelt     spelt","spill     spilled       spilled",
                "stand    stood     stood","steal      stole    stolen","swim      swam     swum","take    took     taken", "teach     taught     taught","tear     tore    torn","tell    told    told","think     thought     thought",
                "throw    threw      thrown","understand       understood      understood","wake   woke   woken","wear   wore    worn",
                "win   won    won","write     wrote      written",

                "western","horror","action ","musical", "cartoon","comedy","thriller","science fiction",
                "romantic comedy","film star","director","enjoy", "boring","make a film ","take photo","sun",
                "rain","cloud","lightning","thunder", "wind","fog","snow","sunny", "rainy","windy","cloudy","snowy", "foggy","thundery","hot","cold",
                "cool","mild","degree","dry", "wet","hurricane","storm","sightseeing", "shining","lovely","horrible","warm", "train","bus","plane","railway",
                "museum","mosque","church","cathedral", "cemetery","library","town hall","pedestrian",
                "bike","van","lorry","coach", "exit","entrance","left","right", "walk","out of order","road","way",
                "take left","traffic light","turn","look for", "get on","get of","fare","fine","side",
                "stop","bridge","near ","far ", "cash machine ","bank ","motorbike ","underground ",
                "subway ","tube ","metro ","boat ", "ship ","helicopter ","map ","timetable ",
                "customs ","luggage ","passport ","reserve ", "book ","seat ","in advance","single ", "return ","arrive ","platform ","depart ",
                "leave ","car ","change ","direct ", "take off ","boarding card ","fligt attendant ","land ",
                "through ","hire ","fill ","rent ", "petrol ","mountain ","forest ","village ",
                "hill ","lake ","path ","field ", "river ","country road ","farm ","wood ",
                "cottage ","nature ","conservation ","wild ", "park ","area ","picnic ","special ",
                "festival ","Christmas ","present ","decorate ", "dance ","toast ","organization ","Easter ",
                "vary ","dress up ","knock ","sweet ", "bonfire ","fireworks ","traditional ","roast ",
                "beef ","oven ","education ","nursery ", "primary ","secondary ","state ","private ",
                "royal ","king ","queen ","political ", "decision ","Prime Minister","leader ", "criminal ",
                "robbery ","robber ","rob ","murder ", "murderer ","burglary ","burglar ","mugging ",
                "mugger ","car theft ","car thief ","steal ", "drug dealing ","drug dealer ","terrorism","terrorist ",
                "attack ","shoplifting ","shoplifter ","kidnapping ", "kidnapper ","pickpocket ","blackmail ","rape ",
                "law ","arrest ","court ","jail ", "guilty ","innocent ","prison ","cell ",
                "smash ","hooliganism ","trouble ","news ", "important ","soap opera ","story ","documentary ",
                "social ","talk show ","cartoon ","reality ", "magazine ","adverts ","persuade ","type ",
                "interview ","reporter ","journalist ","favourite ", "channel ","Whats on","repair ","break ",
                "need ","mend ","plant ","die ", "forget ","to water ","untidy  ","tidy ",
                "lose ","help ","cut ","apologise ", "to be late ","crash ","natural ","disaster ",
                "hurricane ","snowstorm ","forest fire ","earthquake ", "flood ","crowded ","poor ","homeless ",
                "unemployed ","pollution ","polluted ","war ", "earth ","dirty ","fresh ","job ",
                "independence","fight ","nationality ","to last ", "to go on ","to continue ","to carry on ","on strike ",
                "refuse ","traffic jams ","rush hour","say hello ", "tell story ","tell phone number ","tell the truth ","tell a lie ",
                "tell a joke ","ask for ","speak ","talk ", "answer ","reply ","walk ","run ",
                "jump ","dance ","swim ","climb ", "fall ","ride ","drive ","fly ",
                "pass ","carry ","miss ","catch ", "day ","week ","month ","year ",
                "fortnight ","hour ","minute ","second ", "century","yesterday","today","tomorrow",
                "evening ","afternoon ","morning ","night  ", "midnight ","season ","spring ","summer ",
                "autumn ","winter ","last ","next ", "then ","now ","later ","after ",
                "ago ","in the past  ","in the future ","always ", "usually ","often ","sometimes ","occasionally ",
                "rarely ","never ","once ","twice ", "three times ","in a moment ","at the moment","on time ", "in time ","soon ","recently ",

                "quite", "quiet","lose","loose","fell",
                "feel","cook","cooker","lend to-lend ", "borrow from","check","control","expect",
                "expect","ex-wife","half-price","informal", "impossible","pre-school-","redo","unsafe",
                "worker","swimmer","instructor","cooker", "calculator","useful","beautiful","useless",
                "endless","quickly","happily","happiness", "sadness","sandy","sunny","listen to",
                "wait for","ask for","pay for","come to", "belongs to","think about","thank for","apologise for",
                "look for","look like","look up","look forward to","look through","look out- ","look after","take after",
                "take care- ","good at","bad at","interested in", "afraid of-","proud of","great","wonderful"
                ,"excellent","dreadful","terrible","terrific", "horrible","perfect","awful","how nice",
                "how awful","kind-kaɪnd ","lovely ","easy going"," intelligent ","stupid","selfish","well-behaved ",
                "naughty","","","",
                "","","",""

        };



        String []az = new String[]{
                  // 1 -
                "Sabahınız xeyir","Günortanız xeyir","Axşamınız xeyir","Gecəniz xeyrə",
                "Sağ olun. Xudahafis! Salamat qalın","Sağ olun. Xudahafis! Salamat qalın.","Yaxşı yuxular!","Yaxşı yuxular!", "Şirin yuxular!","Hələlik! Görüşənədək!","Hələlik! Görüşənədək!","Sabaha qədər.",
                "Ehtiyyatlı ol!","Ehtiyyatlı ol!","Ehtiyyatlı ol!","Ehtiyyatlı ol!", "Özünə yaxşı bax!","Uğurlar!","Xoş əyləncələr!","Xoş həftə sonu!",
                "Xoş səyahət!","Xoş səyahət!","Xoş uçuş!","Xoş tətil!", "Sizə də. Sizin də","- İstənilən vaxt gəlin, baş çəkin","Yenə gəlin!","Sağlığa!",
                "Ad gününüz mübarək!","Milad bayramınız mübarək!","Yeni iliniz mübarək","Təbriklər!", "Əla! Afərin!","Ən xoş arzularla","Sağ olun. Təşəkkürlər","Çox sağ olun",
                "Çox sağ olun","Dəyməz. Buyurun","Dəyməz. Buyurun","Dəyməz. Buyurun", "Zəhmət olmasa. Buyurun","Zəhmət olmasa. Buyurun","Zəhmət olmasa. Buyurun","Bağışlayın, mənə kömək edə bilərsiz?",
                "Bağışlayın.Üzr istəyirəm","Bağışlayın.Üzr istəyirəm","Necə? Nə dediniz? ","Necə? Nə dediniz? ", "Tanış olduğuma şadam","Əlaqə saxlıyaq! ","- Nə var nə yox? ","Hər şey yaxşıdır.",
                "Elə eyni. Əvvəlki kimi","- Həmişəki kimi","Salamlarımı … çatdırın","Sizə nə olub?",


                   // 2-56
                "əslində","həqiqətən","daha, başqa","ətrafında, ətrafda, təxminən",
                "haqqında, barədə, dair, aid,","təxminən, təxmini","hər halda, istənilən halda","niyə də yox",
                "Bu səndən asılıdır.","- Bu səndən asılıdır.","Mən etiraz etmirəm","Fərq etmir.",
                "Heyf ki. Təəssüf","Tələs!","tamamilə","- razılaşmaq", "razılaşmaq","mübahisə etmək","yola getmək","yola vermək", "əlbəttə",


                   //3-77
                "– inamlı, arxayın","utancaq","xəcalətli", "həyəcanlı","narahat, nigaran, ","rahat","rahat",
                "narahat, rahat olmayan","tox, doymuş","gərgin, əsəbi","sakit, dinc", "səbirli, hövsələli, taqətli","səbirsiz, hövsələsiz, taqətsiz","qəmgin","dilxor",
                "bezmiş, usanmış, boğaza yığılmış","yuxulu","ağrı içində","xəstə", " incimiş","yalnız","aşiq, vurulmuş","evi və ya vətəni üçün darıxan",
                "qürurlu, iftixarlı, məğrur","fikri qarışmış, çaşqın, şaşqın","kefi saz olan, kefi yaxşı olan, şən ","sevmək", "bəyənmək","bəyənmə","- üstün tutmaq, üstünlük vermək","- ümüd etmək", "istəmək","heyran olmaq","heyran olmaq","dözə bilməmək",


                   //5-111
                "qohum","yaxın qohum","uzaq qohum","əlaqə", "valideyn","böyük valideyn","bacı qızı","bacıoğlu",
                "dayday","- tək övlad","ər / arvad tərəfindən qohumlar","qayın, yeznə, bacanaq", "baldız, elti, qardaş arvadı","qayınata","qayınata","kürəkən",
                "gəlin","ulu baba","ulu nene","əkiz", "üçəm","analıq, anaya aid"," atalıq, ataya aid","geniş ailə", "yetim, kimsəsiz uşaq","Övladlığa götürmək","uşaq böyütmək, tərbiyə etmək",


                  //6-  (110)--137
                " doğum", "doğulmaq"," ad qoymaq","ad günü","körpə",
                "dil açan uşaq","yeniyetmə","cavan","gənc", "orta yaşlı","qoca","təqaüdə çıxmış","yüzyaşlı",
                "aşiq olmaq, vurulmaq","aşiq olmaq, vurulmaq","nişanlanmaq","evlənmək, kəbin kəsdirmək", "ayrılmaq","boşanmaq"," subay","nişanlı",
                "evli","ayrı","boşanmış","dul", "nişanlı (oğlan)","nişanlı (qız","evlilik, nigah, kəbin","toy",
                "gəlin","bəy","nigahsız cütlük","bal ayı", "ölüm","ölü"," ölmək","dəfn",



                  //10-174
                "boy","Boyunuz nə qədərdir?","hündür","qısa", "orta boylu","Çəkiniz nə qədərdir?","çəki","arıq",
                "arıq, cılız","incə","kök","kök", "kök","artıq çəkili","gövdəli","düz qamətli",
                "kökəlmək","arıqlamaq","tünd","sarışın", "sarışın","buruq","düz","dalğalı",
                "sivri uclu saç","saç kəsimi","qısa saç","uzun saç", "çiyin uzunluğunda saç","keçəl","parik","saç düzümü",
                "tel","at quyruğu şəklində saç yığımı","hörük","sünbül hörük", "toppuz ","dəri","dəri ","bığ",
                "saqqal","qəşəng, göyçək, xoş, sevimli","qəşəng, göyçək, xoş, sevimli","gözəl, allı-güllü", "ecazkar","cazibədar","yaraşıqlı","xoş görünən, göyçək", "orta görünüşlü","sadə","çirkin",


                   //11-227
                "yaxşı", "hiss etmək","həkim","xəstə","infakt",
                "xəstə","qusmaq","hərarət","dərman atmaq", "dərman","həb","dərman",
                "maye","qrip","diş həkimi","diş ağrısı", "baş ağrısı","soyuqlamaq","asqırmaq","- sağlam ol",
                "öskümək","asma","qızdırma","malyariya", "xolera","canser", "sağlam","istirahət","idman etmək",



                  //15-256
                "məktub","mətn","mesaj","zəng", "vzv atmaq","çatdırılma","xətt məşğuldur","dəstəyi asmaq",
                "xəttə gözləmək","tarix","ünvan","zərf", "möhür","məktub qutusu","ekran","klaviatura", "siçan","yaddaş çubuğu","poçt","göndərmək",
                "əldə etmək","saxlamaq","gizli","səsli göndəriş", "danışmaq","mesaj qoymaq","geri yığmaq",


                   //16- 281
                "səfər", "məzuniyyət","dəniz səfəri","iş səfərində olmaq","səyahət",
                "səyahət","paketləşdirilmiş","uçuş","daxil olmaq", "düşərgə","çadır","kareta","təyyarə",
                "maşın","avtobus","gəmi","qatar", "vəsiqə","viza","bilet",
                "çek","valyuta","kamera","yük", "çamadan","bel çantası","yerli","qida", "əylənmək","gecə həyatı","köçmək",


                  //17-  314
                "yer", "əşya","lift","qaldırıcı","açar", "qeydiyyat","yük","anket","fen",
                "tək nəfərlik otaq","iki nəfərlik otaq","sifariş","görünüş", "Buyurun","orada","doldurmaq","imzalamaq",
                "imza","əmin olmaq","düz","yoxlamaq", "xidmət","kənar xətt","səhər yeməyi","qəlyanaltı", "nahar","şam yeməyi",


                   //18-  340
                "baxmaq, seyr etmək, izləmək","veriliş","qulaq asmaq, dinləmək","oynamaq, çalmaq",
                "qulaqcıq","mp3 player","yükləmək","söhbət etmək",
                "yemək-bişirmə","bağçılıq","böyütmək,yetişdirmək, becərmək","gül",
                "tərəvəz","roman","fərqli, müxtəlif","eyni",
                "jurnal","qalmağa gəlmək","qalmağa gəlmək","telefonda, telefonla",



                   //paasiv voice  -- 360
                "olmaq","qalib gemek","olmaq","baslamaq", "dislemek","zerbe vurmaq","qirmaq","getirmek",
                "qurmaq","yandirmaq","almaq","tutmaq", "secmek","gemek","qiymet","kesmek",
                "mesgul olmaq","etmek","cekmek","yux gormek","sicek", "surmek","yeek","dusmek","hiss etmek",
                "mubarze etmek","tapmaq","ucmaq","unutmaq", "bagislamaq","donmaq","almaq","vermek",
                "getmek","boyumek","asmaq","var omaq", "esitmek","gizletmek","vurmaq","tutmaq",
                "incitmek","saxlamaq","bilmek","oyrenmek", "buraxmaq","borc vermek","qoymaq","yalan",
                "itirmek","etmek","demek","gorusmek", "odemek","qoyma","oxumaq","surmek",
                "calmaq","qacmaq","demek","gormek", "satmaq","gondermek","qurmaq","silkelemek",
                "parlamaq","gostermek","baglamaq","oxumaq", "oturmaq","yatmaq","iylemek","danismaq",
                "xerclemek","yarmaq","tokmek","durmaq", "ogurlamaq","uzmek","almaq","oyretmek",
                "cirmaq","soylemek","dusunmek","atmaq", "anlamaq","oynamaq","geyinmek","qazanmaq", "yanmaq",

                  //22-  451
                "qərbi","qorxulu","vuruşma","musiqili", "cizgi filmi","komediya","triller","fantastika",
                "romantik komediya","kino ulduzu fɪlm","rejissor","əylənmək", "darıxdırıcı","film çəkmək","şəkil çəkmək",

                  //24  -- 466
                "günəş", "yağış","bulud","şimşək","gurultu", "külək","duman","qar","günəşli", "yağışlı","küləkli","buludlu","qarlı",
                "dumanlı","ildırım","isti","soyuq", "sərin","mülayim","dərəcə","quru",
                "yaş","tufan","qasırğa","gəzməli yerlər", "parlaq","sevimli","qorxunc","ilıq",


                    //25- 494
                "qatar","avtobus","təyyarə","dəmiryolu", "muzey","məscid","kilsə","baş kilsə",
                "qəbirsanlıq","kitabxana","hökumət evi","piyada", "velosiped","furqon","yük maşını","vaqon",
                "çıxış","giriş","sol","sağ", "gəzmək","işləmir","yol","yol",
                "soldan dön","işıqfor","dönmək","axtarmaq", "minmək","düşmək","yol pulu","cərimə",
                "tərəf","dayanacaq","körpü","yaxın", "uzaq","bankomat","bank","motosiklet",
                "metro","metro","metro","metro", "qayıq","gəmi","vertolyot","xəritə",
                "cədvəl","gömrük","yük","vəsiqə", "sifariş","sifariş","yer","əvvəlcədən",
                "gediş","qayıdış","çatmaq","perron", "yola düşmək","tərk etmək","maşın","dəyişmək",
                "birbaşa","yerdən götürülmək","minik kartı","stüardessa", "yerə enmək","vasitəsilə","kiralamaq","doldurmaq","kiralamaq", "yanacaq",

                   //26  -  569
                "dağ","meşə","kənd", "təpə","göl","cığır","tarla",
                "çay","kənd yolu","ferma","ağaclıq", "daxma","təbiət","qoruq","vəhşi", "park","ərazi","gəzinti",

                   //29-  587
                "xüsusi", "mərasim","Milad","hədiyyə","bəzəmək",
                "rəqs etmək","tost","təşkilat","pasxa", "fərqlilik","xüsusi geyinmək","qapı döymək","şirin",
                "tonqal","atəşfəşanlıq","ənənəvi","qızardılmış", "mal əti","soba","təhsil","uşaq bağçası",
                "ibtidai","orta","dövlət","özəl", "krallıq","kral","şəhzadə","siyasi", "qərar","baş nazir","rəhbər"


                  //30 --619
                ,"cinayət", "soyğunçuluq","soyğunçu","soymaq","qətl", "qatil","ev oğurluğu","ev ogrusu","qapqac","qapqaç","maşın oğurluğu",
                "maşın oğrusu","oğurluq","narkotik alveri","narkotik alvercisi","terror", "terrorist","hücum","mağaza oğurluğu","mağaza oğurlusu",
                "uşaq oğurluğu","uşaq oğurlusu","cibgir","şantaj", "təcavüz","qanun","həbs etmək","məhkəmə",
                "zindan","günahkar","günahsız","həbsxana", "hücrə","uçurmaq","xuliqanlıq","narahatçılıq",

                //31--  656
                "xəbər","vacib","serial","hekayə", "sənədli","ictimai","tok şou","cizgi filmi",
                "həqiqət","jurnal","reklam","inandırmaq", "növ","müsahibə","müxbir","jurnalist", "sevimli","kanal","Nə gedir",

                //32--673
                "təmir etmək", "sındırmaq","ehtiyacı olmaq","yamamaq","becərmək",
                "ölmək","unutmaq","sulamaq","səliqəsiz", "səliqəli","itirmək","kömək etmək","kəsmək", "üzr istəmək","gecikmək","qəza",

                  //33  -- 690
                "təbii",  "fəlakət","qasırğa, boğanaq","qar fırtınası","meşə yanğını", "zəlzələ","daşqın, sel","izdiham","kasıb",
                "evsiz","işsiz","çirkləndirmə","çirklənmiş", "müharibə","yer","çirkli","təmiz",
                "iş","müstəqillik","döyüş","milliyyət", "davam etmək","davam etmək","davam etmək","davam etmək", "üsyanda olmaq","imtina etmək","tıxac","gur vaxt",


                   //35  -713
                "salamlaşmaq","hekayə danışmaq","nömrə demək","həqiqəti demek", "yalan demək","zarafat etmək","soruşmaq","danışmaq", "söhbət etmək","cavab vermək","cavablamaq",

                //36  -- 724
                "gəzmək", "qaçmaq","tullanmaq","rəqs etmək","üzmək", "dırmaşmaq","düşmək","sürmək ( at,velosiped)","sürmək ( maşın", "uçmaq","ötürmək","daşımaq","buraxmaq", " tutmaq",

                  //39 -- 738

                "gün","həftə","ay", "il","yarım ay","saat","dəqiqə", "saniyə","əsr","dünən","bugün", "sabah","axşam","günorta","səhər",
                "gecə","gecəyarısı","fəsil","yaz", "yay","payız","qış","keçən", "növbəti","sonra","indi","daha sonra", "sonra","əvvəl","keçmişdə","gələcəkdə",
                "həmişə","adətən","tez-tez","bəzən", "tədricən","nadir hallarda","heç vaxt","bir dəfə", "iki dəfə","üç dəfə","bir dəqiqə","- hal hazırda", "tam vaxtında","vaxtından əvvəl","tezliklə","bu yaxınlarda",

                 // 44-  785

               "tamamilə","sakit","itirmək","gen", "düşmək","hiss etmək","bişirmək","soba",
                "borc vermək","borc almaq","yoxlamaq","yoxlamaq", "təxmin etmək","istisna",

                 // 43 -- 799
                "əvvəlki həyat yoldaş","yarı qiymət", "qeyri rəsmi","qeyri mümkün","məktəbəqədər","yenidən etmək",
                "təhlükəsiz","fəhlə","üzgüçü","təlimatçı", "aşbaz","hesablayıcı","yararlı","gözəl",
                "yarasız","sonsuz","cəld","xoşbəxtcəsinə", "xoşbəxtlik","qəmginlik","qəmginlik","günəşli",

                //42 -- 821

                "dinləmək","gözləmək","soruşmaq","ödəmək", "gəlmək","məxsus olmaq","düşünmək","təşəkkür etmək",
                "üzr istəmək","axtarmaq","oxşamaq ","lüğətdən söz axtarmaq", "səbrsizliklə gözləmək","nəzərdən keçirmək","ehtiyatlı olmaq","qayğısına qalmaq",
                "oxşamaq ( xasiyyətcə","qayğısına qalmaq","yaxşı olmaq ( nədəsə","pis olmaq  ( nədəsə)", "maraqlanmaq","qorxmaq","fəxr etmək",

                //41  -- 844
                "möhtəşəm", "əla","qüsursuz","dəhşətli","qorxunc", "ecazkar","qorxulu","qüsursuz","dəhşətli", "necə də gözəldir","necə də pisdir","mehriban","sevimli", "üzüyola","alicənab","axmaq","özünü bəyənən","tərbiyəli","dəcəl",


                  //  - 863
                "","",
                "","","","",
                "","","","",
                "","","","",
                "","","",""


                 };

          String bitmis_soz= "soz sayi bitmisdir";

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {


                    do {
                        secilmis = r.nextInt(Integer.parseInt(son.getText().toString()) - Integer.parseInt(baslangic.getText().toString())) + Integer.parseInt(baslangic.getText().toString());

                    } while (arrayList.contains(secilmis));
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), hata,Toast.LENGTH_LONG).show();
                }

                arrayList.add(secilmis);
                deneme_sayi++;
                tercume.setText(az[secilmis]);
                if(deneme_sayi==(Integer.parseInt(son.getText().toString()) - Integer.parseInt(baslangic.getText().toString()))-1){
                    random.setClickable(false);
                    Toast.makeText(getApplicationContext(), bitmis_soz,Toast.LENGTH_LONG).show();
                }
            }
        });

        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                random_soz.setText(ingilis[secilmis]);
            }
        });


    }
}