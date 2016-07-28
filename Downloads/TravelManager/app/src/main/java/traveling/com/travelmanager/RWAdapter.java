package traveling.com.travelmanager;

/**
 * Created by narek on 7/28/16.
 */

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RWAdapter extends RecyclerView.Adapter<RWAdapter.MyViewHolder> {

    private List<Sights> mSightsList;

    public RWAdapter(List<Sights> moviesList) {
        this.mSightsList = moviesList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Sights sights = mSightsList.get(position);
        holder.name.setText(sights.getName());
        holder.about.setText(sights.getAbout());
        holder.dest.setText(sights.getDestination());
        holder.image.setImageResource(sights.getImage());

    }

    @Override
    public int getItemCount() {
        return mSightsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, about, dest;
        ImageView image;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.nameTextView);
            about = (TextView) view.findViewById(R.id.aboutTextVIew);
            dest = (TextView) view.findViewById(R.id.destTextView);
            image = (ImageView) view.findViewById(R.id.sightImage);


        }
    }
}
