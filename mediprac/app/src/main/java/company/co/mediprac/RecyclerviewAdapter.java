package company.co.mediprac;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<MyViewHolder> implements Filterable {

    private List<Recent> fList;
    //private ArrayList<Recent> fList;
    private ArrayList<Recent> mList;
    private LayoutInflater mInflate;
    private Context mContext;

    public RecyclerviewAdapter(Context context, ArrayList<Recent> items) {

        this.fList = items;

//        mList = new ArrayList<Recent>();
//        mList.addAll(fList);

        this.mList = items;
        this.mInflate = LayoutInflater.from(context);
        this.mContext = context;
    }

//    public void updateList(List<Recent> list) {
//        fList = list;
//        notifyDataSetChanged();
//    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          View view = mInflate.inflate(R.layout.item, parent, false);
          MyViewHolder viewHolder = new MyViewHolder(view);
          return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Recent item = fList.get(position);
        holder.ITEM_NAME.setText(item.getITEM_NAME());
        holder.ENTP_NAME.setText(item.getENTP_NAME());
        //binding
//        holder.ITEM_NAME.setText(mList.get(position).ITEM_NAME);
//        holder.ENTP_NAME.setText(mList.get(position).ENTP_NAME);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() { //전체 아이템 갯수 리턴.
        return this.fList.size();
    }

//    public void filter(String charText) {
//        charText = charText.toLowerCase(Locale.getDefault());
//        fList.clear();
//        if (charText.length() == 0) {
//            fList.addAll(mList);
//        } else {
//            for (Recent recent : mList) {
//                String name = recent.getITEM_NAME();
//                if (name.toLowerCase().contains(charText)) {
//                    fList.add(recent);
//                }
//            }
//        }
//        notifyDataSetChanged();
//    }

    @Override
    public Filter getFilter() {
        return new Filter() {
               @Override
               protected FilterResults performFiltering(CharSequence constraint) {
                   String charString = constraint.toString();
                   if(charString.isEmpty()) {
                       fList = mList;
                   } else {
                       ArrayList<String> filteringList = new ArrayList<>();
                       for(String name : mList) {
                           if(name.toLowerCase().contains(charString.toLowerCase())) {
                              filteringList.add(name);
                            }
                       }
                          fList = filteringList;
                      }
                      FilterResults filterResults = new FilterResults();
                      filterResults.values = fList;
                      return filterResults;
                  }


    public static class MyViewHolder extends RecyclerView.ViewHolder { // 아이템 뷰를 저장하는 뷰홀더 클래스.
        // each data item is just a string in this case
        //public TextView textView;
        public TextView ITEM_NAME;
        public TextView ENTP_NAME;

        public MyViewHolder(View itemView) {
            super(itemView);
            ITEM_NAME = itemView.findViewById(R.id.item_name);
            ENTP_NAME = itemView.findViewById(R.id.entp_name);
        }
//        public MyViewHolder(TextView v) {
//            super(v);
//            textView = v.findViewById(R.id.result);
//        }
    }

//     @Override
//     public Filter getFilter() {
//         return new Filter() {
//             @Override
//             protected FilterResults performFiltering(CharSequence constraint) {
//                 String charString = constraint.toString();
//                 if (charString.isEmpty()) {
//                     fList = mList;
//                 } else {
//                     ArrayList<String> filteringList = new ArrayList<>();
//                     for (String name : mlist) {
//                         if (name.toLowerCase().contains(charString.toLowerCase())) {
//                             filteringList.add(name);
//                         }
//                     }
//                     fList = filteringList;
//                 }
//                 FilterResults filterResults = new FilterResults();
//                 filterResults.values = fList;
//                 return filterResults;
//             }
//         }
//     }
//
//    @Override
//    protected void publishResults(CharSequence constraint, FilterResults results) {
//        fList = (ArrayList<String>) results.values;
//        notifyDataSetChanged();
//    }
}











  

    //private String[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder


    // Provide a suitable constructor (depends on the kind of dataset)
//    public RecyclerviewAdapter(String[] myDataset) {// 생성자에서 데이터 리스트 객체를 전달받음.
////        mDataset = myDataset;
////    }

    // Create new views (invoked by the layout manager)
//    @Override // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.
//    public RecyclerviewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        //viewType 형태의 아이템 뷰를 위한 뷰홀더 객체 생성.
//        // create a new view
//
//        TextView text = (TextView)LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item, parent, false);
//
//        MyViewHolder vh = new MyViewHolder(text);
//        return vh;
//    }

    // Replace the contents of a view (invoked by the layout manager)
//    @Override
//    public void onBindViewHolder(MyViewHolder holder, int position) { //position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
//        // - get element from your dataset at this position
//        // - replace the contents of the view with that element
//        holder.textView.setText(mDataset[position]);
//
//    }
//

//}


//package com.js.xmlpullparser_example;

