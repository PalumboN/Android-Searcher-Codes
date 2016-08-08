package com.rastas.android.searcher.codes;

import android.content.Context;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SearchActivity extends AppCompatActivity {

    private ListView listView;
    private MyAppAdapter myAppAdapter;
    private ArrayList<Post> postArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        listView= (ListView) findViewById(R.id.listView);
        postArrayList=new ArrayList<>();

        postArrayList.add(new Post("Altas \n Código actual: 1275", "Acometida reconectada"));
        postArrayList.add(new Post("Altas \n Código actual: 700145", "aco. dom. sub. en country"));
        postArrayList.add(new Post("Altas \n Código actual: 70501", "Acometida solo internet"));
        postArrayList.add(new Post("Altas \n Código actual: 1285", "Instalar acometida"));
        postArrayList.add(new Post("Altas \n Código actual: 6175", "Instalar acometida coaxil"));
        postArrayList.add(new Post("Altas \n Código actual: 70500", "Reconectar de tap Acometida"));
        postArrayList.add(new Post("Altas \n Código actual: 1291", "Instalar Boca Catv"));
        postArrayList.add(new Post("Altas \n Código actual: 1292", "Instalar boca catv Externa"));
        postArrayList.add(new Post("Altas \n Código actual: 1293", "Instalar Boca CM"));
        postArrayList.add(new Post("Altas \n Código actual: 1299", "Instalar Boca UTP"));
        postArrayList.add(new Post("Altas \n Código actual: 6178", "Instalar Boca CM Coaxial"));
        postArrayList.add(new Post("Altas \n Código actual: 50900", "Instalar Boca CM Externa"));
        postArrayList.add(new Post("Altas \n Código actual: 70502", "Boca Internet sin Acometida"));
        postArrayList.add(new Post("Altas \n Código actual: 1277", "Boca CATV Reconectada "));
        postArrayList.add(new Post("Altas \n Código actual: 1687", "Boca CM Reconectada"));
        postArrayList.add(new Post("Altas \n Código actual: 155193", "Boca CM Reconectada s/acometida"));
        postArrayList.add(new Post("Altas \n Código actual: 4841", "Instalar Cablemodem 3.0"));
        postArrayList.add(new Post("Altas \n Código actual: 4842", "Instalar Cablemodem 3.0 Wifi"));
        postArrayList.add(new Post("Altas \n Código actual: 800751", "Instalar Cablemodem Evolution"));
        postArrayList.add(new Post("Altas \n Código actual: 800752", "Instalar Cablemodem Wifi Gold"));
        postArrayList.add(new Post("Altas \n Código actual: 1300", "Instalar Cablemodem"));
        postArrayList.add(new Post("Altas \n Código actual: 1301", "Instalar Cablemodem Wifi"));
        postArrayList.add(new Post("Altas \n Código actual: 1305", "Instalar Deco Digital"));
        postArrayList.add(new Post("Altas \n Código actual: 1309", "Instalar Deco DVR HD"));
        postArrayList.add(new Post("Altas \n Código actual: 1314", "Instalar Deco HD"));
        postArrayList.add(new Post("Altas \n Código actual: 700146", "Instalar Deco DTA"));
        postArrayList.add(new Post("Altas \n Código actual: 1317", "Instalar Emta"));
        postArrayList.add(new Post("Altas \n Código actual: 700161", "Recambio de equipo No Apto"));
        postArrayList.add(new Post("Altas \n Código actual: 700974", "Cambiar equipo por 3.0"));
        postArrayList.add(new Post("Altas \n Código actual: 70503", "076-se instalo Amplificador Domiciliario"));
        postArrayList.add(new Post("Altas \n Código actual: 6470", "Instalar Extensor Wifi"));

        postArrayList.add(new Post("Reinstalaciones \n Código actual: 1435", "068-Se Reinstalo Boca Externa"));
        postArrayList.add(new Post("Reinstalaciones \n Código actual: 2644", "060-Se cambio Boca de lugar"));
        postArrayList.add(new Post("Reinstalaciones \n Código actual: 2647", "069-Se Reinstalo Boca interna"));
        postArrayList.add(new Post("Reinstalaciones \n Código actual: 2648", "070-Se reinstalo Acometida"));
        postArrayList.add(new Post("Reinstalaciones \n Código actual: 1518", "037-Reinstalar Acometida"));
        postArrayList.add(new Post("Reinstalaciones \n Código actual: 2651", "075-Se reinstalo completamente"));
        postArrayList.add(new Post("Reinstalaciones \n Código actual: 1550", "071-Se reinstalo por cañeria"));
        postArrayList.add(new Post("Reinstalaciones \n Código actual: 70600", "079-Se reinstalo Parcial Acometida"));
        postArrayList.add(new Post("Reinstalaciones \n Código actual: 70503", "076-Se reinstalo Amplificador Domiciliario"));
        postArrayList.add(new Post("Reinstalaciones \n Código actual: 1604", "150-Se cambio Cablemodem"));
        postArrayList.add(new Post("Reinstalaciones \n Código actual: 2042", "008-Se cambio Decodificador"));
        postArrayList.add(new Post("Reinstalaciones \n Código actual: 800011", "Reinstalacion con movil flotante"));
        postArrayList.add(new Post("Reinstalaciones \n Código actual: 800752", "Reinstalacion boca interna con movil flotante"));
        postArrayList.add(new Post("Reinstalaciones \n Código actual: 800726", "Reinstalacion acometida con movil flotante "));

        postArrayList.add(new Post("Edificios \n Código actual: 1542", "063-Colocar Amplificador de Edificio"));
        postArrayList.add(new Post("Edificios \n Código actual: 1543", "064-Colocar Caja Estanca"));
        postArrayList.add(new Post("Edificios \n Código actual: 1544", "065-Instalar linga"));
        postArrayList.add(new Post("Edificios \n Código actual: 1545", "066-Reinstalar Subida RG11"));
        postArrayList.add(new Post("Edificios \n Código actual: 1546", "067-Instalar Cable 220v"));
        postArrayList.add(new Post("Edificios \n Código actual: 1547", "068-Instalar subida RG6"));
        postArrayList.add(new Post("Edificios \n Código actual: 1549", "070-Reinstalar caja"));
        postArrayList.add(new Post("Edificios \n Código actual: 1580", "101-Armar Montante"));
        postArrayList.add(new Post("Edificios \n Código actual: 1587", "120-Normalizar Caja Estanca"));
        postArrayList.add(new Post("Edificios \n Código actual: 820", "R585F-Reordenar o conectar manguera en edificio"));
        postArrayList.add(new Post("Edificios \n Código actual: 1581", "102-Pasar cliente a otra caja"));
        postArrayList.add(new Post("Edificios \n Código actual: 599", "R252F-"));
        postArrayList.add(new Post("Edificios \n Código actual: 850", "R613 F-Desmontar/recuperar ampl. edif"));
        postArrayList.add(new Post("Edificios \n Código actual: 851", "R614 Desmontar/recuperar caja estanca"));

        postArrayList.add(new Post("Imcumplimiento \n Código actual: 304", "400-Ausente en agenda"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 305", "401-Ausente Titular"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 307", "403-Cuestiones metereologicas"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 311", "407-Falla controladora"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 312", "408-Falla en zona"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 313", "409-Fuera de norma"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 314", "410-Impedimiento Tecnico"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 315", "411-Mal direccion/datos"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 316", "412-No acusa defecto"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 317", "413-No lo quiere"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 319", "415-Ot mal agendada"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 320", "416-Pospone"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 321", "417-Problema de inst. propia"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 322", "418-Se mudaron"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 324", "420-Sin acceso"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 325", "421-Zona peligrosa"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 326", "422-Fuera de zona"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 327", "423-Edificio sin armar"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 335", "431-Mal asignado"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 337", "433-Sin credencial"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 338", "434-Cl. se mudo, equipo sin recuperar"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 340", "436-No quiere entregar el equipo"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 341", "437-Dice haber entregado el equipo"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 344", "441-Colectiva Interna"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 345", "442-Consorcio"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 346", "443-Sin Identificar"));
        postArrayList.add(new Post("Imcumplimiento \n Código actual: 347", "444- Sin Visitar"));

        postArrayList.add(new Post("Desconexiones \n Código actual: 70585", "Desconexion de serv. adicional"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1279", "Desconectar acometida en Tap"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1283", "Filtrar acometida por Mora"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1284", "Filtrar acometids por voluntaria"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1329", "Retirar por mora Acometida"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1333", "Retirar por mora Boca Catv"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1334", "Retirar por moda Boca CM"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1339", "Retirar por mora Cablemodem"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1340", "Retirar por mora Cabledemodem Wifi"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1341", "Retirar por mora Deco Analogico"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1342", "Retirar por mora Deco Digital"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1343", "Retirar por mora Deco DVR"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1344", "Retirar por mora Deco DVR HD"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1345", "Retirar por mora Deco HD"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1346", "Retirar por mora Emta"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1361", "Retirar por voluntaria Acometida"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1365", "Retirar por voluntaria Boca CATV"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1366", "Retirar por voluntaria Boca CM"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1371", "Retirar por voluntaria Cablemodem"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1372", "Retirar por voluntaria Cablemodem Wifi"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1373", "Retirar por voluntaria Deco Analogico"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1374", "Retirar por voluntaria Deco Digital"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1375", "Retirar por voluntaria Deco DVR"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1376", "Retirar por voluntaria Deco DVR HD"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1377", "Retirar por voluntaria Deco HD"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 1378", "Retirar por voluntaria Emta"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 2036", "Desconexion Boca CM Externa"));
        postArrayList.add(new Post("Desconexiones \n Código actual: 2037", "Desconexion Boca Externa"));


        myAppAdapter=new MyAppAdapter(postArrayList,SearchActivity.this);
        listView.setAdapter(myAppAdapter);
    }

    public class MyAppAdapter extends BaseAdapter {

        public class ViewHolder {
            TextView txtTitle,txtSubTitle;


        }

        public List<Post> parkingList;

        public Context context;
        ArrayList<Post> arraylist;

        private MyAppAdapter(List<Post> apps, Context context) {
            this.parkingList = apps;
            this.context = context;
            arraylist = new ArrayList<Post>();
            arraylist.addAll(parkingList);

        }

        @Override
        public int getCount() {
            return parkingList.size();
        }

        @Override
        public Object getItem(int position) {
            return parkingList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return parkingList.get(position).hashCode();
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            View rowView = convertView;
            ViewHolder viewHolder;

            if (rowView == null) {
                LayoutInflater inflater = getLayoutInflater();
                rowView = inflater.inflate(R.layout.item_post, null);
                // configure view holder
                viewHolder = new ViewHolder();
                viewHolder.txtTitle = (TextView) rowView.findViewById(R.id.title);
                viewHolder.txtSubTitle = (TextView) rowView.findViewById(R.id.subtitle);
                rowView.setTag(viewHolder);

            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }

            viewHolder.txtTitle.setText(parkingList.get(position).getPostTitle() + "");
            viewHolder.txtSubTitle.setText(parkingList.get(position).getPostSubTitle() + "");
            return rowView;


        }

        public void filter(String charText) {

            charText = charText.toLowerCase(Locale.getDefault());

            parkingList.clear();
            if (charText.length() == 0) {
                parkingList.addAll(arraylist);

            } else {
                for (Post postDetail : arraylist) {
                    if (charText.length() != 0 && postDetail.getPostTitle().toLowerCase(Locale.getDefault()).contains(charText)) {
                        parkingList.add(postDetail);
                    }

                    else if (charText.length() != 0 && postDetail.getPostSubTitle().toLowerCase(Locale.getDefault()).contains(charText)) {
                        parkingList.add(postDetail);
                    }
                }
            }
            notifyDataSetChanged();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        //*** setOnQueryTextFocusChangeListener ***
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {

            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String searchQuery) {
                myAppAdapter.filter(searchQuery.toString().trim());
                listView.invalidate();
                return true;
            }
        });

        MenuItemCompat.setOnActionExpandListener(searchItem, new MenuItemCompat.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                // Do something when collapsed
                return true;  // Return true to collapse action view
            }

            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                // Do something when expanded
                return true;  // Return true to expand action view
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
