package com.example.applab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        List<Product> productList = new ArrayList<Product>();

        productList.add(new Product("Cá nấu lẩu, nấu mì mini...",R.drawable.ca_nau_lau, "Devang"));
        productList.add(new Product( "1KG KHÔ GÀ BƠ TỎI...",R.drawable.ga_bo_toi, "LTD Food"));
        productList.add(new Product( "Xe cần cẩu đa năng",R.drawable.xa_can_cau, "Thế giới đồ chơi"));
        productList.add(new Product( "Đồ chơi dạng mô hình", R.drawable.do_choi_dang_mo_hinh, "Thế giới đồ chơi"));
        productList.add (new Product( "Lãnh đạo giản đơn",R.drawable.lanh_dao_gian_don, "Minh long book"));
        productList.add(new Product( "Hiểu lòng trẻ con",R.drawable.hieu_long_con_tre, "Thế giới đồ chơi"));

        ListView listView = findViewById(R.id.listViewProduct);
        listView.setAdapter(new ProductAdapter(this , R.layout.list_product , productList));


    }
}