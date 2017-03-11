package com.example.slymn54.contacttoourworld;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.List;

public class OzelAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    private ImageButton ib,ib1;
    List<Islem> list;
    Activity activity;
    public OzelAdapter(Activity activity,List<Islem>mList) {
        layoutInflater=(LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        list=mList;
        this.activity=activity;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View satirView;

        satirView=layoutInflater.inflate(R.layout.satir,null);

        ImageButton ib0=(ImageButton) satirView.findViewById(R.id.imageButton);
        ImageButton ib1=(ImageButton) satirView.findViewById(R.id.imageButton1);

        final Islem islem=list.get(position);


        ib0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,islem.getIslem().toString()+" chosed",Toast.LENGTH_LONG).show();
                if(islem.getIslem().toString().equals("Siir")) {
                    Intent intent=new Intent(activity,siir.class);
                    v.getContext().startActivity(intent);
                }else if(islem.getIslem().toString().equals("Arama")) {
                    Uri uri = Uri.parse("tel:+905340760294");
                    Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                    v.getContext().startActivity(intent);
                }else if(islem.getIslem().toString().equals("Sms")) {
                    Intent intent=new Intent(activity,sms.class);
                    v.getContext().startActivity(intent);
                }else if(islem.getIslem().toString().equals("Facebook")) {
                    Intent intent = new Intent(activity, facebook.class);
                    v.getContext().startActivity(intent);
                }else if(islem.getIslem().toString().equals("Twitter")) {
                    Intent intent = new Intent(activity, twitter.class);
                    v.getContext().startActivity(intent);
                }else if(islem.getIslem().toString().equals("insta")) {
                    Intent intent = new Intent(activity, insta.class);
                    v.getContext().startActivity(intent);
                }else if(islem.getIslem().toString().equals("GtuMat")) {
                    Intent intent = new Intent(activity, gtumat.class);
                    v.getContext().startActivity(intent);
                }else if(islem.getIslem().toString().equals("Beden Kitle")) {
                    Intent intent = new Intent(activity, Main2Activity.class);
                    v.getContext().startActivity(intent);
                }
            }
        });
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,islem.getSecondIslem().toString()+" chosed",Toast.LENGTH_LONG).show();
                if(islem.getSecondIslem().toString().equals("Siir")) {
                    Intent intent=new Intent(activity,siir.class);
                    v.getContext().startActivity(intent);
                }else if(islem.getSecondIslem().toString().equals("Arama")) {
                    Uri uri = Uri.parse("tel:+905340760294");
                    Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                    v.getContext().startActivity(intent);
                }else if(islem.getSecondIslem().toString().equals("Sms")) {
                    Intent intent=new Intent(activity,sms.class);
                    v.getContext().startActivity(intent);
                }else if(islem.getSecondIslem().toString().equals("Facebook")) {
                    Intent intent = new Intent(activity, facebook.class);
                    v.getContext().startActivity(intent);
                }else if(islem.getSecondIslem().toString().equals("Twitter")) {
                    Intent intent = new Intent(activity, twitter.class);
                    v.getContext().startActivity(intent);
                }else if(islem.getSecondIslem().toString().equals("insta")) {
                    Intent intent = new Intent(activity, insta.class);
                    v.getContext().startActivity(intent);
                }else if(islem.getSecondIslem().toString().equals("GtuMat")) {
                    Intent intent = new Intent(activity, gtumat.class);
                    v.getContext().startActivity(intent);
                }else if(islem.getSecondIslem().toString().equals("Beden Kitle")) {
                    Intent intent = new Intent(activity, Main2Activity.class);
                    v.getContext().startActivity(intent);
                }
            }
        });

        String islem0=islem.getIslem().toString();
        if(islem0.equals("Siir")) {
            ib0.setImageResource(R.drawable.siir);
        }else if(islem0.equals("Arama")) {
            ib0.setImageResource(R.drawable.arama);
        }else if(islem0.equals("Sms")) {
            ib0.setImageResource(R.drawable.sms);
        }else if(islem0.equals("Facebook")) {
            ib0.setImageResource(R.drawable.fb);
        }else if(islem0.equals("Twitter")) {
            ib0.setImageResource(R.drawable.tw);
        }else if(islem0.equals("Beden Kitle")) {
            ib0.setImageResource(R.drawable.bk);
        }else if(islem0.equals("insta")) {
            ib0.setImageResource(R.drawable.it);
        }else if(islem0.equals("GtuMat")) {
            ib0.setImageResource(R.drawable.gtu);
        }

        String islem1=islem.getSecondIslem().toString();
        if(islem1.equals("Siir")) {
            ib1.setImageResource(R.drawable.siir);
        }else if(islem1.equals("Arama")) {
            ib1.setImageResource(R.drawable.arama);
        }else if(islem1.equals("Sms")) {
            ib1.setImageResource(R.drawable.sms);
        }else if(islem1.equals("Facebook")) {
            ib1.setImageResource(R.drawable.fb);
        }else if(islem1.equals("Twitter")) {
            ib1.setImageResource(R.drawable.tw);
        }else if(islem1.equals("Beden Kitle")) {
            ib1.setImageResource(R.drawable.bk);
        }else if(islem1.equals("insta")) {
            ib1.setImageResource(R.drawable.it);
        }else if(islem1.equals("GtuMat")) {
            ib1.setImageResource(R.drawable.gtu);
        }
        return satirView;
    }

}
