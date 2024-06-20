import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class AnimalViewholder extends RecyclerView.ViewHolder {
    private TextView rvAnimal;
    public AnimalViewholder(@NonNull View itemView) {
        super(itemView);
        rvAnimal = itemView.findViewById(R.id.rv_animal);
    }
    public void onBond(String animal){
        rvAnimal.setText(animal);
    }
}
