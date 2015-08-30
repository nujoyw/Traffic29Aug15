package nujoyw.traffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SCIENCE on 8/30/2015.
 */
public class MyAdapter extends BaseAdapter{//drive เพื่อนโยนไปที่ listview (extend สืบทอด BaseAdapter)


    //สร้างส่วนของการเชื่อมต่อ Explicit
    private Context objContext; //context การส่ง data ระหว่าง java กับ java ไปทำงาน
    private int[] iconInts; //ส่งเป็น array เพราะ มันส่งรูป 20 รูป
    private String[] titleStrings; // โยน String เป็น array ทั้งหมด 20 รูป

    //สร้าง contructor เมธอดที่มีชื่อเดียวกับ คลาส
    public MyAdapter(Context objContext, int[] iconInts, String[] titleStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
    }//constructor


    @Override
    public int getCount() {
        return titleStrings.length; //ฉันต้องถูกวนกี่รอบ ให้นับจากจำนวนของ String ที่โยนมา
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {//get view คือการทำงานแต่ละรอบๆ

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE); //เปิด Service
        View objView1 = objLayoutInflater.inflate(R.layout.traffic_listview, parent,false); //ให้ objView1 หิ้วของ เสร็จ ต้อง ดร็อปของ

        //Show Icon
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imvShowIcon);//imvShowIcon คือ ใน traffic list view ที่เราทำไว้
        iconImageView.setImageResource(iconInts[position]);

        //Show Title
        TextView titleTextView = (TextView) objView1.findViewById(R.id.txtTitle);
        titleTextView.setText(titleStrings[position]);

        return objView1;
    }
}//main class
