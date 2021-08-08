package com.project.loginandregistration;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Residentdirectory extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Floor> floors;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_residentdirectory);
        recyclerView = findViewById(R.id.recycler_view);
        floors = new ArrayList<>();

        setData();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter(this, floors);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        adapter.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        adapter.onRestoreInstanceState(savedInstanceState);
    }




    private void setData() {
        ArrayList<PersonNames> floor1 = new ArrayList<>();
        floor1.add(new PersonNames("Animesh Gupta - 9856321453"));
        floor1.add(new PersonNames("Maunak Das    - 9845632145"));
        floor1.add(new PersonNames("Preeti Toppo  - 8414562314"));
        floor1.add(new PersonNames("Jitendra Pai  - 7009854123"));
        floor1.add(new PersonNames("Ajit Mander   - 7005325478"));
        floor1.add(new PersonNames("Ajit Mander   - 8521344444"));
        floor1.add(new PersonNames("Banhi Sani    - 8715478955"));
        floor1.add(new PersonNames("Swarna Gill   - 7896325412"));
        floor1.add(new PersonNames("Tushar Johal  - 4213654789"));



        ArrayList<PersonNames> floor2 = new ArrayList<>();
        floor2.add(new PersonNames("Ishani Thakkar - 87523145556"));
        floor2.add(new PersonNames("Gautam Kohli   - 01127152886"));
        floor2.add(new PersonNames("Aniket Mehra   - 01126070658"));
        floor2.add(new PersonNames("Aniruddha Loyal- 02227667827"));
        floor2.add(new PersonNames("Vanya Gopal    - 01125639865"));
        floor2.add(new PersonNames("Kamakshi Bansal- 02267997395"));
        floor2.add(new PersonNames("Sima Grewal    - 04428281327"));
        floor2.add(new PersonNames("Rajesh Mathai  - 07927452068"));
        floor2.add(new PersonNames("Abhilash Balay - 08022225986"));





        ArrayList<PersonNames> floor3 = new ArrayList<>();
        floor3.add(new PersonNames("Drishya Kunda   - 02227668206"));
        floor3.add(new PersonNames("Alex Gupta      - 04027899942"));
        floor3.add(new PersonNames("Lilavati Sahni  - 07955228263"));
        floor3.add(new PersonNames("Chandan Barman  - 01126230762"));
        floor3.add(new PersonNames("Nikhil Bedi     - 09999495148"));
        floor3.add(new PersonNames("Nisha Mishra    - 08023416924"));
        floor3.add(new PersonNames("Nakul Mander    - 07122525616"));
        floor3.add(new PersonNames("Sanjit Sood     - 04425389957"));
        floor3.add(new PersonNames("Shivali Panchal - 04428528668"));


        ArrayList<PersonNames> floor4= new ArrayList<>();
        floor4.add(new PersonNames("Rani Som       - 07926408902"));
        floor4.add(new PersonNames("Kalinda Shukla - 00792550358"));
        floor4.add(new PersonNames("Riya Chauhan   - 95124401592"));
        floor4.add(new PersonNames("Kavita Meda    - 45705588893"));
        floor4.add(new PersonNames("Gurdeep Kakar  - 77220004543"));
        floor4.add(new PersonNames("Aadesh Prakash - 98149293054"));
        floor4.add(new PersonNames("Adnan Goel     - 54758567928"));
        floor4.add(new PersonNames("Sima Ratta     - 57201242666"));
        floor4.add(new PersonNames("Rajkumari Kuruvilla- 77471154089"));

        ArrayList<PersonNames> floor5= new ArrayList<>();
        floor5.add(new PersonNames("Advitiya Sujeet     - 23019279652"));
        floor5.add(new PersonNames("Aditi Musunur       - 93132935759"));
        floor5.add(new PersonNames("Barsati Sandipa     - 31019953912"));
        floor5.add(new PersonNames("Jayadev Mitali      - 97438511827"));
        floor5.add(new PersonNames("Devasru Subramanyan - 19245675426"));
        floor5.add(new PersonNames("Aprativirya Seshan  - 56271361295"));
        floor5.add(new PersonNames("Avantas Ghosal      - 48733604076"));
        floor5.add(new PersonNames("Chandra Rastogi     - 29991369614"));
        floor5.add(new PersonNames("Arpit Khalsa        - 37436790166"));




        ArrayList<PersonNames> floor6= new ArrayList<>();

        floor6.add(new PersonNames("Mala Manda         - 60483852468"));
        floor6.add(new PersonNames("Aamani Dugal       - 74168471958"));
        floor6.add(new PersonNames("Vivek Kuruvilla    - 98574623622"));
        floor6.add(new PersonNames("jumbo singh        - 39926762983"));
        floor6.add(new PersonNames("Gita Chhabra       - 47149433874"));
        floor6.add(new PersonNames("Rajesh Palla       - 20l13763311"));
        floor6.add(new PersonNames("Anit Chaudhuri     - 42051824951"));
        floor6.add(new PersonNames("Apurva Chahal      - 23466495395"));
        floor6.add(new PersonNames("Aditi Cherian      - 44375775277"));




        ArrayList<PersonNames> floor7= new ArrayList<>();

        floor7.add(new PersonNames("Varsha Raja       - 52410754775"));
        floor7.add(new PersonNames("Sima Narula       - 2538707732"));
        floor7.add(new PersonNames("Arnav Nazareth    - 80043306230"));
        floor7.add(new PersonNames("Ravindra Jain     - 40648622580"));
        floor7.add(new PersonNames("Karthik Thakur    - 52301508408"));
        floor7.add(new PersonNames("Sanjit Oak        - 42419525453"));
        floor7.add(new PersonNames("Parvati Srinivas  - 60250875052"));
        floor7.add(new PersonNames("Devika Sant       - 07781742004"));
        floor7.add(new PersonNames("Akshay Nigam      - 59370183540"));









        floors.add(new Floor("Block A", floor1));
        floors.add(new Floor("Block B", floor2));
        floors.add(new Floor("Block C", floor3));
        floors.add(new Floor("Block D", floor4));
        floors.add(new Floor("Block E", floor5));
        floors.add(new Floor("Block F", floor6));
        floors.add(new Floor("Block G", floor7));


    }
}