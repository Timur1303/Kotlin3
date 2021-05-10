package kg.timur.app.kotlin3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kg.timur.app.kotlin3.R
import kg.timur.app.kotlin3.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment() {

    companion object {
        fun newInstance() = FirstFragment()
    }

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_add.setOnClickListener {
            viewModel.onIncrementClick()
        }

        btn_min.setOnClickListener {
            viewModel.onSubtractionClick()
        }
    }




}