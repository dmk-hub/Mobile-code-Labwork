package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Typeface;

public class ForecastFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        LinearLayout layout = new LinearLayout(requireContext());
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#20FF0000"));

        TextView day = new TextView(requireContext());
        day.setText(R.string.thursday);
        day.setTextSize(28);                          // cỡ chữ lớn hơn
        day.setTextColor(Color.BLACK);                // màu đen đậm
        day.setTypeface(null, Typeface.BOLD);         // in đậm
        day.setPadding(32, 32, 32, 16);               // cách mép cho dễ nhìn
        ImageView icon = new ImageView(requireContext());
        icon.setImageResource(R.mipmap.ic_launcher);

        layout.addView(day);
        layout.addView(icon);

        return layout;
    }
}