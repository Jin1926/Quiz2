package com.example.quiz2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quiz2.adaptadores.Newsdaptador;
import com.example.quiz2.noticia.News;

import java.util.ArrayList;
import java.util.List;


public class Noticias extends Fragment {

    RecyclerView rcv_news;
    List<News> listNoticias = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_noticias, container, false);

        rcv_news = view.findViewById(R.id.rcv_news);
        News news = new News("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.fKzjBJCJVhSdKUYz50HBjQHaEP%26pid%3DApi&f=1&ipt=c3c1d94e44cc3ae8e9bb96dc14b6b18a0d0d5e4af8687e20362630922145d432&ipo=images", "Hollow Knight el mejor juego que existe","Juego desarrollado por TeamCherry");
        News news1 = new News("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.9iCogeoqqLq81PXTqPDidAHaDq%26pid%3DApi&f=1&ipt=dd3f0c95696273e09265ce6261da52246a40fc56edcf674f5ab49c39c703c6a0&ipo=images","MiHoyo, Desarrolladoras de videojuegos","Desarrollaron Genshin impact");
        News news2 = new News("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fcdn2.unrealengine.com%2F15br-bplaunch-egs-s3-2560x1440-2560x1440-687570387.jpg&f=1&nofb=1&ipt=cbb9eac0d62abfcc3b83fa27c7ee71d823a3b6f3f00c350fc20b18a636f3cc63","Fornite", "Juega y juega");
        News news3 = new News("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.-KoEnAoPXL3lC2aPTK08BwHaEK%26pid%3DApi&f=1&ipt=0fb1532e32fabaf1c81c2a759eb0c612e4c41bec36a31d59e144a72207b2d62b&ipo=images","Ven y juega","No lo juegues");
        News news4 = new News("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%2Fid%2FOIP.2RHD_QuJ27Sp8oson2_jJgHaEQ%3Fpid%3DApi&f=1&ipt=c04ac8141fe140b7734352a9bdae8af44ac65001e1f6bd0b3ec083c4febfb455&ipo=images","Lol pero mas adicto","Peor que la droga");
        listNoticias.add(news);
        listNoticias.add(news1);
        listNoticias.add(news2);
        listNoticias.add(news3);
        listNoticias.add(news4);
        rcv_news.setLayoutManager(new LinearLayoutManager(getContext()));
        rcv_news.setAdapter(new Newsdaptador(listNoticias));
        return view;
    }
}