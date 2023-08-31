package com.example.callscreentheme.Fragment

import android.annotation.SuppressLint
import android.app.Activity.RESULT_OK
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.callscreentheme.Adapter.DiyThemeListAdapter
import com.example.callscreentheme.R
import com.example.callscreentheme.databinding.FragmentDiyThemeBinding
import com.example.callscreentheme.premiumActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.annotations.Nullable
import com.google.firebase.storage.StorageReference


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DiyThemeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DiyThemeFragment : Fragment() {
    var binding = FragmentDiyThemeBinding.inflate(layoutInflater)

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    var diyimg = arrayOf(
        R.drawable.diybg1,
        R.drawable.diybg2,
        R.drawable.diybg3,
        R.drawable.diybg4,
        R.drawable.diybg5,
        R.drawable.diybg6,
        R.drawable.diybg7,
        R.drawable.diybg8,
        R.drawable.diybg9,
        R.drawable.diybg10
    )

    lateinit var uri: Uri


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentDiyThemeBinding.inflate(layoutInflater)
        binding.recycler1.layoutManager = GridLayoutManager(context, 2)
        binding.recycler1.adapter = DiyThemeListAdapter(diyimg)

        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, 21)
        binding.avatar1.setOnClickListener {
            val galleryIntent = Intent(Intent.ACTION_PICK)
            galleryIntent.type = "image/*"
            startActivityForResult(galleryIntent, 21)
        }

        binding.premium.setOnClickListener {
            startActivity(Intent(context, premiumActivity::class.java))
        }
        return binding.root
    }

    private fun onActivityResult(
        galleryIntent: Intent,
        requestCode: Int,
        resultCode: Int,
        data: Intent
    ) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK) {
            if (requestCode == 21) {
                uri = data.data!!
                binding.avatar1.setImageURI(uri)
//                binding.avatar1.setImagResource(uri)
            }
        }
    }


    companion object {
            @JvmStatic
            fun newInstance(param1: String, param2: String) =
                DiyThemeFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}