package com.example.immigreat;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TransportationStayingLocalSubwayEtiquetteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TransportationStayingLocalSubwayEtiquetteFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TransportationStayingLocalSubwayEtiquetteFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TransportationStayingLocalSubwayEtiquetteFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TransportationStayingLocalSubwayEtiquetteFragment newInstance(String param1, String param2) {
        TransportationStayingLocalSubwayEtiquetteFragment fragment = new TransportationStayingLocalSubwayEtiquetteFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transportation_staying_local_subway_etiquette, container, false);
    }

    /**
     * Method used to make the href links in the designated textview elements in the connected xml file clickable
     * @param view
     * @param savedInstanceState
     */
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView fsContent = (TextView) getView().findViewById(R.id.transportationStayingLocalSubwayEtiquette);
        fsContent.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
