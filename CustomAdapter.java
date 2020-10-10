package com.lnt.cardviewexample;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;
        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;
        import org.w3c.dom.Text;
        import java.util.ArrayList;




public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    ArrayList<String> AndroidName;
    ArrayList<String> AndroidVersion;
    ArrayList<Integer> Image;
    Context context;

    public CustomAdapter(Context context, ArrayList<String> AndroidName, ArrayList<String> AndroidVersion, ArrayList<Integer> Image) {
        this.context = context;
        this.AndroidName = AndroidName;
        this.AndroidVersion = AndroidVersion;
        this.Image = Image;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the item layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout, parent, false);
        //set the view's size, margins, paddings, layout parameters
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.textViewName.setText(AndroidName.get(position));
        holder.textViewVersion.setText(AndroidVersion.get(position));
        holder.imageViewIcon.setImageResource(Image.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, AndroidName.get(position), Toast.LENGTH_LONG).show();
                // Toast.makeText(context,LastName.get(position),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return AndroidName.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewName;
        public ImageView imageViewIcon;
        public TextView textViewVersion;

        public MyViewHolder(View itemView) {
            super(itemView);
            //get reference of item view's
            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageViewIcon);
        }

    }
}
