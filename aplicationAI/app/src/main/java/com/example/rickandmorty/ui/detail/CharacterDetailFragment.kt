package com.example.rickandmorty.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import coil.load
import coil.transform.RoundedCornersTransformation
import com.example.rickandmorty.data.repository.CharacterRepository
import com.example.rickandmorty.databinding.FragmentCharacterDetailBinding
import kotlinx.coroutines.launch

class CharacterDetailFragment : Fragment() {

    private var _binding: FragmentCharacterDetailBinding? = null
    private val binding get() = _binding!!

    private var characterId: Int = 1
    private val repository = CharacterRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCharacterDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        arguments?.let {
            characterId = it.getInt("characterId", 1)
        }

        loadCharacterDetail(characterId)
    }

    private fun loadCharacterDetail(id: Int) {
        binding.progressBarDetail.visibility = View.VISIBLE
        lifecycleScope.launch {
            try {
                val response = repository.getCharacter(id)
                if (response.isSuccessful) {
                    response.body()?.let { character ->
                        binding.tvNameDetail.text = character.name
                        binding.tvSpeciesDetail.text = "Species: ${character.species}"
                        binding.tvOriginDetail.text = "Origin: ${character.origin.name}"
                        binding.tvLocationDetail.text = "Location: ${character.location.name}"
                        
                        binding.ivAvatarDetail.load(character.image) {
                            crossfade(true)
                            transformations(RoundedCornersTransformation(16f))
                        }
                    }
                } else {
                    Toast.makeText(context, "Error fetching detail", Toast.LENGTH_SHORT).show()
                }
            } catch (e: Exception) {
                Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
            } finally {
                binding.progressBarDetail.visibility = View.GONE
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
