    package com.example.scrollingapp;

    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;

    import androidx.annotation.NonNull;
    import androidx.appcompat.widget.AppCompatTextView;
    import androidx.recyclerview.widget.RecyclerView;

    import java.util.List;

    public class PlaceItemAdapter extends RecyclerView.Adapter<PlaceItemAdapter.PlaceItemViewHolder> {

        private List<String> places;

        public PlaceItemAdapter(List<String> places) {
            this.places = places;
        }

        @NonNull
        @Override
        public PlaceItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            return new PlaceItemViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull PlaceItemViewHolder holder, int position) {
            holder.tvName.setText(places.get(position));
        }

        @Override
        public int getItemCount() {
            return places.size();
        }

        public class PlaceItemViewHolder extends RecyclerView.ViewHolder {

            AppCompatTextView tvName;

            public PlaceItemViewHolder(View itemView) {
                super(itemView);
                this.tvName = itemView.findViewById(R.id.tvName);
            }
        }
    }
