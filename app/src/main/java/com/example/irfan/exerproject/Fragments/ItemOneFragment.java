/*
 * Copyright (c) 2017. Truiton (http://www.truiton.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 * Mohit Gupt (https://github.com/mohitgupt)
 *
 */

package com.example.irfan.exerproject.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.irfan.exerproject.Adapters.ExclusiveDealsAdapter;
import com.example.irfan.exerproject.Models.DealsModel;
import com.example.irfan.exerproject.R;

import java.util.ArrayList;
import java.util.List;

public class ItemOneFragment extends Fragment {
    View v;
    RecyclerView recyclerView;
    List<DealsModel> listCont;

    public ItemOneFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_item_one, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview_neardeals);
        ExclusiveDealsAdapter viewAdapter = new ExclusiveDealsAdapter(getContext(), listCont);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(viewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listCont = new ArrayList<>();
        listCont.add(new DealsModel("Mahadi Hasan", "01717677540", "20", "20"));
        listCont.add(new DealsModel("Mahadi Hasan", "01717677540", "20", "20"));
        listCont.add(new DealsModel("Mahadi Hasan", "01717677540", "20", "20"));
        listCont.add(new DealsModel("Mahadi Hasan", "01717677540", "20", "20"));
        listCont.add(new DealsModel("Mahadi Hasan", "01717677540", "20", "20"));
        listCont.add(new DealsModel("Mahadi Hasan", "01717677540", "20", "20"));

    }
}