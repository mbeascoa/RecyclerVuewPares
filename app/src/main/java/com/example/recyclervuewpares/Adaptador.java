package com.example.recyclervuewpares;




import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/*
Creamos una clase Llamada Adaptador con las siguientes características:

        Heredará de la clase RecyclerView.Adapter que contendrá los atributos que permitan guardar las referencias a los distintos widgets del layout.

        extends RecyclerView.Adapter<Adaptador.ViewHolder>
*/

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private List<Clientes> listaClientes;

    public Adaptador(List<Clientes> ListaCliente) {
        this.listaClientes = ListaCliente;
    }


   /* Sobreescribiremos el método onCreateViewHolder() que será quien devuelva el ViewHolder con el layout que pretendemos mostrar sobre el RecyclerView.


    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_datos, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }
*/

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listado_datos, parent, false);  //hemos creado el lista_datos en xml
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    /* Sobreescribiremos el método onBindViewHolder() que será quien se encargue de establecer los objetos en el ViewHolder y la posición.

    public void onBindViewHolder(ViewHolder holder, int position) {
        String nombre = listaClientes.get(position).getNombre();
        holder.txtnombre.setText(nombre);
    position devuelve la posicion de las filas del array, se ejecuta por cad fila que se ejecuta del recycler view}
    */

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String nombre = listaClientes.get(position).getNombre();
        String mage = listaClientes.get(position).getMage();
        holder.txtnombre.setText(nombre);
        holder.txtMage.setText(mage);

    }

   /* Sobreescribiremos el método getItemCount que devolverá el número de elementos de la lista.


    public int getItemCount() {
        return listaClientes.size();
    }
    // el número de registros que tiene el recycler view para que los pinte.
    */

    @Override
    public int getItemCount() {
        return listaClientes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtnombre;
        private TextView txtMage;

        public ViewHolder(View v) {
            super(v);
            txtnombre = (TextView) v.findViewById(R.id.txtNombre);
            txtMage = (TextView) v.findViewById(R.id.txtAge);
        }
    }
}

