package com.kumalalatif.foodfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Makanan> makananList=new ArrayList<>();
    private RecyclerView RV;
    private MakananAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RV=(RecyclerView) findViewById(R.id.tampilanRV);
        mAdapter=new MakananAdapter(this,makananList);
        RV.setLayoutManager(new LinearLayoutManager(this));
        RV.setAdapter(mAdapter);
        isiData();
    }

    private void isiData(){

        Makanan makan=new Makanan("Kiwi Punch",R.drawable.kiwipunch,"Minuman dari sari buah kiwi yang kaya akan vitamin dan mineral. Sangat bagus untuk nutrisi kesehatan anda\n","Bahan Minuman Kiwi Punch Soda :\n\n" +
                "•\tKiwi 2 buah ( dipotong-potong )\n" +
                "•\tSirup melon 200 mili liter\n" +
                "•\tSoda manis 300 mili liter\n" +
                "•\tEs batu secukupnya ( sesuai selera )\n\n\n" +
                "Cara Membuat Kiwi Punch Soda :\n\n" +
                "1.\tLangkal awal masukkan kiwi , sirup melon dan es batu secukupnya ke dalam tabung blender lalu proses hingga semua bahan tercampur rata dan halus .\n" +
                "2.\tSelanjutnya Tuang ke dalam gelas , dan tambahkan soda manis .\n" +
                "3.\tSilahkan tambahkan es batu lagi secukupnya jika perlu \n");
        makananList.add(makan);

        makan=new Makanan("Nasgor Putih",R.drawable.nagorputih,"Resep ini sangat simple jadi sangat cocok sekali untuk di masak di pagi hari untuk menu sarapan pagi.\n","Bahan-bahan/bumbu-bumbu :\n\n" +
                "•\t500 gram nasi putih\n" +
                "•\t1 butir telur dikocok lepas\n" +
                "•\t75 gram ayam fillet dipotong – potong\n" +
                "•\t1 buah sosis ayam dipotong – potong\n" +
                "•\t2 siung bawang putih dicincang halus\n" +
                "•\t50 gram mixed vegetable\n" +
                "•\t1/2 sendok makan kecap ikan\n" +
                "•\t1/2 sendok teh garam\n" +
                "•\t1/4 sendok teh merica bubuk\n" +
                "•\t1/2 sendok teh kaldu ayam bubuk\n" +
                "•\t1 batang daun bawang, iris halus\n" +
                "•\t1 sendok makan minyak untuk menumis\n\n\n" +
                "Cara Pengolahan :\n\n" +
                "1.\tTumis bawang putih sampai harum. Masukkan telur. Aduk sampai berbutir. Tambahkan ayam fillet dan sosis ayam. Aduk sampai berubah warna.\n" +
                "2.\tMasukkan mixed vegetable. Aduk sampai layu. Tambahkan nasi putih, kecap ikan, garam, merica bubuk, kaldu ayam bubuk, dan daun bawang. Masak sampai matang.\n" +
                "3.\tNasi goreng putih kini telah siap untuk disajikan.\n");
        makananList.add(makan);

        makan=new Makanan("Sambal Goreng Kentang Tempe",R.drawable.sambalgorengkentangtempe,"Hanya dengan satu bungkus tempe dan satu buah kentang Anda bisa menyajikan masakan yang sangat lezat.","Bahan:\n\n" +
                "•\t1 bungkus tempe, diiris kecil & tipis\n" +
                "•\t4 bh kentang, diiris kecil & tipis\n" +
                "•\t3 bh cabe merah, iris tipis\n" +
                "•\t5 siung bawang putih\n" +
                "•\t10 siung bawang merah\n" +
                "•\t5 sdm gula pasir atau sesuai selera\n" +
                "•\t50 cc air\n" +
                "•\tGaram secukupnya\n" +
                "•\tJeruk nipis\n" +
                "•\tKecap manis secukupnya\n" +
                "•\tMinyak untuk menggoreng\n\n\n" +
                "Cara Membuat :\n\n" +
                "1.\tGoreng kentang dan tempe hingga matang, tiriskan. Kentang digoreng terlebih dahulu, karena saat menggoreng tempe akan banyak remah.\n" +
                "2.\tTumis bawang putih, bawang merah, dan cabe merah dengan sedikit minyak hingga harum.\n" +
                "3.\tMasukkan gula pasir, kecap manis, garam dan air, aduk rata hingga air mendidih.\n" +
                "4.\tBeri sedikit air jeruk nipis kemudian matikan kompor.\n" +
                "5.\tMasukkan kentang dan tempe yang sudah digoreng, aduk rata lalu sajikan.\n");
        makananList.add(makan);

        makan=new Makanan("Sayur Asem Jawa Timur",R.drawable.sayurasemjawatimur,"Sayur asem khas Jawa Timur ini pastinya tidak asing untuk Anda, bahan-bahannya tergolong mudah dan tidak sulit didapat. Memasaknyapun cukup praktis.","Bahan :\n\n" +
                "•\t50 gram kecambah dari kedelai atau tauge besar\n" +
                "•\tmelinjo sesuai selera\n" +
                "•\t10 biji kacang panjang yang dipotong kurang lebih 5 cm\n" +
                "•\t2 buah labu siam yang dikupas dan dipotong sesuai selera\n" +
                "•\tSeikat kangkung yang dipotong sesuai selera\n" +
                "•\t1 liter air\n" +
                "•\t3 buah nelimbing wuluh\n" +
                "•\t2 cm lengkuas yang digeprak\n" +
                "•\t4 buah bawah merah yang diiris tipis-tipis\n" +
                "•\t3 siung bawang merah yang dihaluskan Garam dan gula secukupnya\n\n\n" +
                "Cara Membuat :\n\n" +
                "1.\tRebus air hingga mendidih.\n" +
                "2.\tMasukkan bawang putih, bawang merah, lengkuas dan belimbing wuluh.\n" +
                "3.\tSetelah air kembali mendidih, masukkan kacang panjang, kecambah dan labu siam. Masak hingga semua bahan setengah matang.\n" +
                "4.\tTambahkan kangkung, gula dan garam. Aduk-aduk dan tunggu kurang lebih 1 menit atau sampai kangkung empuk.\n" +
                "5.\tMatikan api dan angkat. Sayur Asem Jawa Timur siap dihidangkan selagi hangat.\n");
        makananList.add(makan);

        makan=new Makanan("Tahu Telur Kecap",R.drawable.tahutelurkecap,"Hanya dengan dua buah telur dan dua potong tahu Anda bisa menyajikan masakan yang praktis ini. Tahu telur kecap sangat cocok untuk disantap bersama keluarga.","Bahan Tahu Telur :\n\n" +
                "•\t2 butir telur yang dikocok hingga berbusa\n" +
                "•\t2 potong tahu putih yang dicincang kasar\n" +
                "•\t1 batang daun bawang yang dipotong halus\n" +
                "•\t½ sendok the garam\n" +
                "•\t¼ sendok the merica bubuk\n\n\n" +
                "Bahan Saus Kacang :\n\n" +
                "•\t5 butir cabe merah keriting yang digoreng\n" +
                "•\t3 butir cabe rawit yang digoreng\n" +
                "•\t3 butir bawang putih yang digoreng\n" +
                "•\t100 gram kacang tanah yang digoreng hingga matang\n" +
                "•\t5 sendok makan kecap manis\n" +
                "•\t1 sendok makan air jeruk nipis\n" +
                "•\t150 ml air panas\n" +
                "\n" +
                "Bahan Lainnya :\n" +
                "•\t3 lembar kol yang dipotong halus lalu direbus hingga layu\n" +
                "•\tTauge secukupnya yang disiram air panas hingga layu\n" +
                "Cara Membuat :\n\n" +
                "1.\tKocok telur hingga berbusa lalu tambahkan garam, merica bubuk, daun bawang yang sudah diiris dan tahu cincang. Aduk hingga merata.\n" +
                "2.\tPanaskan minyak dan goreng adonan telur hingga warna berubah menjadi kecoklatan. Kemudian angkat dan tiriskan.\n" +
                "3.\tSiapkan saus kacang. Tumbuk kacang tanah yang telah digoreng bersama cabe, bawang putih, cabe merah dan cabe rawit. Kemudian cairkan dengan air. Tambahkan kecap dan jeruk nipis kemudian aduk hingga merata\n" +
                "4.\tSiramkan bumbu kacang dan kecap ke atas telur.\n" +
                "5.\tTahu telur kecap siap disajikan untuk anda dan keluarga. Jeruk nipis boleh ditambahkan sesuai dengan selera.\n");
        makananList.add(makan);

        makan=new Makanan("Telur Dadar Campur",R.drawable.telurdadarcampur,"3 butir telur di kocok lepas di tambah dengan irisan sayur kol, tomat, seledri jangan lupa di tambah garam, goreng di dalam wajan dengan api sedang jadilah telur dadar campur yang enak ini.","Bahan:\n\n" +
                "•\t3 butir telur ayam\n" +
                "•\t1 ½ siung bawang putih, memarkan dan iris halus\n" +
                "•\t½ sdt merica\n" +
                "•\t½ sdt garam\n" +
                "•\t1 buah cabai merah keriting, iris tipis\n" +
                "•\t1 batang daun bawang, iris halus\n" +
                "•\t1 batang seledri, iris halus\n" +
                "•\t3 lembar kol, iris halus\n" +
                "•\t½ buah tomat, iris halus\n" +
                "•\t2 sdm minyak goreng\n\n\n" +
                "Cara Membuat:\n\n" +
                "1.\tKocok semua bahan menjadi satu.\n" +
                "2.\tPanaskan minyak, masukkan adonan dan ratakan. Masak hingga setengah matang dan gulung. Bolak-balik hingga matang. Angkat dan hidangkan.\n");
        makananList.add(makan);

        makan=new Makanan("Tumis Jamur Tiram",R.drawable.tumisjamurtiram,"Hanya dengan 5 ons jamur tiram di tambah dengan bumbu-bumbu pilihan lalu di tumis di dalam api sedang dengan sedikit minyak zaitun anda bisa menikmati hidangan yang satu ini.","Bahan yang dibutuhkan:\n\n" +
                "•\t2 sdm minyak zaitun\n" +
                "•\t5 ons jamur tiram\n" +
                "•\t4 siung bawang putih diiris halus\n" +
                "•\t4 buah daun bawang dipotong 1 cm\n" +
                "•\tGaram secukupnya\n" +
                "•\tMerica secukupnya\n\n\n" +
                "Cara membuat:\n\n" +
                "1.\tPanaskan minyak zaitun pada sebuah wajan pada suhu yang sedang namun jangan sampai berasap.\n" +
                "2.\tTambahkan jamur dan juga bawang putih, tumis selama 2 hingga 3 menit. Aduk dengan menggunakan spatula.\n" +
                "3.\tSetelah selesai menumis selama 2 hingga 3 menit, kurangi suhunya sedikit dan taburkan garam di atas jamur dan aduk hingga merata. Tutup dan masak selama kurang lebih 5 hingga 7 menit. Aduk sesekali hingga mereka mengeluarkan cairan dan berubah menjadi lebih lembut.\n" +
                "4.\tKetika jamur tiram sudah menjelang matang, tambahkan setengah dari potongan daun bawang dan garam serta merica. Aduk lagi hingga rata.\n" +
                "5.\tSajikan jamur tiram dengan sisa daun bawang yang ada.\n\n\n" +
                "Tips:\n\n" +
                "•\tMenutup rapat saat memasak jamur tiram akan membantu jamur untuk memproduksi cairan yang bisa membantu mereka untuk tidak gosong.\n" +
                "•\tSaat memasak, waktu maksimal yang bisa digunakan adalah 7 hingga 10 menit.\n" +
                "•\tJika terlalu banyak cairan, anda bisa memasak untuk 1 hingga 2 menit selanjutnya dengan tidak menggunakan tutup untuk mengurangi jumlah cairan yang ada.\n");
        makananList.add(makan);

        makan=new Makanan("Tumis Kangkung",R.drawable.tumiskangkung,"Tumis kangkung adalah masakan yang murah meriah tetapi kelezatannya tidak diragukan lagi. Hanya dengan Rp. 5000,- Tumis kangkung bisa Anda sajikan untuk keluarga.","Bahan:\n\n" +
                "•\t1 ikat kangkung\n" +
                "•\t1 lombok merah besar\n" +
                "•\tlombok merah kecil (cabe rawit) sesuai selera\n" +
                "•\t5 siung bawang merah\n" +
                "•\t2 siung bawang putih\n" +
                "•\tSaus tiram ± 3 sdm\n" +
                "•\tLengkuas 1/3 ruas jari\n" +
                "•\tSedikit garam\n" +
                "•\tGula aren/gula pasir secukupnya\n" +
                "•\tTerasi\n" +
                "•\tTomat\n" +
                "•\tMentega / minyak\n\n\n" +
                "Cara Memasak Tumis Kangkung:\n\n" +
                "1.\tSiapkan adalah kangkung yang telah dibersihkan dan di petik daunnya.\n" +
                "2.\tIris bawang merah dan bawang putih, tomat dan cabai\n" +
                "3.\tPanaskan mentega atau minyak di atas penggorengan, tumis bawang merah dan bawang putih hingga harum.\n" +
                "4.\tMasukan cabai , terasi, dan lengkuas segera lingkarkan saus tiram di pinggir2 bumbu yang sedang ditumis, bukan langsung ke bumbunya.\n" +
                "5.\tSetelah itu masukan kangkung yang telah di cuci, jangan ditambahkan air. usahakan jangan menambahkan air ketika menumis sayuran. karena sebenarnya air akan keluar sendiri dari kangkung yang dicuci. akali dengan mengecilkan api.\n" +
                "6.\tSetelah matang/atau hampir matang masukan garam dan gula. tahap terakhir ini usahakan untuk mencicipi dahulu kuahnya. karena biasanya terasi dan saus tiram sendiri sudah asin.\n" +
                "7.\tMasukan tomat dan siap di hidangkan hangat-hangat.\n");
        makananList.add(makan);
        mAdapter.notifyDataSetChanged();
    }

}
