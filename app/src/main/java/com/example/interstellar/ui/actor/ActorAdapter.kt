package com.example.interstellar.ui.actor

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.interstellar.R
import com.example.interstellar.business.model.Actor
import com.example.interstellar.misc.inflate

class ActorAdapter: RecyclerView.Adapter<ActorViewHolder>() {

    var actorListener: ((Actor) -> Unit)? = null

    //activity --> transférer WeaponList --> setWeapons( weapons)
    var actors: List<Actor> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
/*        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_weapon, parent, false)*/
        return ActorViewHolder(
            parent.inflate(
                R.layout.item_actor
            )
        )
    }

    override fun getItemCount() = actors.size

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        //val itemList = dataList.get(position) --> Gladiator
        //holder description de ma vue
        val actor = actors[position]
        holder.bindData(actor)
        holder.itemView.setOnClickListener { actorListener?.invoke(actor) }
    }
}

    class ActorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //décrire le contenue d'un item
        private var pictureImv: ImageView = itemView.findViewById(R.id.actor_photo)
        private var roleTxv: TextView = itemView.findViewById(R.id.actor_role)
        private var nameTxv: TextView = itemView.findViewById(R.id.actor_name)

        fun bindData(actor: Actor) {
            val context = itemView.context
            Glide.with(context)
                .load(actor.photo)
                .into(pictureImv)
            roleTxv.text = actor.role
            //nameTxv.text = context.getString(R.string.weapon_name, actor.name)
            nameTxv.text = actor.name
        }
    }
