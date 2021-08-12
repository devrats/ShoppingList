package com.example.shoppinglist;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<Contact> localDataSet;
    private Context context;
    private View view;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final TextView textView1;
        private final TextView textView2;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(view.getContext(), "Contact " + getPosition(), Toast.LENGTH_SHORT).show();
                }
            });
            textView = (TextView) view.findViewById(R.id.textView);
            textView1 = (TextView) view.findViewById(R.id.textView3);
            textView2 = (TextView) view.findViewById(R.id.textView4);
        }

        public TextView getTextView() {
            return textView;
        }
        public TextView getTextView1() {
            return textView1;
        }
        public TextView getTextView2() {
            return textView2;
        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public CustomAdapter(Context context, List<Contact> dataSet) {
        this.context = context;
        localDataSet = dataSet;
    }


    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);
        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getTextView1().setText("Name: " + (CharSequence) localDataSet.get(position).getName());
        viewHolder.getTextView().setText("Contact " + (CharSequence) String.valueOf(localDataSet.get(position).getSerialNumber()));
        viewHolder.getTextView2().setText("Phone: " + (CharSequence) String.valueOf(localDataSet.get(position).getPhone()));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}
