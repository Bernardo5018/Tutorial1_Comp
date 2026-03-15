package com.example.rickandmorty.ui.list

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.rickandmorty.R
import kotlin.Int

public class CharacterListFragmentDirections private constructor() {
  private data class ActionListToDetail(
    public val characterId: Int,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_list_to_detail

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("characterId", this.characterId)
        return result
      }
  }

  public companion object {
    public fun actionListToDetail(characterId: Int): NavDirections = ActionListToDetail(characterId)
  }
}
