package com.example.app2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app2.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var valorantList: ArrayList<ValorantModel>


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val breach = ValorantModel("Breach", getString(R.string.breaach), R.drawable.breach)
        val brimstone =
            ValorantModel("Brimstone", getString(R.string.brimstone), R.drawable.brimstone)
        val cypher = ValorantModel("Cypher", getString(R.string.cpyher), R.drawable.cypher)
        val jett = ValorantModel("Jett", getString(R.string.jett), R.drawable.jett)
        val omen = ValorantModel("Omen", getString(R.string.omen), R.drawable.omen)
        val phoenix = ValorantModel("Phoenix", getString(R.string.phoenix), R.drawable.phoenix)
        val raze = ValorantModel("Raze", getString(R.string.raze), R.drawable.raze)
        val sage = ValorantModel("Sage", getString(R.string.sage), R.drawable.sage)





        valorantList = ArrayList<ValorantModel>()

        valorantList.add(breach)
        valorantList.add(brimstone)
        valorantList.add(cypher)
        valorantList.add(jett)
        valorantList.add(omen)
        valorantList.add(phoenix)
        valorantList.add(raze)
        valorantList.add(sage)



        binding.apply {
            rv.setHasFixedSize(true)
            rv.layoutManager =
                GridLayoutManager(requireContext(), 2, GridLayoutManager.VERTICAL, false)
            rv.adapter = ValorantAdapter(requireContext(), valorantList)
        }


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}