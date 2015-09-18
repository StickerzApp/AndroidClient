package br.com.android.stickerz.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

import br.com.android.stickerz.R;
import br.com.android.stickerz.domain.Campaign;
import br.com.android.stickerz.util.FontUtils;

/**
 * Created by brunolemgruber on 12/09/15.
 */
public class CampaignAdapter extends RecyclerView.Adapter<CampaignAdapter.CampaignViewHolder>  {

    protected static final String TAG = "stickerz";
    private final List<Campaign> campaigns;
    private final Context context;

    private CampaignOnClickListener campaignOnClickListener;

    public CampaignAdapter(Context context, List<Campaign> campaigns, CampaignOnClickListener campaignOnClickListener) {
        this.context = context;
        this.campaigns = campaigns;
        this.campaignOnClickListener = campaignOnClickListener;
    }

    @Override
    public int getItemCount() {
        return this.campaigns != null ? this.campaigns.size() : 0;
    }

    @Override
    public CampaignViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Infla a view do layout
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_campaign, viewGroup, false);

        CardView cardView = (CardView) view.findViewById(R.id.card_view);

        // Cria o ViewHolder
        CampaignViewHolder holder = new CampaignViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final CampaignViewHolder holder, final int position) {
        // Atualiza a view
        Campaign c = campaigns.get(position);

        holder.tName.setText(c.getNome());
        holder.tName.setTypeface(FontUtils.getBold(context));
        holder.tDescription.setText(c.getDescricao());
        holder.tDescription.setTypeface(FontUtils.getRegular(context));
        holder.tLevel.setText(c.getNiveis());
        holder.tLevel.setTypeface(FontUtils.getBold(context));
        holder.progress.setVisibility(View.VISIBLE);

        Picasso.with(context).load(c.getImagem()).fit().into(holder.img, new Callback() {
            @Override
            public void onSuccess() {
                holder.progress.setVisibility(View.GONE);
            }

            @Override
            public void onError() {
                holder.progress.setVisibility(View.GONE);
            }
        });

        // Click
        if (campaignOnClickListener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    campaignOnClickListener.onClickCampaign(holder.itemView, position); // A variável position é final
                }
            });
        }
    }

    public interface CampaignOnClickListener {
        public void onClickCampaign(View view, int idx);
    }

    // ViewHolder com as views
    public static class CampaignViewHolder extends RecyclerView.ViewHolder {
        public TextView tName,tDescription,tLevel;
        ImageView img;
        ProgressBar progress;


        public CampaignViewHolder(View view) {
            super(view);
            // Cria as views para salvar no ViewHolder
            tName = (TextView) view.findViewById(R.id.company);
            tDescription = (TextView) view.findViewById(R.id.description);
            tLevel = (TextView) view.findViewById(R.id.level);
            img = (ImageView) view.findViewById(R.id.image);
            progress = (ProgressBar) view.findViewById(R.id.progressImg);

        }
    }
}
