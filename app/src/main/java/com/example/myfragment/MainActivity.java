package com.example.myfragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    /*List에 붙일 커스텀 아답터를 만들기 위해서는 다음과 같은 절차가 필요하다.
        1. RecyclerView.Adapter를 상속하여 커스텀 아답터를 정의 해 주어야 한다.
        2. 리스트의 커스텀 레이아웃을 ViewHolder에 구성하여 onCreateViewHolder에서 view를 생성한다.
        3. 커스텀 레이아웃에서 구성한 각 view를 ViewHolder를 이용하여 리스트를 구성한다.
        4. getItemCount에 리스트가 몇개가 구성되는지 정의해 주어야 한다. (필자는 이 부분을 생략하여 리스트가 구성이 안되어 몇시간 삽질한 경험이 있음...)
        5. 각 리스트 item클릭시 동작은 onBindViewHolder에서 객체에 리스너를 등록하여 정의할 수 있다.
        예제 화면 : 아래와 같은 화면을 RecyclerView를 이용해 구현 해 보자.*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

}
