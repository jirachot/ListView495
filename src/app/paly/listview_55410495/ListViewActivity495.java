package app.paly.listview_55410495;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewActivity495 extends Activity {
	private ListView listView1;
	private ArrayList<List_items> itemlist;
	private Adapter adapter;
	
	private int[] drawable = { R.drawable.facebook,
			R.drawable.google_plush, R.drawable.twitter, R.drawable.youtube };
	private String[] title = { "Facebook", "Google+", "Twitter", "Youtube" };
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_view_activity495);
		listView1 = (ListView) findViewById(R.id.listView1);
		
		itemlist = new ArrayList<List_items>();
		
		for(int i = 0; i < drawable.length; i++){
			List_items list_items = new List_items();
			list_items.setTitle(title[i]);
			list_items.setDrawablel(getResources().getDrawable(drawable[i]));
			itemlist.add(list_items);
		}
		
		adapter = new Myadapter();
		listView1.setAdapter((ListAdapter)adapter);

	}// EndonCreate

	private class Myadapter extends BaseAdapter {

		private Holder holder;
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return itemlist.size();
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View view, ViewGroup parent) {
			view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.listview, null);
			holder = new Holder();
			holder.imageView = (ImageView) view.findViewById(R.id.item_image);
			holder.txt1 = (TextView) view.findViewById(R.id.item_txttitle);
			
			if(itemlist.get(position).getTitle() != null){
				holder.txt1.setText(itemlist.get(position).getTitle());
			}
			if(itemlist.get(position).getDrawablel() != null){
				holder.imageView.setImageDrawable(itemlist.get(position).getDrawablel());
			}
			
			return view;
		}
		
		public class Holder{
			public TextView txt1;
			public ImageView imageView;
		}

	}
}// EndClass


