package com.example.rickandmorty.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.example.rickandmorty.data.model.Character
import com.example.rickandmorty.databinding.ItemCharacterBinding

class CharacterAdapter(
    private val onItemClick: (Character) -> Unit
) : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    private var characters = listOf<Character>()

    fun submitList(newList: List<Character>) {
        characters = newList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val binding = ItemCharacterBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return CharacterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(characters[position])
    }

    override fun getItemCount() = characters.size

    inner class CharacterViewHolder(private val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(character: Character) {
            binding.tvName.text = character.name
            binding.tvStatus.text = "${character.status} - ${character.species}"
            
            binding.ivAvatar.load(character.image) {
                crossfade(true)
                transformations(CircleCropTransformation())
            }

            binding.root.setOnClickListener {
                onItemClick(character)
            }
        }
    }
}
