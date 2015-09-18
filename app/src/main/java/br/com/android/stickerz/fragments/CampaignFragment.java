package br.com.android.stickerz.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import br.com.android.stickerz.R;
import br.com.android.stickerz.activity.CampaignActivity;
import br.com.android.stickerz.adapter.CampaignAdapter;
import br.com.android.stickerz.domain.Campaign;
import br.com.android.stickerz.domain.CampaignService;

/**
 * Created by brunolemgruber on 12/09/15.
 */
public class CampaignFragment extends BaseFragment {

    protected RecyclerView recyclerView;
    private List<Campaign> campaigns;
    private LinearLayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_campaign, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        taskCampaign();
    }

    private void taskCampaign() {
        // Busca as campanhas
        this.campaigns = CampaignService.getCampaign(getContext());
        // Atualiza a lista
        recyclerView.setAdapter(new CampaignAdapter(getContext(), campaigns, onClickCampaign()));
    }

    private CampaignAdapter.CampaignOnClickListener onClickCampaign() {
        return new CampaignAdapter.CampaignOnClickListener() {
            @Override
            public void onClickCampaign(View view, int idx) {
                Campaign c = campaigns.get(idx);
                Intent intent = new Intent(getContext(), CampaignActivity.class);
                intent.putExtra("campaign", c);
                //startActivity(intent);
                Toast.makeText(getContext(), "Campaign: " + c.getNome(), Toast.LENGTH_SHORT).show();
            }
        };
    }

}
