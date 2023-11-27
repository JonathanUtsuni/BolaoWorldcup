package com.example.bolaoworldcup;

import static com.example.bolaoworldcup.NomePaises.atualizaTimea;
import static com.example.bolaoworldcup.NomePaises.atualizaTimeb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class Tela_Principal extends AppCompatActivity {
    private SQLiteDatabase bancoDados;
    public ListView listViewDados;

    private Spinner spinner;
    private Spinner spinner2;
    private ImageView imageBandeira1;
    private ImageView imageBandeira2;

    private void setFlagImageAndContentDescription(int position, ImageView imageView) {
        switch (position) {
            case 0:
                imageView.setImageResource(R.drawable.flag_alemanha);
                imageView.setContentDescription("Bandeira da Alemanha");
                break;
            case 1:
                imageView.setImageResource(R.drawable.flag_arabia_saudita);
                imageView.setContentDescription("Bandeira da Arábia Saudita");
                break;
            case 2:
                imageView.setImageResource(R.drawable.flag_argentina);
                imageView.setContentDescription("Bandeira da Argentina");
                break;
            case 3:
                imageView.setImageResource(R.drawable.flag_australia);
                imageView.setContentDescription("Bandeira da Austrália");
                break;
            case 4:
                imageView.setImageResource(R.drawable.flag_belgica);
                imageView.setContentDescription("Bandeira da Bélgica");
                break;
            case 5:
                imageView.setImageResource(R.drawable.flag_brasil);
                imageView.setContentDescription("Bandeira do Brasil");
                break;
            case 6:
                imageView.setImageResource(R.drawable.flag_camaroes);
                imageView.setContentDescription("Bandeira de Camarões");
                break;
            case 7:
                imageView.setImageResource(R.drawable.flag_canada);
                imageView.setContentDescription("Bandeira do Canadá");
                break;
            case 8:
                imageView.setImageResource(R.drawable.flag_catar);
                imageView.setContentDescription("Bandeira do Catar");
                break;
            case 9:
                imageView.setImageResource(R.drawable.flag_coreia_do_sul);
                imageView.setContentDescription("Bandeira da Coréia do Sul");
                break;
            case 10:
                imageView.setImageResource(R.drawable.flag_costa_rica);
                imageView.setContentDescription("Bandeira da Costa Rica");
                break;
            case 11:
                imageView.setImageResource(R.drawable.flag_croacia);
                imageView.setContentDescription("Bandeira da Croácia");
                break;
            case 12:
                imageView.setImageResource(R.drawable.flag_dinamarca);
                imageView.setContentDescription("Bandeira da Dinamarca");
                break;
            case 13:
                imageView.setImageResource(R.drawable.flag_equador);
                imageView.setContentDescription("Bandeira do Equador");
                break;
            case 14:
                imageView.setImageResource(R.drawable.flag_espanha);
                imageView.setContentDescription("Bandeira da Espanha");
                break;
            case 15:
                imageView.setImageResource(R.drawable.flag_estados_unidos);
                imageView.setContentDescription("Bandeira dos Estados Unidos");
                break;
            case 16:
                imageView.setImageResource(R.drawable.flag_franca);
                imageView.setContentDescription("Bandeira da França");
                break;
            case 17:
                imageView.setImageResource(R.drawable.flag_gana);
                imageView.setContentDescription("Bandeira de Gana");
                break;
            case 18:
                imageView.setImageResource(R.drawable.flag_holanda);
                imageView.setContentDescription("Bandeira da Holanda");
                break;
            case 19:
                imageView.setImageResource(R.drawable.flag_inglaterra);
                imageView.setContentDescription("Bandeira da Inglaterra");
                break;
            case 20:
                imageView.setImageResource(R.drawable.flag_ira);
                imageView.setContentDescription("Bandeira do Irã");
                break;
            case 21:
                imageView.setImageResource(R.drawable.flag_japao);
                imageView.setContentDescription("Bandeira do Japão");
                break;
            case 22:
                imageView.setImageResource(R.drawable.flag_marrocos);
                imageView.setContentDescription("Bandeira de Marrocos");
                break;
            case 23:
                imageView.setImageResource(R.drawable.flag_mexico);
                imageView.setContentDescription("Bandeira do México");
                break;
            case 24:
                imageView.setImageResource(R.drawable.flag_pais_de_gales);
                imageView.setContentDescription("Bandeira do País de Gales");
                break;
            case 25:
                imageView.setImageResource(R.drawable.flag_polonia);
                imageView.setContentDescription("Bandeira da Polônia");
                break;
            case 26:
                imageView.setImageResource(R.drawable.flag_portugal);
                imageView.setContentDescription("Bandeira de Portugal");
                break;
            case 27:
                imageView.setImageResource(R.drawable.flag_senegal);
                imageView.setContentDescription("Bandeira do Senegal");
                break;
            case 28:
                imageView.setImageResource(R.drawable.flag_servia);
                imageView.setContentDescription("Bandeira da Sérvia");
                break;
            case 29:
                imageView.setImageResource(R.drawable.flag_suica);
                imageView.setContentDescription("Bandeira da Suiça");
                break;
            case 30:
                imageView.setImageResource(R.drawable.flag_tunisia);
                imageView.setContentDescription("Bandeira da Tunísia");
                break;
            case 31:
                imageView.setImageResource(R.drawable.flag_uruguai);
                imageView.setContentDescription("Bandeira do Uruguai");
                break;
        }
    }

    private void setTextAndContentDescription(String numberValue, String prefix, TextView textViewNumber, TextView label, TextView container) {
        textViewNumber.setText(numberValue);
        String foraContentDescription = prefix + numberValue;
        textViewNumber.setContentDescription(foraContentDescription);
        label.setContentDescription(foraContentDescription);
        container.setContentDescription(foraContentDescription);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);


        listViewDados = (ListView) findViewById(R.id.listViewDados);



        spinner=findViewById(R.id.spinner);
        spinner2=findViewById(R.id.spinner2);
        imageBandeira1 =findViewById(R.id.imageBandeira1);
        imageBandeira2 =findViewById(R.id.imageBandeira2);


        String[] bandeiras = {"Alemanha","Arábia Saudita","Argentina","Austrália","Bélgica",
                "Brasil","Camarões","Canadá","Catar","Coreia do Sul","Costa Rica","Croácia",
                "Dinamarca","Equador","Espanha","Estados Unidos","França","Gana","Holanda",
                "Inglaterra","Irã","Japão","Marrocos","México","País de Gales","Polônia",
                "Portugal","Senegal","Sérvia","Suíça","Tunísia","Uruguai"};

        ArrayAdapter<String>adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,bandeiras);


        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);

        spinner.post(new Runnable() {
            @Override
            public void run() {
                spinner.setSelection(5);
            }
        });

        spinner2.post(new Runnable() {
            @Override
            public void run() {
                spinner2.setSelection(16);
            }
        });


        final TextView casa = super.findViewById(R.id.id_casa);
        final TextView textViewCasa = super.findViewById(R.id.textViewCasa);
        final TextView viewCasa = super.findViewById(R.id.viewCasa);

        final TextView empate = super.findViewById(R.id.id_empate);
        final TextView textViewEmpate = super.findViewById(R.id.textViewEmpate);
        final TextView viewEmpate = super.findViewById(R.id.viewEmpate);

        final TextView fora = super.findViewById(R.id.id_fora);
        final TextView textViewFora = super.findViewById(R.id.textViewFora);
        final TextView viewFora = super.findViewById(R.id.viewFora);

        final Spinner text_spinner = (Spinner)findViewById(R.id.spinner);
        final Spinner text_spinner2 = (Spinner)findViewById(R.id.spinner2);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                setFlagImageAndContentDescription(position, imageBandeira1);

                String timea = text_spinner.getSelectedItem().toString();
                String timeb = text_spinner2.getSelectedItem().toString();

                timea = atualizaTimea(timea);
                timeb = atualizaTimeb(timeb);

                TaskAPI taskAPI = new TaskAPI(Tela_Principal.this, timea, timeb,
                        new TaskAPI.AsyncResponse() {
                            @Override
                            public void processFinish(GameResult gameResult) {
                                setTextAndContentDescription(String.format("%.0f",gameResult.getLoose()*100)+"%", "Fora ", fora, textViewFora, viewFora);
                                setTextAndContentDescription(String.format("%.0f",gameResult.getWin()*100)+"%", "Casa ", casa, textViewCasa, viewCasa);
                                setTextAndContentDescription(String.format("%.0f",gameResult.getDraw()*100)+"%", "Empate ", empate, textViewEmpate, viewEmpate);
                            }
                        });

                taskAPI.execute();

                try{

                    AcessoBancoDados acessobancodados=AcessoBancoDados.getInstance(getApplicationContext());
                    acessobancodados.abrir();

                    String casa = text_spinner.getSelectedItem().toString();
                    String fora = text_spinner2.getSelectedItem().toString();
                    String retorno_data = acessobancodados.retornaDados(casa,fora); //Retorno banco de dados


                    String [] elementos = retorno_data.split(";");

                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(Tela_Principal.this, android.R.layout.simple_list_item_1, elementos);

                    listViewDados.setAdapter(adapter2);

                }catch (Exception e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });



        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                setFlagImageAndContentDescription(position, imageBandeira2);


                String timea = text_spinner.getSelectedItem().toString();
                String timeb = text_spinner2.getSelectedItem().toString();

                timea = atualizaTimea(timea);
                timeb = atualizaTimeb(timeb);

                TaskAPI taskAPI = new TaskAPI(Tela_Principal.this, timea, timeb,
                        new TaskAPI.AsyncResponse() {
                            @Override
                            public void processFinish(GameResult gameResult) {
                                setTextAndContentDescription(String.format("%.0f",gameResult.getLoose()*100)+"%", "Fora ", fora, textViewFora, viewFora);
                                setTextAndContentDescription(String.format("%.0f",gameResult.getWin()*100)+"%", "Casa ", casa, textViewCasa, viewCasa);
                                setTextAndContentDescription(String.format("%.0f",gameResult.getDraw()*100)+"%", "Empate ", empate, textViewEmpate, viewEmpate);
                            }
                        });

                taskAPI.execute();

                try{

                    AcessoBancoDados acessobancodados=AcessoBancoDados.getInstance(getApplicationContext());
                    acessobancodados.abrir();

                    String casa = text_spinner.getSelectedItem().toString();
                    String fora = text_spinner2.getSelectedItem().toString();
                    String retorno_data = acessobancodados.retornaDados(casa,fora); //Retorno banco de dados


                    String [] elementos = retorno_data.split(";");

                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(Tela_Principal.this, android.R.layout.simple_list_item_1, elementos);

                    listViewDados.setAdapter(adapter2);

                }catch (Exception e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });


    }

}