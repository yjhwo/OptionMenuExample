package com.estsoft.optionmenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //   그룹아이디, 아이템아이디, 순서, 메뉴이름
//        menu.add( Menu.NONE, 0, 0, "Menu1");
//        menu.add( Menu.NONE, 1, 1, "Menu2");
//        menu.add( Menu.NONE, 2, 2, "Menu3");

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {       // 옵션 메뉴 선택 이벤트 처리

        switch ( item.getItemId() ){
            case R.id.menu_refresh:
                Toast.makeText(this, "refresh", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_search:
                Toast.makeText(this, "search", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Menu3 Selected", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
