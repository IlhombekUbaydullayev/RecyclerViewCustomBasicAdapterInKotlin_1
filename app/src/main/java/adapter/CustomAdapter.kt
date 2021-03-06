package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewinkotlin.R
import model.Member

class CustomAdapter(val members: List<Member>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_custom_layout,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val member = members[position]

        if (holder is CustomViewHolder) {
            holder.first_name.text = member.firstName
            holder.last_name.text = member.lastName
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }
}

class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
     val first_name = itemView.findViewById<TextView>(R.id.first_name)
     val last_name = itemView.findViewById<TextView>(R.id.last_name)
}
