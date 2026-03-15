package com.example.rickandmorty.ui.detail

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class CharacterDetailFragmentArgs(
  public val characterId: Int,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("characterId", this.characterId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("characterId", this.characterId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CharacterDetailFragmentArgs {
      bundle.setClassLoader(CharacterDetailFragmentArgs::class.java.classLoader)
      val __characterId : Int
      if (bundle.containsKey("characterId")) {
        __characterId = bundle.getInt("characterId")
      } else {
        throw IllegalArgumentException("Required argument \"characterId\" is missing and does not have an android:defaultValue")
      }
      return CharacterDetailFragmentArgs(__characterId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        CharacterDetailFragmentArgs {
      val __characterId : Int?
      if (savedStateHandle.contains("characterId")) {
        __characterId = savedStateHandle["characterId"]
        if (__characterId == null) {
          throw IllegalArgumentException("Argument \"characterId\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"characterId\" is missing and does not have an android:defaultValue")
      }
      return CharacterDetailFragmentArgs(__characterId)
    }
  }
}
