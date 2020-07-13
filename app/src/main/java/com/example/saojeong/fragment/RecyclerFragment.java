package com.example.saojeong.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.saojeong.R;
import com.example.saojeong.adapter.ContactsAdapter;
import com.example.saojeong.model.Contact;

import java.util.ArrayList;

public class RecyclerFragment extends Fragment {

    private RecyclerView recyclerView;
    private ContactsAdapter adapter;
    ArrayList<Contact> contacts;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.recyclerview_fragment, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_fragment);

        contacts = Contact.createContactsList(20);
        adapter = new ContactsAdapter(contacts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return rootView;

    }


}
