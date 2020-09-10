package narsis.xiirpl2.filosofiwater.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import narsis.xiirpl2.filosofiwater.R;

public class ProfileFragment extends Fragment {

    private TextView nama, nohp;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, null);

        nama = (TextView) v.findViewById(R.id.nama);
        nohp = (TextView) v.findViewById(R.id.nohp);

        return v;
    }


}