package com.nguyenducthang.test.model;

import static android.os.Build.VERSION_CODES.R;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.nguyenducthang.test.Adapter.Aadapterlunbox;
import com.nguyenducthang.test.Adapter.adapterlunchbox;
import com.nguyenducthang.test.databinding.ActivityMain2Binding;
import com.nguyenducthang.test.Model.Rice;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding binding;
    adapterlunchbox.AdapterLunchBox adapterLunchBox;
    List<Rice> riceList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        riceList = new ArrayList<>();
        addData();

        adapterLunchBox = new adapterLunBox(MainActivity2.this, R.layout.rice, riceList);
        binding.lvRice.setAdapter(adapterLunchBox);
    }



    private void addData(){
       /* riceList.add(new Rice("Cơm Tấm Đại Đồng", "Cơm Sườn", R.drawable.lunch_com_tam_dai_dong, 4.1, "100+", "38 Đường Số 17, P. Linh Trung, Q. Thủ Đức, Tp.HCM"));
        riceList.add(new Rice("Bula Bento - Cơm Trưa", "Cơm Chiên Cá Hồi", R.drawable.lunch_bula_bento, 4.0, "499+", "22 Đoàn Kết, P. Bình Thọ, Q. Thủ Đức, Tp.HCM"));
        riceList.add(new Rice("Cơm Bình Dân Quang Ngân", "Cơm Đùi Gà Chiên Nước Mắm", R.drawable.lunch_com_bd_quang_ngan, 4.0, "100+", "130 Linh Trung, P. Linh Trung, Q. Thủ Đức, Tp.HCM"));
        riceList.add(new Rice("Cơm Gà - Tô Vĩnh Diện", "Cơm Sườn", R.drawable.lunch_com_ga_to_vinh_dien, 4.5, "999+", "15 Tô Vĩnh Diện, P. Linh Chiểu, Q. Thủ Đức, Tp.HCM"));
        riceList.add(new Rice("Cơm Niêu Phương Bắc", "Cơm Sườn", R.drawable.lunch_com_ga_to_vinh_dien, 4.5, "999+", "15 Tô Vĩnh Diện, P. Linh Chiểu, Q. Thủ Đức, Tp.HCM"));
        riceList.add(new Rice("Cơm Gà - Tô Vĩnh Diện", "Cơm Sườn", R.drawable.lunch_com_ga_to_vinh_dien, 4.5, "999+", "15 Tô Vĩnh Diện, P. Linh Chiểu, Q. Thủ Đức, Tp.HCM"));
        riceList.add(new Rice("Cơm Gà - Tô Vĩnh Diện", "Cơm Sườn", R.drawable.lunch_com_ga_to_vinh_dien, 4.5, "999+", "15 Tô Vĩnh Diện, P. Linh Chiểu, Q. Thủ Đức, Tp.HCM"));
        riceList.add(new Rice("Cơm Gà - Tô Vĩnh Diện", "Cơm Sườn", R.drawable.lunch_com_ga_to_vinh_dien, 4.5, "999+", "15 Tô Vĩnh Diện, P. Linh *//*Chiểu, Q. Thủ Đức, Tp.HCM"));*/
        riceList.add(new Rice("Cơm Tấm Đại Đồng", "Cơm Sườn", R.drawable.lunch_com_tam_dai_dong, 4.1, "100+", "38 Đường Số 17, P. Linh Trung, Q. Thủ Đức, Tp.HCM"));
        riceList.add(new Rice("Bula Bento - Cơm Trưa", "Cơm Chiên Cá Hồi", R.drawable.lunch_bula_bento, 4.0, "499+", "22 Đoàn Kết, P. Bình Thọ, Q. Thủ Đức, Tp.HCM"));
        riceList.add(new Rice("Cơm Bình Dân Quang Ngân", "Cơm Gà Kho Xả Ớt", R.drawable.lunch_com_bd_quang_ngan, 4.0, "100+", "130 Linh Trung, P. Linh Trung, Q. Thủ Đức, Tp.HCM"));
        riceList.add(new Rice("Cơm Gà - Tô Vĩnh Diện", "Cơm Đùi Gà Chiên Nước Mắm", R.drawable.lunch_com_ga_to_vinh_dien, 4.5, "999+", "15 Tô Vĩnh Diện, P. Linh Chiểu, Q. Thủ Đức, Tp.HCM"));
        riceList.add(new Rice("Cơm Niêu Phương Bắc", "Cơm Cá Cơm Rim Mặn", R.drawable.lunch_com_nieu_phuong_bac, 4.0, "100+", "87 Hoàng Diệu 2, P. Linh Trung, Q. Thủ Đức, Tp.HCM"));
        riceList.add(new Rice("Cơm Tấm Dì Ba", "Cơm Sườn Muối Ớt", R.drawable.lunch_com_tam_di_ba, 4.1, "999+", "197B Lê Văn Việt, P. Hiệp Phú, Q. 9, Tp.HCM"));
        riceList.add(new Rice("Cơm Tấm Phúc Lộc Thọ", "Cơm Sườn, Cơm Ba Rọi", R.drawable.lunch_com_tam_phuc_loc_tho, 4.5, "999+", "31-33 Lê Văn Việt, Q. Thủ Đức, Tp.HCM"));
        riceList.add(new Rice("Shilin - Cơm Gà", "Gà Rán", R.drawable.lunch_shilin_com_ga, 4.4, "999+", "22 Đoàn Kết, P. Bình Thọ, Q. Thủ Đức, Tp.HCM"));
    }
}
