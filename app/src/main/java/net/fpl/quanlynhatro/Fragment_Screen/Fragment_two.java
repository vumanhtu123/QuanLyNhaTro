package net.fpl.quanlynhatro.Fragment_Screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import net.fpl.quanlynhatro.MainActivity;
import net.fpl.quanlynhatro.R;
import net.fpl.quanlynhatro.Screen_Activity;

public class Fragment_two extends Fragment {
    public Fragment_two() {
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_two,container,false);
        return view;
    }
}
